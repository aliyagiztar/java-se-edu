package TipDonusumleri;

public class ArrayDiziler {
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 2;
        System.out.println(sayi1 + " " + sayi2);

        int[] sayilar = new int[sayi2];
        sayilar[0] = 100;
        sayilar[1] = 50;
        System.out.println(sayilar[0] + " " + sayilar[1]);

        // Yorum satırındaki kod, index out of bounds hatası vereceği için kaldırıldı
        /*
        sayilar[26] = 123;
        System.out.println(sayilar[26]);
        */
        System.out.println("-----");
        byte[] myArray = new byte[4];

        // Dizinin elemanlarına değer ataması yapılıyor.
        myArray[0] = 100;
        myArray[1] = 27;
        myArray[2] = -50;
        myArray[3] = 30;

        // Dizi elemanlarını yazdırmak için for döngüsü kullanılıyor.
        System.out.println("Dizi Elemanları:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Dizinin " + i + ". elemanı: " + myArray[i]);
        }

        // Java 8 ve sonrası için forEach döngüsü kullanılıyor.
        System.out.println("ForEach ile Dizi Elemanları:");
        for (byte b : myArray) {
            System.out.println(b);
        }
    }
}
