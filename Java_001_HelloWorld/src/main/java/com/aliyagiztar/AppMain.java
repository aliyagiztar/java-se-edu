package com.aliyagiztar;

public class AppMain {

    public static void main(String[] args) {

        // English: Print "Hello world!" to the console.
        // Türkçe: Konsola "Hello world!" yazdır.
        System.out.println("Hello world!");

        // English: Print "Merhaba" without a newline character.
        // Türkçe: Satır sonu karakteri olmadan "Merhaba" yazdır.
        System.out.print("Merhaba");

        // English: Continue the same line with " Dünya".
        // Türkçe: Aynı satırı " Dünya" ile devam ettir.
        System.out.print(" Dünya");

        // English: Print a new line character for cleaner output.
        // Türkçe: Daha temiz bir çıktı için yeni bir satır karakteri yazdır.
        System.out.println();

        // English: Print a custom message in both English and Turkish.
        // Türkçe: Hem İngilizce hem de Türkçe özel bir mesaj yazdır.
        System.out.println("This is a customized message. / Bu özelleştirilmiş bir mesajdır.");

        // English: Print the sum of two numbers.
        // Türkçe: İki sayının toplamını yazdır.
        int num1 = 5, num2 = 10;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2) + " / "
                + num1 + " ve " + num2 + " sayılarının toplamı: " + (num1 + num2));
    }
}
