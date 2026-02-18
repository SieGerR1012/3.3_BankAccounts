public class CreditAccount extends Account {
    public CreditAccount(int balance){
        super(balance);
    }

    public boolean pay(int amount){
        balance -= amount;
        System.out.println("Оплата Кредитного счета на " + amount);
        return false;
    }

    public boolean addMoney(int amount){
        balance += amount;
        if (balance > 0){
            balance = 0;
        }
        System.out.println("Пополнение Кредитного счета на " + amount);
        return true;
    }
}
