package com.aliyagiztar;

public class _001_If {

    public static void main(String[] args) {
        // Basit if örneği
        if (1 < 50) {
            // If the condition is true, this line will be executed.
            // Koşul doğru ise, bu satır çalıştırılır.
            System.out.println("Yes, 1 is less than 50."); // EVET, 1 50'den küçüktür.
        }

        // Değişken ile if örneği
        int number = 10;
        if (1 < number) {
            // If the condition is true, this line will be executed.
            // Koşul doğru ise, bu satır çalıştırılır.
            System.out.println("Yes, 1 is less than " + number); // EVET, 1 sayıdan küçüktür.
        }

        // Çoklu değişkenler ve karşılaştırmalar ile if örneği
        int a = 1, b = 2, c = 3;
        int x = 90, y = 50, z = 55;

        if ((x + y + z) > (a + (b * c))) {
            // If the condition is true, this line will be executed.
            // Koşul doğru ise, bu satır çalıştırılır.
            System.out.println("The condition is met."); // Koşul sağlandı.
        }

        // else if ve else kullanımı
        int temperature = 30;
        if (temperature > 30) {
            System.out.println("It's a hot day."); // Sıcak bir gün.
        } else if (temperature > 20) {
            System.out.println("It's a nice day."); // Güzel bir gün.
        } else {
            System.out.println("It's cold."); // Soğuk.
        }

        // Mantıksal operatörler ile if örneği
        boolean isRaining = false;
        boolean isWeekend = true;

        if (isRaining && isWeekend) {
            System.out.println("We can't go out."); // Dışarı çıkamayız.
        } else if (!isRaining && isWeekend) {
            System.out.println("We can go to the park."); // Parka gidebiliriz.
        } else {
            System.out.println("I have to go to work."); // İşe gitmeliyim.
        }

    }
}