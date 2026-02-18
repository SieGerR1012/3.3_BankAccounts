public abstract class Account {
    protected int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public  int getBalance(){
        return balance;
    }

    // Оплата
    public abstract boolean pay(int amount);

    // Пополнение
    public abstract boolean addMoney(int amount);

    // Перевод
    public boolean transfer(Account account, int amount) {
        if (this.pay(amount)) {
            account.addMoney(amount);
            System.out.println("Перевод выполнен: " + amount);
            return true;
        }

        System.out.println("Перевод невозможен");
        return false;
    }
}