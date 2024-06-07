package pl.javastart.task.contracts;

public class MonthlyContract extends Contract {
    private double contractCost;

    public MonthlyContract(double contractCost) {
        this.contractCost = contractCost;
    }

    @Override
    void sendSms() {
        smsSents += 1;
        System.out.println("\nSMS Wysłany");
    }

    @Override
    void call(int seconds) {
        secondsUsed += seconds;
        System.out.printf("\nPołączenie trwało %d sekund\n", seconds);
    }

    @Override
    void sendMms() {
        mmsSents += 1;
        System.out.println("\nMMS Wysłany");
    }

    @Override
    void printAccountState() {
        System.out.println("\n=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsSents);
        System.out.println("Wysłanych MMSów: " + mmsSents);
        System.out.println("Liczba sekund rozmowy: " + secondsUsed);
        System.out.println("Wysokość abonamentu: " + contractCost + "zł");
    }

    @Override
    public String toString() {
        return "Type of contract: Monthly Contract";
    }
}
