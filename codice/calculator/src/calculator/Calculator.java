package calculator;

public class Calculator {

	double risultato;
	double num1;
	Scelta valore;
	double num2;
	
	
public double calcolatrice(Scelta valore,double num1,double num2) {
	this.risultato=risultato;
	this.num1=num1;
	this.num2=num2;
	this.valore=valore;
	switch (valore) {
	
	case ADDIZIONE:
					risultato=num1+num2;	
	break;
	
	case SOTTRAZIONE:
					if(num1>=num2) {
							risultato=num1-num2;
								}
					else {
						risultato=num2-num1;
					}
	break;
				
	case MOLTIPLICAZIONE:
					risultato=num1*num2;	
	break;
		
	case DIVISIONE:
		if(num2==0) {
			System.out.println("non si può dividere per zero");
		}
		else {
		risultato=num1/num2;
		}
		break;
		
		}
		
		
	

			
	return risultato;
}
	
	
	
}

		
	

