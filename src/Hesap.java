
import java.util.Scanner;
public class Hesap {
    public static void main(String[] args) {
        int a1, a2, choose;
       Scanner inp= new Scanner(System.in);

        System.out.println(" Lutfen ilk sayiyi giriniz: ");
        a1= inp.nextInt();
        System.out.println(" Lutfen ikinci sayiyi giriniz: ");
        a2= inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println(" Lutfen yapmak istediginiz islemi seciniz: ");
        choose= inp.nextInt();

        switch (choose) {
            case (1):
                System.out.print("Islemin sonucu: ");
                System.out.println( a1 + a2);
                break;
            case (2):
                System.out.print("Islemin sonucu: ");
                System.out.println( a1 - a2);
                break;
            case (3):
                System.out.print("Islemin sonucu: ");
                System.out.println( a1 * a2);
                break;
            case(4):
                if (a2 != 0) {
                    System.out.print("Islemin sonucu: ");
                    System.out.println(a1 / a2);
                }
                else
                    System.out.println(" O' Bolunemez. Hatali islem yaptiniz.");
                break;

            default:
                System.out.println("Hatali bir islem yaptiniz. Tekrar deneyiniz..");







        }




    }
}
