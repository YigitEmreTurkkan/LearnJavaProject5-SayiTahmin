import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int randomSayi = (int) (Math.random()*100 + 1);
        int tahmin = 0;
        System.out.println("Doğru tahmin " + randomSayi);
        int sayac = 1;

        while (tahmin != randomSayi)
        {
            String response = JOptionPane.showInputDialog(null,
                    "1'den 100'e kadar bir sayı tuttum tahmin et! ", "Tahmin Oyunu", 3);
            tahmin = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ tahminEt(tahmin, randomSayi, sayac));
            sayac++;
        }
    }
    public static String tahminEt(int tahmin, int randomSayi, int sayac){
        if (tahmin <=0 || tahmin >100) {
            return "Geçersiz tahmin.";
        }
        else if (tahmin == randomSayi ){
            return "Doğru tahmin\nDeneme Sayısı: " + sayac;
        }
        else if (tahmin > randomSayi) {
            return "Daha küçük bir sayı olacak.\nDeneme Sayısı: " + sayac;
        }
        else if (tahmin < randomSayi) {
            return "Daha büyük bir sayı olacak.\nDeneme Sayısı: " + sayac;
        }
        else {
            return "Yanlış tahmin\nDeneme Sayısı: " + sayac;
        }
    }
}


