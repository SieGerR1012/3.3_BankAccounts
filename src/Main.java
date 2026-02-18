void main() {
    Account savings = new SavingsAccount(10_000);
    Account credit = new CreditAccount(0);
    Account checking = new CheckingAccount(25_000);

    System.out.println("Баланс Сберигательный: " + savings.getBalance());
    System.out.println("Долг по Кредиту: " + credit.getBalance());
    System.out.println("Баланс: " + checking.getBalance());

    System.out.println("\nПеревод с расчетного на сберегательный:");
    checking.transfer(savings, 10_000);

    System.out.println("\nПопытка оплаты со сберегательного:");
    savings.pay(1_000);

    System.out.println("\nОплата с кредитного счета:");
    credit.pay(3_000);

    System.out.println("\nПополнение кредитного счета:");
    checking.transfer(credit, 2_000);

    System.out.println("\nИтоговые балансы:");
    System.out.println("Сберигательный счет: " + savings.getBalance());
    System.out.println("Кредитный долг: " + credit.getBalance());
    System.out.println("Баланс: " + checking.getBalance());
}
