package pl.javastart.task;

import pl.javastart.task.contracts.CardContract;
import pl.javastart.task.contracts.Phone;

public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone(new CardContract(10));
        phone.sendSms();
        phone.sendMms();
        phone.printAccountState();
        phone.sendSms();
        phone.call(60);
    }
}
