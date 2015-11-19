import java.util.Scanner;
// ===== Code from file RocketShip.java =====
public class RocketShipDriver {
public static void main(String[] args){
   int size = 0;

	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a size of the rocket.");
	size = scnr.nextInt();
   
   forCone(size);
 
	forSeperator(size);
   
   sectionA(size);
   
   sectionB(size);

   forSeperator(size);
   
	sectionB(size);

   sectionA(size);
   
   forSeperator(size);
   
   forCone(size);
}

public static void forCone(int size){
int line, fslash, bslash, space;
   for ( line = 1; line <= size * 2 - 1; line++) { //Cone
		for ( space = 1; space <= size * 2 - line; space++) {
			System.out.print(" ");
		}
		for (fslash = 1; fslash <= line; fslash++) {
			System.out.print("/");
		}	
		System.out.print("**");
		for (bslash = 1; bslash <= line; bslash++) {
			System.out.print("\\");
		}
		System.out.println(); //Cone End
		
		
	}
}
public static void forSeperator(int size){
System.out.print("+"); 
	
	for( int sep = 1;  sep <= size * 2; sep++){ //Seperator
	System.out.print("=*");
	}
	System.out.println("+");
	

}
public static void sectionA(int size){
int midbod, tri, mdot, dot, mdot2, midbod2;
for( midbod = 1; midbod <= size; midbod++){ //Top Mid-Section
		System.out.print("|");
			for( dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
					for( tri = 1; tri <= midbod;tri++){
						System.out.print("/\\");
			}
			for( mdot = 0; mdot < (size-midbod)*2; mdot++){
			System.out.print(".");
			}
			
			
			for(tri = 1; tri <= midbod;tri++){ // Top Mid-Section Second Half
			System.out.print("/\\");
			}
		for(dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
				for( midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}


		
		System.out.println();
	}//Top Mid-Section End

}
public static void sectionB(int size){
int midbodB, dotB, triB, mdotB, midbod2B;
for( midbodB = 1; midbodB <= size; midbodB++){ //Bottom Mid-Section
		System.out.print("|");
		
		for( dotB = size-1; dotB > size-midbodB; dotB--){
			System.out.print(".");
			}

		for( triB = size; triB >= midbodB;triB--){
			System.out.print("\\/");
		}
		for(mdotB = (size*2)-2; mdotB > (size - midbodB)*2; mdotB--){//FIXME
		System.out.print(".");
			}
					
			for(triB = size; triB >= midbodB;triB--){ // Bottom Mid-Section Second Half
			System.out.print("\\/");
			}
		for(dotB = size-1; dotB > size-midbodB; dotB--){
				System.out.print(".");
				}
				for(midbod2B = 1; midbod2B < size-midbod2B; midbod2B++){ 
		System.out.print("|");
		}

	System.out.println();
	}//Bottom Mid-Section End

}

 }

