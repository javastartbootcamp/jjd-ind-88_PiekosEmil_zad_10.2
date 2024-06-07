package pl.javastart.task;

import pl.javastart.task.contracts.CardContract;
import pl.javastart.task.contracts.MixContract;
import pl.javastart.task.contracts.MonthlyContract;
import pl.javastart.task.contracts.Phone;

public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone(new CardContract(10));
        phone.sendSms();
        phone.sendMms();
        phone.printAccountState();
        phone.sendSms();
        phone.call(60);

        Phone apple = new Phone(new MonthlyContract(100));
        apple.call(110);
        apple.sendSms();
        apple.sendMms();
        apple.printAccountState();

        Phone google = new Phone(new MixContract(2, 2, 2));
        google.sendSms();
        google.sendSms();
        google.sendSms();
        google.call(180);
        google.printAccountState();
    }
}
