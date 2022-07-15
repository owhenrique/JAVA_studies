import java.util.Scanner;

public class MaiorMenorInt {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número de entradas que deseja inserir: ");
		
		int num_entradas = sc.nextInt();
				
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < num_entradas; i++)
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
