package pl.javastart.task.contracts;

public class MonthlyContract extends Contract {
    private double contractCost;

    public MonthlyContract(double contractCost) {
        this.contractCost = contractCost;
    }

    @Override
    public void sendSms() {
        smsSents += 1;
    }

    @Override
    public void call(int seconds) {
        secondsUsed += seconds / 60;
    }

    @Override
    public void sendMms() {
        mmsSents += 1;
    }

    @Override
    public void printAccountState() {
        System.out.println("\n=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSents);
        System.out.println("Wysłanych MMSów: " + mmsSents);
        System.out.println("Liczba sekund rozmowy: " + secondsUsed);
    }
}
