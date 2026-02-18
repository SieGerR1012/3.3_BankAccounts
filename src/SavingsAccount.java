public class SavingsAccount extends Account {
    public SavingsAccount(int balance){
        super(balance);
    }

    public boolean pay(int amount){
        System.out.println("Сберегательный счет: Оплата запрещена!");
        return false;
    }

    public boolean addMoney(int amount){
        balance += amount;
        System.out.println("Пополнение Сберегательного счета на " + amount);
        return true;
    }
}
