package com.aliyagiztar;

public class _001_For {

    public static void main(String[] args) {
        // Bu bölümde basit bir sayac kullanımı örneği vardı, ancak yorum satırlarına alınmış.
        /*
        int i = 0;
        ++i;
        System.out.println(i);
        ++i;
        System.out.println(i);
        */

        // Ayırıcıyı yazdırarak farklı döngü bölümlerini görsel olarak ayırıyoruz.
        System.out.println("-----------------------------");

        // İlk for döngüsü: 0'dan başlayarak 10'a kadar (10 hariç) sayıları yazdırır.
        // Başlangıç, şart ve artırım kısımları açıkça belirtilmiştir.
        for (int i = 0; i < 10; i++) { // i, 0'dan başlar ve her döngüde 1 artar.
            System.out.println(i); // Her döngüde i'nin değerini yazdırır.
        }

        // Döngüler arası ayırıcı
        System.out.println("-----------------------------");

        // İç içe for döngüleri: Dış döngü yıl, iç döngü günleri temsil ediyor.
        for (int i = 1; i < 13; i++) { // Dış döngü: Ay (1'den 12'ye kadar)

            System.out.println("i: " + i); // Ayı yazdırır.

            for (int j = 1; j < 32; j++) { // İç döngü: Gün (1'den 31'e kadar)
                System.out.println("\tj: " + j); // Günü yazdırır, sekme ile hizalar.
            }

            // Her ayın sonunda ayırıcı yazdırılır.
            System.out.println("-----------------------------");
        }

        // Üçer üçer artan döngü: Her döngüde i ve j'nin değeri daha büyük adımlarla artar.
        for (int i = 1; i < 13; i = i + 3) { // Dış döngü: Her 3 ayda bir artar (Örn: Ocak, Nisan, Temmuz...)

            System.out.println("i: " + i); // Ayı yazdırır.

            for (int j = 1; j < 32; j = j + 5) { // İç döngü: Her 5 günde bir artar (Örn: 1, 6, 11...)
                System.out.println("\tj: " + j); // Günü yazdırır, sekme ile hizalar.
            }
        }
    }
}
