package com.aliyagiztar;

public class Insan {

    // English: Declare the variables for the human body parts.
    // Türkçe: İnsan vücut parçaları için değişkenleri tanımla.
    private String bas;      // Head
    private String govde;    // Body
    private String ayak;     // Feet
    private String cinsiyet; // Gender

    // English: Declare variables for height and weight.
    // Türkçe: Boy ve kilo için değişkenleri tanımla.
    private double boy;      // Height
    private double kilo;     // Weight

    // English: Constructor to initialize an Insan object.
    // Türkçe: Bir Insan nesnesini başlatmak için yapıcı metot.
    public Insan(String bas, String govde, String ayak, String cinsiyet, double boy, double kilo) {
        this.bas = bas;
        this.govde = govde;
        this.ayak = ayak;
        this.cinsiyet = cinsiyet;
        this.boy = boy;
        this.kilo = kilo;
    }

    // English: Getters and Setters for each variable.
    // Türkçe: Her değişken için getter ve setter metodları.
    // ... (Getters and Setters methods here)

    // Additional methods to interact with the Insan class can also be added.
    // Insan sınıfıyla etkileşim kurmak için ek metodlar da eklenebilir.
}
