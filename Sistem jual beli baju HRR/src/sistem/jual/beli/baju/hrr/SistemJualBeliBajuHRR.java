package sistem.jual.beli.baju.hrr;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemJualBeliBajuHRR {

    static Scanner input = new Scanner(System.in);
    static ArrayList<BajuEntity> databaju = new ArrayList();
    static LemariBaju lemari=new LemariBaju();
    
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Toko Baju");
        System.out.println("==========================================");
        int pil;
        System.out.print("INPUT NAMA PEMBELI BAJU  = ");
        String namapembeli = input.next();
        lemari.Namapembeli(namapembeli);
        do {
            System.out.println("1. Input Baju");
            System.out.println("2. View ");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch (pil) {
                case 1:
                    inputbaju();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    System.out.println("Data yang ingin di hapus");
                    String jenisBaju = input.next();
                    hapus(jenisBaju);
                    break;
                case 4:
                    System.out.print("Inputkan Jenis Baju  = ");
                    jenisBaju = input.next();
                    System.out.print("Jumlah beli = ");
                    int newjumlahBaju = input.nextInt();
                    System.out.print("Harga Baru  = ");
                    int newharga = input.nextInt();
                    update(jenisBaju, newjumlahBaju, newharga);
                    break;
            }
            System.out.println("==========================================");
        } while (pil != 5);
    }

    static void inputbaju() {
        System.out.print("INPUT JENIS KAIN  = ");
        String jenisBaju = input.next();
        System.out.print("INPUT HARGA = ");
        int harga = input.nextInt();
        System.out.print("UKURAN BAJU  = ");
        String ukuran = input.next();
        System.out.print("JUMLAH BAJU = ");
        int jumlahBaju = input.nextInt();
        int total = 0;
        databaju.add(new BajuEntity(jumlahBaju, harga, total, jenisBaju, ukuran));
    }

    static void view() {
        System.out.println("Pembeli = "+lemari.getNamapembeli());
        for (int i = 0; i < databaju.size(); i++) {
            System.out.println("JENIS BAJU  = " + databaju.get(i).getJenisBaju());
            System.out.println("HARGA       = " + databaju.get(i).getHarga());
            System.out.println("UKURAN      = " + databaju.get(i).getUkuran());
            System.out.println("JUMLAH BELI = " + databaju.get(i).getJumlahBaju());
            System.out.println("TOTAL HARGA BELI =" + databaju.get(i).getTotal());
            System.out.println("==========================================");
        }
    }

    static int caribarang(String jenisBaju) {
        int indexbarang = -1;
        for (int i = 0; i < databaju.size(); i++) {
            if (jenisBaju == (databaju.get(i).getJenisBaju())) {
                indexbarang = i;
            }
        }
        return indexbarang;
    }

    static void hapus(String jenisBaju) {
        for (int i = 0; i < databaju.size(); i++) {
            if (jenisBaju.equals(databaju.get(i).getJenisBaju())) {
                databaju.remove(databaju.get(i));
                System.out.println("Data Telah Di Hapus");
                System.out.println("==========================================");
            } 
        }
    }

    static void update(String jenisBaju, int newjumlahBaju, int newharga) {
        for (int i = 0; i < databaju.size(); i++) {
            if (jenisBaju.equals(databaju.get(i).getJenisBaju())) {
                databaju.get(i).jumlahBaju = newjumlahBaju;
                databaju.get(i).harga = newharga;
                System.out.println("Data Telah DI Update");
            } 
        }
    }

}
