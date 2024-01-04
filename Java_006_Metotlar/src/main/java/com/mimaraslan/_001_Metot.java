package com.mimaraslan;

public class _001_Method {

    // This method draws a line
    // Bu metod bir çizgi çizer
    public static void drawLine() {
        System.out.println("- - -");
    }

    public static void main(String[] args) {

        // Loop to draw the line five times
        // Beş kez çizgi çizmek için döngü
        for (int i = 0; i < 5; i++) {
            drawLine(); // Call the drawLine method to draw a line
                        // Bir çizgi çizmek için drawLine metodu çağrılır
        }

    }
}
