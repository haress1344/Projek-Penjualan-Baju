package sistem.jual.beli.baju.hrr;

public class LemariBaju {

    int jumlahBaju;
    String jenisBaju, ukuran;
    private String namapembeli;

    public void Namapembeli(String konsumen) {
        this.namapembeli = konsumen;
    }
    
    public String getNamapembeli() {
        return namapembeli;
    }
    
}
