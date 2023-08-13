package view;

import controller.RecursivaDivisão;

public class Principal {

	public static void main(String[] args) {
		RecursivaDivisão rd = new RecursivaDivisão();
		
		int n = 5;
		
		double res = rd.div(n);
		
		System.out.println(res);

	}

}
