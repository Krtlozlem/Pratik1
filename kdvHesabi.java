import java.util.Scanner;
public class kdvHesabi {
    public static void main(String[] args) {
        Double tutar,kdvOran =0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;


        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("Kdv'li Tutar: " + kdvliTutar);



    }
}
