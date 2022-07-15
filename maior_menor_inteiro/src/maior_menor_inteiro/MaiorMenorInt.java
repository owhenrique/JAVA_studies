package maior_menor_inteiro;

import java.util.Scanner;

public class MaiorMenorInt {

	public static void main(String[] args) 
	{
		final int ENTRADAS = 3;
		
		Scanner sc = new Scanner (System.in);
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < ENTRADAS; i++)
		{
			if(i == 0)
				System.out.print("Digite um número: ");
			else
				System.out.print("Digite o próximo número: ");
			
			int numero = sc.nextInt();
			
			if(numero < menor)
				menor = numero;
			
			if(numero > maior)
				maior = numero;
		}
		
		System.out.println("O menor número digitado foi: " + menor);
		System.out.println("O maior número digitado foi: " + maior);

	}

}
