package com.aliyagiztar;

public class Degiskenler {

    public static void main(String[] args) {
        // İnt (int) türünde bir değişken oluşturalım ve değer atayalım.
        // Let's create a variable of type 'int' and assign a value to it.
        int myInt = 20;

        // Byte (byte) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'byte' and assign a value to it.
        byte myByte = 20;

        // Short (short) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'short' and assign a value to it.
        short myShort = 20;

        // Long (long) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'long' and assign a value to it.
        long myLong = 20L;

        // Double (double) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'double' and assign a value to it.
        double myDouble = 20.0;

        // Float (float) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'float' and assign a value to it.
        float myFloat = 20.0f;

        // Char (char) türünde bir değişken oluşturalım ve değer atayalım.
        // Create a variable of type 'char' and assign a value to it.
        char myChar = 'A';

        // Boolean (boolean) türünde bir değişken oluşturalım ve değer atayalım (true veya false).
        // Create a variable of type 'boolean' and assign a value to it (true or false).
        boolean myBoolean = true;

        // Değişkenlerin değerlerini ekrana yazdıralım.
        // Let's print the values of the variables to the screen.
        System.out.println("My int: " + myInt);
        System.out.println("My byte: " + myByte);
        System.out.println("My short: " + myShort);
        System.out.println("My long: " + myLong);
        System.out.println("My char: " + myChar);

        // Aralarında bir ayırıcı ekleyelim.
        // Let's add a separator between them.
        System.out.println("----------------------------------");

        // Kutulu (boxed) veri türlerini kullanarak aynı işlemi yapalım.
        // Let's perform the same operations using boxed data types.
        Integer myInteger = 20;
        Byte myByte2 = 20;
        Short myShort2 = 20;
        Long myLong2 = 20L;
        Double myDouble2 = 20.0;
        Float myFloat2 = 20.0f;
        Character myCharacter2 = 'A';
        Boolean myBoolean2 = true;

        // Kutulu değişkenlerin değerlerini ekrana yazdıralım.
        // Let's print the values of the boxed variables to the screen.
        System.out.println("My Integer: " + myInteger);
        System.out.println("My Byte: " + myByte2);
        System.out.println("My Short: " + myShort2);
        System.out.println("My Long: " + myLong2);
    }
}
