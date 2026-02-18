public class CheckingAccount extends Account{
    public CheckingAccount(int balance){
        super(balance);
    }

    public boolean pay(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Оплата Расчетного счета на + " + amount);
            return true;
        }
        System.out.println("Недостаточно средств");
        return false;
    }

    public boolean addMoney(int amount){
        balance += amount;
        System.out.println("Пополнение Расчетного счета на " + amount);
        return true;
    }
}
