package funzione;

import java.util.Arrays;

public class Funzione {
	
	
public static void main(String []args){
		
		int array [] = {4,1,3,2,5};
		
		int tmp, x, y;
		
		
		for(x=0;x<array.length;x++) {
			
			for(y=x;y<array.length -1;y++) {
				
				if(array[x]>array[y+1]) { 	//Comparazione se x � maggiore di y.
					tmp = array[y+1]; 		//Quando x � maggiore, y viene messo nella variabile tmp(temporanea).
					array[y+1]= array[x]; 	//Scambio di posizione x -> y.
					array[x] = tmp;  		//x(4) posizione 0 passer� in posizione 1 scambiando di posto con y(1).
											//Il ciclo si ripeter� finche trover� un numero maggiore del precedente.
					}						//Il BubbleSort porta da sinistra a destra il numero pi� grande.
				System.out.println(Arrays.toString(array));
			}
			
			
		}
		
		
	
}

}
