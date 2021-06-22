package ires.corso.parttwo.bankExercise;

public class TestBank {
    public static void main (String[] args){
        BankAccount harrysChecking = new BankAccount(); //istanzio il conto harrysChecking
        System.out.println("Saldo iniziale: " + harrysChecking.getBalance()); // controllo a quanto ammonta il saldo
        harrysChecking.addMoney(1000.0); //verso 1000.0
        System.out.println("Saldo attuale: " + harrysChecking.getBalance()); //controllo a quanto ammonta il saldo
        harrysChecking.removeMoney(500.0);
        harrysChecking.removeMoney(400.0);
        System.out.println("Saldo attuale " + harrysChecking.getBalance()); //controllo a quanto ammonta il saldo

        BankAccount momsSaving = new BankAccount(400);
        System.out.println(momsSaving.getBalance());
        System.out.println(momsSaving.applyInterest(10));
        System.out.println(momsSaving.getBalance());

    }
}
