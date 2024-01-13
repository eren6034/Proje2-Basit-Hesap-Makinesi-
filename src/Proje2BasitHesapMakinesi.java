import java.util.Scanner;

public class Proje2BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İki sayı ve işlemi girin Toplama(+) Çıkarma(-) Çarpma(*) Bölme(/) (örneğin-> 5 + 3):");
        double sonuc = 0.0;


        String ifade = scanner.nextLine();


        String[] parcalar = ifade.split(" ");

        double sayi1 = Double.parseDouble(parcalar[0]);
        char operator = parcalar[1].charAt(0);
        double sayi2 = Double.parseDouble(parcalar[2]);


        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata! Sıfıra bölme hatası.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz İşlem Lütfen +, -, *, / operatörlerinden birini kullanın.");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }
}
