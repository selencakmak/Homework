package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=1;
		int remainder=number % 2;
		//System.out.println(remainder);
		//1 ve kendinden ba�ka pozitif b�leni yoksa asla say� 
		
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Asal sayi de�ildir.");
			return;
		}
		
		if(number<2) {
			System.out.println("Ge�ersiz sayi");
			return;
		}
		
		for(int i=2; i<number;i++) {
			if(number%i==0 ) {
				isPrime= false;
			}
			
		}
		if(isPrime==true) {
			System.out.println("Sayi asaldir");
		}
		else {
			System.out.println("Sayi asal de�ildir");
		}

	}

}
