package ires.corso.parttwo.bankExercise;

public class BankAccount {
    /*Es. 3.1: scrivere un programma che costruisca un conto bancario chiamato
    harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e
    infine visualizzi il saldo rimanente.
    Il programma deve poi creare un altro conto bancario chiamato momsSaving,
    utilizzando il costruttore che inizializza la variabile balance.
    Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito
    del quale viene stampato il saldo.*/
    private double balance;
    private double newBalance;
    private double money;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public double getBalance (){
        return balance;
    }

    public double setBalance(double newBalance){
        return balance = newBalance;
    }

    public double addMoney(double money){
        return balance = balance + money;
    }

    public double removeMoney(double money){
        return balance = balance - money;
    }

    public double applyInterest(double rate){
        return balance = balance + (balance * rate) / 100;
    }
}
