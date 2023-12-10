package calculator;

public class main {
public static void main(String[] args) {
	
	Scelta enume1;
	enume1=Scelta.ADDIZIONE;
	Scelta enume2=Scelta.SOTTRAZIONE;
	Scelta enume3=Scelta.MOLTIPLICAZIONE;
	Scelta enume4=Scelta.DIVISIONE;
	
	
	
	double valore1;
	double valore2;
	
	Calculator calc= new Calculator();
    System.out.println("Scegli tra ADDIZIONE, SOTTRAZIONE, MOLTIPLICAZIONE O DIVISIONE");
	
	
	System.out.println(calc.calcolatrice(enume1 , 4, 5));
	System.out.println(calc.calcolatrice(enume2 , 4, 5));
	System.out.println(calc.calcolatrice(enume3 , 4, 5));
	System.out.println(calc.calcolatrice(enume4 , 4, 5));
}
}
