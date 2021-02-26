import java.util.HashMap;

public class MengubahNilai {
    public static void main(String[] args) {
        
        // membuat objek 
        HashMap<Integer, String> makanan = new HashMap<Integer, String>();

        // mengisi nilai ke objek 
        makanan.put(1, "Soto");
        makanan.put(2, "Bakso");
        makanan.put(3, "Kare");
        makanan.put(4, "Opor");
        makanan.put(5, "Rendang");
        makanan.put(6, "Ayam goreng");
        makanan.put(7, "Sate");

        // mengubah menu Kare menjadi Cilor
        makanan.put(3, "Cilor");

        // mengubah Cilor menjadi Sup Buntut
        makanan.replace(3, "Sup Buntut");

        // menampilkan hasil
        System.out.println("Menu hari ini : " + makanan);
    }
}
