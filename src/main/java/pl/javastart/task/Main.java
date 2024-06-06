package pl.javastart.task;

import pl.javastart.task.contracts.CardContract;
import pl.javastart.task.contracts.Contract;
import pl.javastart.task.contracts.Phone;

public class Main {

    public static void main(String[] args) {
        Contract cardContract = new CardContract(1);
        cardContract.sendSms();
        cardContract.printAccountState();
        cardContract.sendSms();
        cardContract.call(60);
        cardContract.printAccountState();

        Phone phone = new Phone(cardContract);
//        phone.sendSms();
//        phone.printAccountState();
//        phone.sendSms();
//        phone.printAccountState();
    }
}
