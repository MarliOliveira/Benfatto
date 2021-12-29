package logica;

public class TrocaVariavel {

	public static void main(String[] args) {
		
		int A = 1;
		int B = 4; 
		int Auxiliar = 0; 
		
		 Auxiliar = B;
		 B = A; 
		 A = Auxiliar; 
		
		
		System.out.println(" O novo valor de A é :" + A );
		System.out.println(" O novo valor e B é :" + B);

	}

}
