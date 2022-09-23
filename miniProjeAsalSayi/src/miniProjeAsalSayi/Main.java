package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=1;
		int remainder=number % 2;
		//System.out.println(remainder);
		//1 ve kendinden baþka pozitif böleni yoksa asla sayý 
		
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Asal sayi deðildir.");
			return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz sayi");
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
			System.out.println("Sayi asal deðildir");
		}

	}

}
