package EX2;

import java.util.Scanner;
import EX2.ClasseProduto;

public class Teste {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ClasseProduto Sabonete=new ClasseProduto();
		
		
		System.out.println("Informe o preço de custo.");
		Sabonete.setprecoCusto(in.nextDouble());
		
		System.out.println("Informe o preço de venda.");
		Sabonete.setprecoVenda(in.nextDouble());
		
		
		Sabonete.calcularMargemLucro();
		
		System.out.println("Margem de lucro em percentual:"+Sabonete.getcalcularMargemLucro()+"%");
		

	}

}

