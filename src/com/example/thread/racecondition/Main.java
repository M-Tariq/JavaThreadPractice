package com.example.thread.racecondition;

public class Main {
    public static void main(String[] args){
        BankAccount task=new BankAccount();
        task.setBalance(100);
        Thread tariq=new Thread(task);
        Thread ali=new Thread(task);
        tariq.setName("Tariq");
        ali.setName("Ali");
        tariq.start();
        ali.start();

        System.out.println("inside main");
    }
}
