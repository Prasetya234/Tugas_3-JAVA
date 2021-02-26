import java.util.HashMap;

class MengambilNilai {
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

        // menampilkan semua isi
        System.out.println("Menu makanan hari ini adalah : " + makanan);

        // menampilkan makanan yang sepesial
        System.out.println("Menu sepesial Hari ini : " + makanan.get(4));
    }
}