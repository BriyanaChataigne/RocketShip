import java.util.Scanner;

public class RocketShip {
public static void main(String[] args){
   int size = 0;
	int line = 0;
	int fslash = 0;
	int bslash = 0;
   int space = 0;
   int sep = 0;
   int midbod = 0;
   int dot = 0;
   int mdot = 0;
   int tri = 0;
   int midbod2 = 0;
   int midbodB = 0;
   int dotB = 0;
   int mdotB = 0;
   int triB = 0;
   int midbod2B = 0;

	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a size of the rocket.");
	size = scnr.nextInt();
   
   forCone(line, size, space, fslash,bslash);
 
	forSeperator(sep, size);
   
   sectionA(midbod,  size,  dot,  tri,  mdot,  midbod2);
   
   sectionB(midbodB,  size,  dotB, triB,  mdotB,  midbod2B);

   forSeperator(sep, size);
   
	sectionB(midbodB,  size,  dotB, triB,  mdotB,  midbod2B);

   sectionA(midbod,  size,  dot,  tri,  mdot,  midbod2);
   
   forSeperator(sep, size);
   
   forCone(line, size, space, fslash,bslash);


	
	}



public static void forCone(int line, int size, int space, int fslash, int bslash){

   for (line = 1; line <= size * 2 - 1; line++) { //Cone
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
public static void forSeperator(int sep, int size){
System.out.print("+"); 
	
	for( sep = 1;  sep <= size * 2; sep++){ //Seperator
	System.out.print("=*");
	}
	System.out.println("+");
	

}
public static void sectionA(int midbod, int size, int dot, int tri, int mdot, int midbod2){
for( midbod = 1; midbod <= size; midbod++){ //Top Mid-Section
		System.out.print("|");
			for( dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
					for(tri = 1; tri <= midbod;tri++){
						System.out.print("/\\");
			}
			for( mdot = 0; mdot < (size-midbod)*2; mdot++){
			System.out.print(".");
			}
			
			
			for( tri = 1; tri <= midbod;tri++){ // Top Mid-Section Second Half
			System.out.print("/\\");
			}
		for( dot = 0; dot <size-midbod; dot++){
				System.out.print(".");
				}
				for( midbod2 = 1; midbod2 < size-midbod2; midbod2++){ 
		System.out.print("|");
		}


		
		System.out.println();
	}//Top Mid-Section End

}
public static void sectionB(int midbodB, int size, int dotB, int triB, int mdotB, int midbod2B){
for( midbodB = 1; midbodB <= size; midbodB++){ //Bottom Mid-Section
		System.out.print("|");
		
		for( dotB = size-1; dotB > size-midbodB; dotB--){
			System.out.print(".");
			}

		for( triB = size; triB >= midbodB;triB--){
			System.out.print("\\/");
		}
		for( mdotB = (size*2)-2; mdotB > (size - midbodB)*2; mdotB--){//FIXME
		System.out.print(".");
			}
					
			for( triB = size; triB >= midbodB;triB--){ // Bottom Mid-Section Second Half
			System.out.print("\\/");
			}
		for( dotB = size-1; dotB > size-midbodB; dotB--){
				System.out.print(".");
				}
				for( midbod2B = 1; midbod2B < size-midbod2B; midbod2B++){ 
		System.out.print("|");
		}

	System.out.println();
	}//Bottom Mid-Section End

}

 }
