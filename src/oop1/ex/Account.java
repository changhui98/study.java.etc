package oop1.ex;

public class Account {

    int balance;

    public int deposit(int amount) {

        return balance += amount;
    }

    public boolean withdraw(int amount) {

        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + balance);
            return false;
        }
        balance -= amount;
        return true;
    }
}


