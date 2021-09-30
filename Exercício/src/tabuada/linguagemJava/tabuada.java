package tabuada.linguagemJava;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
	int tab=1, x=1, res=1;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Olá, informe qual tabuada deseja visualizar: ");
	tab = leia.nextInt();
		
	for(x=1;x<=10;x++) {
		res= x*tab;
		System.out.println(tab+" X "+ x +" = "+res);
	}
	
	
	}
}
