package com.aliyagiztar;

public class AppMain {

    public static void main(String[] args) {

        // İki tam sayının tanımlanması ve basit aritmetik işlemler
        int a = 25; // İlk tam sayı
        int b = 10; // İkinci tam sayı

        // Toplama işlemi
        int c = a + b; // c, a ve b'nin toplamını saklar
        System.out.println("Toplama: " + c); // Toplama sonucunu yazdırır

        // Bölme işlemi ve sonucun float olarak dönüştürülmesi
        float sonuc = (float) a / b; // a'nın b'ye bölünmesi, sonucu float'a dönüştürülüyor
        System.out.println("Bölme: " + sonuc); // Bölme sonucunu yazdırır

        // Mod alma işlemi
        System.out.println("Mod alma: " + (a % b)); // a'nın b'ye bölümünden kalanı yazdırır

        // Karşılaştırma operatörleri
        System.out.println(a > b); // a'nın b'den büyük olup olmadığını kontrol eder
        System.out.println(a < b); // a'nın b'den küçük olup olmadığını kontrol eder

        // Ternary (üçlü) operatörü
        // a'nın b'den büyük olup olmadığını kontrol eder ve sonucuna göre "EVET" veya "HAYIR" yazdırır
        System.out.println((a > b) ? "EVET" : "HAYIR");

        // Sayacın tanımlanması ve post/pre increment/decrement operatörlerinin kullanımı
        int i = 0; // Sayacın başlangıç değeri

        // i'nin değerini yazdırır ve ardından 1 artırır
        System.out.println("i: " + i); // i'nin başlangıç değerini yazdırır
        System.out.println(++i); // Önce i'yi 1 artırır, sonra yazdırır
        System.out.println(i++); // Önce i'yi yazdırır, sonra 1 artırır

        // i'nin değerini azaltma
        System.out.println(--i); // Önce i'yi 1 azaltır, sonra yazdırır
        System.out.println(i--); // Önce i'yi yazdırır, sonra 1 azaltır
    }

}
