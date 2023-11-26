package java_InterfaceArayuz.com.aliyagiztar;

public class Otobus extends Arac {
    // Sınıf özellikleri
    private String plakaNumarasi;
    private short modelYili;
    private String modelseri;
    private boolean sunucuDurumu;

    public static void main(String[] args) {
        // Otobus sınıfından bir nesne oluşturma ve bazı işlemler yapma
        Otobus otobus = new Otobus();
        // otobus ile ilgili işlemler burada yapılabilir
    }

    // Otobus sınıfı için getter ve setter metodları eklenebilir
    // Örnek:
    public String getPlakaNumarasi() {
        return plakaNumarasi;
    }

    public void setPlakaNumarasi(String plakaNumarasi) {
        this.plakaNumarasi = plakaNumarasi;
    }

    // Diğer getter ve setter metodları...
}
