package sistem.jual.beli.baju.hrr;

public class BajuEntity extends LemariBaju {

    int harga, total;

    public BajuEntity(int jumlahBaju, int harga, int total, String jenisBaju, String ukuran) {
        this.jumlahBaju = jumlahBaju;
        this.harga = harga;
        this.total = total;
        this.jenisBaju = jenisBaju;
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        total = harga * jumlahBaju;
        return total;
    }


    public int getJumlahBaju() {
        return jumlahBaju;
    }

    public String getJenisBaju() {
        return jenisBaju;
    }

    public String getUkuran() {
        return ukuran;

    }
}
