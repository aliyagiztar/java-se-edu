package KoleksiyonTorbalarOrnek;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ogretmen {
    private String adi;
    private String soyadi;
    private String kimlikNo;
    private List brans; // Java'da değişken isimleri küçük harfle başlamalıdır.
}
