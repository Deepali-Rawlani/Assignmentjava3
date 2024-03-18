package in.assignment10;

public class arithmetic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
			int num1 = 34;
			float num2 = num1 ;
			double num3 = num1;
			System.out.println(num2);
			System.out.println(num3); //Widening
			
			/* String str = "1233" ;   //String
			String str = num1 ;
			System.out.println(num1);  cannot convert int to string */
			
			String str = String.valueOf(num1);//it is possible in boxing
			System.out.println(str);
			
		}



	}


