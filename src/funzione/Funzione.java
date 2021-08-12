package funzione;

import java.util.Arrays;

public class Funzione {
	
	
public static void main(String []args){
		
		int array [] = {4,1,3,2,5};
		
		int tmp, x, y;
		
		
		for(x=0;x<array.length;x++) {
			
			for(y=x;y<array.length -1;y++) {
				
				if(array[x]>array[y+1]) { 	
					tmp = array[y+1]; 		
					array[y+1]= array[x]; 	
					array[x] = tmp;  		
											
					}						
				System.out.println(Arrays.toString(array));
			}
			
			
		}
		
		
	
}

}
