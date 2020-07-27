package er.engine.exercicios;

import java.util.Locale;
import java.util.Scanner;

import er.engine.retangle.Conta;

import java.lang.String;


public class Exercicio1 {
		
	public static void main (String[] args) {
		
		  Conta con = new Conta();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
    System.out.print("Enter account number : ");
	Conta.numero = sc.nextInt();
	
    System.out.print("Enter account holder : ");
    con.nome = ler.nextLine();
    
    System.out.print("Is there na initial diposit (1 y/2 n) : ");
    int yn = sc.nextInt();
    if(yn !=1) {
        System.out.println();
    }else {
        System.out.print("Enter initial deposit value : ");
        con.valor = sc.nextDouble();
    }
    System.out.println("Account data: ");
    System.out.printf("Account "+con.numero+", Holder: "+con.nome+", Balance: $ %.2f%n",con.balance());

    System.out.print("Enter deposit value : ");
    con.valor1 =sc.nextDouble();
    System.out.println("Updade account data : ");
    System.out.printf("Account "+con.numero+", Holder: "+con.nome+", Balance: $ %.2f%n",con.balance2());
    System.out.print("Enter withdraw value : ");
    con.valor2 =sc.nextDouble();
    System.out.println("Updade account data : ");
    System.out.printf("Account "+con.numero+", Holder: "+con.nome+", Balance: $ %.2f%n",con.balance3());


	sc.close();
	}

	


}
