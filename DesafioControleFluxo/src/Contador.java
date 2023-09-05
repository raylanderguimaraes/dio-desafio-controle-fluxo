import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = scanner.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = scanner.nextInt();
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("o parametro dois precisa ser maior que o parametro um");
		}
		scanner.close();
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException  {
			
			if(parametroDois <= parametroUm) throw new ParametrosInvalidosException();
			
			int contagem = parametroDois - parametroUm;			
			for(int i = 1; i <= contagem; i++)  {
				System.out.println("Imprimindo o número: " + i);
			}		
	}
	
}
