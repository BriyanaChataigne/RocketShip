import java.util.Scanner;
public class RocketShip {
	public static void main(String arg[]){
	int size = 0;
	
	
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter a size of the rocket.");
	size = scnr.nextInt();
	
		
	for (int line = 1; line <= size * 2 - 1; line++) { //Cone
		for (int space = 1; space <= size * 2 - line; space++) {
			System.out.print(" ");
		}
		for (int fslash = 1; fslash <= line; fslash++) {
			System.out.print("/");
		}	
		System.out.print("**");
		for (int bslash = 1; bslash <= line; bslash++) {
			System.out.print("\\");
		}
		System.out.println(); //Cone End
		
	}
	System.out.print("+"); 
	
	for(int sep = 1;  sep <= size * 2; sep++){ //Seperator
	System.out.print("=*");
	}
	System.out.println("+");

	for(int midbod = 1; midbod <= size; midbod++){ //Top Mid-Section
		System.out.print("|");
			for(int dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
					for(int tri = 1; tri <= midbod;tri++){
						System.out.print("/\\");
			}
			for(int mdot = 0; mdot < (size-midbod)*2; mdot++){
			System.out.print(".");
			}
			
			
			for(int tri = 1; tri <= midbod;tri++){ // Top Mid-Section Second Half
			System.out.print("/\\");
			}
		for(int dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
				for(int midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}


		
		System.out.println();
	}//Top Mid-Section End
	
	for(int midbod = 1; midbod <= size; midbod++){ //Bottom Mid-Section
		System.out.print("|");
		
		for(int dot = size-1; dot > size-midbod; dot--){
			System.out.print(".");
			}

		for(int tri = size; tri >= midbod;tri--){
			System.out.print("\\/");
		}
		for(int mdot = (size*2)-2; mdot > (size - midbod)*2; mdot--){//FIXME
		System.out.print(".");
			}
					
			for(int tri = size; tri >= midbod;tri--){ // Bottom Mid-Section Second Half
			System.out.print("\\/");
			}
		for(int dot = size-1; dot > size-midbod; dot--){
				System.out.print(".");
				}
				for(int midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}

	System.out.println();
	}//Bottom Mid-Section End
	
	System.out.print("+"); 
	
	for(int sep = 1;  sep <= size * 2; sep++){ //Seperator
	System.out.print("=*");
	}
	System.out.println("+");
		for(int midbod = 1; midbod <= size; midbod++){ //Bottom Mid-Section
		System.out.print("|");
		
		for(int dot = size-1; dot > size-midbod; dot--){
			System.out.print(".");
			}

		for(int tri = size; tri >= midbod;tri--){
			System.out.print("\\/");
		}
		for(int mdot = (size*2)-2; mdot > (size - midbod)*2; mdot--){//FIXME
		System.out.print(".");
			}
					
			for(int tri = size; tri >= midbod;tri--){ // Bottom Mid-Section Second Half
			System.out.print("\\/");
			}
		for(int dot = size-1; dot > size-midbod; dot--){
				System.out.print(".");
				}
				for(int midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}

	System.out.println();
	}//Bottom Mid-Section End
	
	for(int midbod = 1; midbod <= size; midbod++){ //Top Mid-Section
		System.out.print("|");
			for(int dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
					for(int tri = 1; tri <= midbod;tri++){
						System.out.print("/\\");
			}
			for(int mdot = 0; mdot < (size-midbod)*2; mdot++){
			System.out.print(".");
			}
			
			
			for(int tri = 1; tri <= midbod;tri++){ // Top Mid-Section Second Half
			System.out.print("/\\");
			}
		for(int dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
				for(int midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}


		
		System.out.println();
	}//Top Mid-Section End
		System.out.print("+"); 
	
	for(int sep = 1;  sep <= size * 2; sep++){ //Seperator
	System.out.print("=*");
	}
	System.out.println("+");
	
	for (int line = 1; line <= size * 2 - 1; line++) {//Cone
		for (int space = 1; space <= size * 2 - line; space++) {
			System.out.print(" ");
		}
		for (int fslash = 1; fslash <= line; fslash++) {
			System.out.print("/");
		}	
		System.out.print("**");
		for (int bslash = 1; bslash <= line; bslash++) {
			System.out.print("\\");
		}
		System.out.println();
		
	}



	
	}
}
