package Javapoo;

import Javapoo.CALCULADORA;

public class Usarcal {

	public static void main(String[] args) {
	
		Calculadora c1 = new Calculadora();
		double resp = c1.somar(4, 10);
		System.out.println(resp);
	
		Calculadora c2 = new Calculadora();
		double respo = c2.somar(3, 4, 5);
		System.out.println(respo);
	
		Calculadora c3 = new Calculadora();
		double resu = c3.sub(4, 10);
		System.out.println(resu);
	
		Calculadora c4 = new Calculadora();
		double resul = c4.sub(3, 4, 5);
		System.out.println(resul);
	
		Calculadora c5 = new Calculadora();
		double res = c5.div(4, 10);
		System.out.println(res);
	
		Calculadora c6 = new Calculadora();
		double re = c6.div(3, 4, 5);
		System.out.println(re);

		Calculadora c7 = new Calculadora();
		double result = c7.mult(4, 10);
		System.out.println(result);
	
		Calculadora c8 = new Calculadora();
		double respost = c8.mult(3, 4, 5);
		System.out.println(respost);
	}

}
