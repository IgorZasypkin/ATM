public class ATM {

    private int amountMoney;

    public ATM(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    int depositMoney(int takeSum) {
        amountMoney = amountMoney + takeSum;
        return amountMoney;
    }

    Object withdrawCash(int takeOffSum) {
        if (takeOffSum > amountMoney) {
            String s = "не достаточно средств в банкомате";
            return s;

        }

            {
                amountMoney = amountMoney - takeOffSum;
                return amountMoney;
            }

        }
    }

