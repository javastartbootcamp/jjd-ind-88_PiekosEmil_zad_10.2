package pl.javastart.task.contracts;

public abstract class Contract {
    public static final double SMS_COST = 0.1;
    public static final double MMS_COST = 0.2;
    public static final double CALL_COST_PER_MINUTE = 0.50;
    public int smsSents;
    public int mmsSents;
    public int secondsUsed;
    public double availableFunds;

    public abstract void sendSms();

    public abstract void call(int seconds);

    public abstract void sendMms();

    public abstract void printAccountState();
}
