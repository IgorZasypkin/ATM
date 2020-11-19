public class ATM {

    private int amountMoney;

    public ATM(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    int depositMoney(int takeSum) {
        amountMoney= amountMoney + takeSum;
        return amountMoney;
    }
    int withdrawCash (int takeOffSum) {
        amountMoney = amountMoney - takeOffSum;
        return amountMoney;
    }

}
