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
    public void sendSms() {
        if (smsNumber > 0) {
            smsNumber -= 1;
        } else {
            fundsUsed += SMS_COST;
        }
        smsSents += 1;
    }

    @Override
    public void call(int seconds) {
        if (minutesNumber > 0) {
            minutesNumber -= seconds / 60;
        } else {
            fundsUsed += CALL_COST_PER_MINUTE;
        }
        secondsUsed += seconds;
    }

    @Override
    public void sendMms() {
        if (mmsNumber > 0) {
            mmsNumber -= 1;
        } else {
            fundsUsed += MMS_COST;
        }
        mmsSents += 1;
    }

    @Override
    public void printAccountState() {
        System.out.println("\n=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSents);
        System.out.println("Wysłanych MMSów: " + mmsSents);
        System.out.println("Liczba sekund rozmowy: " + secondsUsed);
        System.out.println("Dodatkowo wykorzystane środki " + fundsUsed + "zł");
    }

}
