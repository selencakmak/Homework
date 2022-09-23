package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		//mukemmel sayi: kendinden baþka tüm poztif bölenlerinin toplamý kendisine eþit olan sayý
		
		int number = 6;  //1 e 2 ye 3e bölünür
        int total = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (total == number){
            System.out.println("Mükemmel sayýdýr");
        }else{
            System.out.println("Mükemmel sayý deðil");
        }

	}

}
