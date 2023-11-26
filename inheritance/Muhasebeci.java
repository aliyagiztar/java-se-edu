package inheritance;

public class Muhasebeci extends Personel {
    private String unvani;
    private Long sertifikano;

    // Yapıcı metot (Constructor)
    public Muhasebeci(String unvani, Long sertifikano) {
        this.unvani = unvani;
        this.sertifikano = sertifikano;
    }

    // Getter ve setter metotları gerektiği gibi eklenebilir

    public static void main(String[] args) {
        // Muhasebeci nesnesinin örneğini oluşturma
        Muhasebeci muhasebeci = new Muhasebeci("Muhasebe Uzmanı", 123456789L);
        // Burada muhasebeci nesnesi ile ilgili işlemleri yapabilirsiniz
    }
}
