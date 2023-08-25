package atividade1_TI2;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		//Variaveis
		int x, y , soma;
		Scanner sc = new Scanner(System.in);

		//Ler primeiro numero
		System.out.println("Digite o primeiro número: ");
		x = sc.nextInt();
		//Ler segundo numero
		System.out.println("Digite o segundo número: ");
		y=sc.nextInt();
		
		//Soma dos numeros
		soma = x + y;
		
		//Imprimindo
		System.out.println("Soma dos dois números:"+ soma);
		
	}

}
