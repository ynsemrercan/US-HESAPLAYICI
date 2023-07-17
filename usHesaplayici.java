import java.util.Scanner;
public class usHesaplayici {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int us,sayi,total=1;


        System.out.println("Üssü Alınacak Sayıyı Giriniz: ");
        sayi=input.nextInt();

        System.out.println("Üs Olacak Sayıyı Giriniz: ");
        us=input.nextInt();


        for(int i=1;i<=us;i++){
            total*=sayi;

        }
        System.out.println("Cevap: "+ total);








    }
}