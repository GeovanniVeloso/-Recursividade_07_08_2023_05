package controller;

public class RecursivaDivisão {
	public RecursivaDivisão() {
		super();
	}
	//Recebe n como sendo o limite superior da recursiva, diminuindo até 1, pois caso fosse até 0, não haveria divisão (1/0 = indeterminado).
	//Calcula a soma do resultado anterior com 1/ o valor atual de n.
	public double div(int n) {
		if ( n == 1) {
			return 1;
		}else {
			 return (1/(double)n)+div(n-1);
		}
	}
}
