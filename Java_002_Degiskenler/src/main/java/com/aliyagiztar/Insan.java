package com.aliyagiztar;

public class Insan { // scope kapsam

    public static void main(String[] args) {

        // İnsan adı ve soyadı için String değişkenleri tanımlayalım.
        // Let's define String variables for the first name and last name of a person.
        String firstName = "Berkay";
        String lastName = "Kaya";

        // Kiloyu temsil eden bir Integer değişkeni tanımlayalım.
        // Let's define an Integer variable representing weight.
        Integer kilo = 65;

        // Boyu temsil eden bir double değişkenini tanımlayalım.
        // Let's define a double variable representing height.
        double boy = 1.77; // Not: Boy, ondalık kısmı ile birlikte doğru bir şekilde ifade edilmelidir.

        // İnsanın adını, soyadını, kilosunu ve boyunu ekrana yazdıralım.
        // Let's print the person's first name, last name, weight, and height to the screen.
        System.out.println("Adı: " + firstName);
        System.out.println("Soyadı: "+ lastName);
        System.out.println("Kilo: " + kilo);
        System.out.println("Boy: " + boy);

        // Değişkenlere yeni değerler atayarak bir başka kişinin bilgilerini gösterelim.
        // Let's assign new values to the variables to represent another person's information.
        firstName = "Abdurrahman";
        lastName = "Bıldırcın";
        kilo = 88;
        boy = 1.82;

        // Yeni kişinin boyunu ve kilosunu ekrana yazdıralım, aynı zamanda ad ve soyadını birleştirip gösterelim.
        // Let's print the height and weight of the new person, and also display their full name.
        System.out.println("\n\nBOY: "+ boy + " - KİLO "+ kilo +  "\n" +   firstName + " " + lastName);
    }
}
