package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		//mukemmel sayi: kendinden ba�ka t�m poztif b�lenlerinin toplam� kendisine e�it olan say�
		
		int number = 6;  //1 e 2 ye 3e b�l�n�r
        int total = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (total == number){
            System.out.println("M�kemmel say�d�r");
        }else{
            System.out.println("M�kemmel say� de�il");
        }

	}

}
