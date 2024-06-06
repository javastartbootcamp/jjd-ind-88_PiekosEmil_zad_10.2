package pl.javastart.task.contracts;

public class CardContract extends Contract {

    public CardContract(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    @Override
    void sendSms() {
        if (availableFunds > 0) {
            availableFunds -= SMS_COST;
            smsSents += 1;
            System.out.println("\nSMS Wysłany");
        } else {
            System.out.println("\nNie udało się wysłać SMSa");
        }
    }

    @Override
    void call(int seconds) {
        if (availableFunds > 0) {
            availableFunds -= ((double) seconds / 60) * CALL_COST_PER_MINUTE;
            secondsUsed += seconds;
            System.out.printf("\nPołączenie trwało %d sekund\n", seconds);
        } else {
            System.out.println("\nNie można wykonać połączenia");
        }
    }

    @Override
    void sendMms() {
        if (availableFunds > 0) {
            availableFunds -= MMS_COST;
            mmsSents += 1;
            System.out.println("\nMMS Wysłany");
        } else {
            System.out.println("\nNie udało się wysłać MMSa");
        }

    }

    @Override
    void printAccountState() {
        System.out.println("\n=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSents);
        System.out.println("Wysłanych MMSów: " + mmsSents);
        System.out.println("Liczba sekund rozmowy: " + secondsUsed);
        System.out.printf("Pozostało na koncie %.2fzł\n", availableFunds);
    }

}
