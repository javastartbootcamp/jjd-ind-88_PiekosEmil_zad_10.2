package pl.javastart.task.contracts;

public class Phone {
    private Contract contract;

    public Phone(Contract contract) {
        this.contract = contract;
    }

    public void sendSms() {
        contract.sendSms();
    }

    public void printAccountState() {
        contract.printAccountState();
    }

    public void sendMms() {
        contract.sendMms();
    }

    public void call(int seconds) {
        contract.call(seconds);
    }
}