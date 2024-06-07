package pl.javastart.task.contracts;

public class MixContract extends Contract {
    private int smsNumber;
    private int mmsNumber;
    private int minutesNumber;
    private double fundsUsed;

    public MixContract(int smsNumber, int mmsNumber, int minutesNumber) {
        this.smsNumber = smsNumber;
        this.mmsNumber = mmsNumber;
        this.minutesNumber = minutesNumber;
    }

    @Override
    void sendSms() {
        if (smsNumber > 0) {
            smsNumber -= 1;
            System.out.println("\nSMS wysłany");
        } else {
            fundsUsed += SMS_COST;
            System.out.println("\nPrzekroczono limit darmowych SMSow");
        }
        smsSents += 1;
    }

    @Override
    void call(int seconds) {
        if (minutesNumber > seconds / 60) {
            minutesNumber = (minutesNumber * 60) - seconds;
            System.out.printf("\nPołączenie trwało %d sekund\n", seconds);
        } else {
            fundsUsed += CALL_COST_PER_MINUTE;
            double minutesAbove = CALL_COST_PER_MINUTE * (((double) seconds - ((double) minutesNumber * 60)) / 60);
            System.out.println("\nPrzekroczono limit darmowych minut naliczono opłatę w wysokości " + (minutesAbove) + "zł");
        }
        secondsUsed += seconds;
    }

    @Override
    void sendMms() {
        if (mmsNumber > 0) {
            mmsNumber -= 1;
            System.out.println("\nMMS Wysłany");
        } else {
            fundsUsed += MMS_COST;
            System.out.println("\nPrzekroczono limit darmowych MMSow");
        }
        mmsSents += 1;
    }

    @Override
    void printAccountState() {
        System.out.println("\n=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSents);
        System.out.println("Wysłanych MMSów: " + mmsSents);
        System.out.println("Liczba sekund rozmowy: " + secondsUsed);
        System.out.println("Dodatkowo wykorzystane środki " + fundsUsed + "zł");
    }

    @Override
    public String toString() {
        return "Type of contract: Mix Contract";
    }
}
