public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM(1000000);


        System.out.println(atm.depositMoney(1000000));

        System.out.println(atm.withdrawCash(300000000));
    }


}
