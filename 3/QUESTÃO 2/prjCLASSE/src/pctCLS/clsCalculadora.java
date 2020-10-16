package pctCLS;

import java.util.Scanner;

public class clsCalculadora {

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		
		
/* 2)Crie na classe clsCAlculadora as seguintes funções:
 * -soma, subtração, divisão, multiplicação
 */
		
		
		double v1, v2;
		
		System.out.println("Digite o valor 1");
		v1=read.nextDouble();
		System.out.println("Digite o valor 2");
		v2=read.nextDouble();
		
		
	
		clsOPERA.soma(v1, v2);
		clsOPERA.sub(v1, v2);
		clsOPERA.mult(v1, v2);
		clsOPERA.div(v1, v2);
		
		
		
	}

}
