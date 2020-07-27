package er.engine.retangle;

import java.util.Scanner;

public class Conta {
	
	public static int numero; 
    public String nome;
	public double valor,valor1,valor2;
		
	Scanner sc = new Scanner(System.in);

    public double balance() {
	    return valor;
        }
    public double balance2() {
    	return valor +valor1;
        }
    public double balance3() {
    	return (valor +valor1) - valor2;
        }
	


	
	
}
