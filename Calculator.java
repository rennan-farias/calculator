import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a operação desejada: +, -, *, /");
		char operacao = sc.next().charAt(0);
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		double resultado;
		sc.close();
		
		switch(operacao) {
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;
			case '/':
				resultado = num1 / num2;
				break;
			default:
				System.out.println("Operação inválida.");
				return;
		}
		
		System.out.println(num1 + " "+ operacao + " " + num2 + ": " + resultado);
		
	}

}
