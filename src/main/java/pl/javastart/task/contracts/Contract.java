package pl.javastart.task.contracts;

public abstract class Contract {
    public static final double SMS_COST = 0.1;
    public static final double MMS_COST = 0.2;
    public static final double CALL_COST_PER_MINUTE = 0.50;
    protected int smsSents;
    protected int mmsSents;
    protected int secondsUsed;
    protected double availableFunds;

    abstract void sendSms();

    abstract void call(int seconds);

    abstract void sendMms();

    abstract void printAccountState();

    @Override
    public String toString() {
        return "";
    }
}
