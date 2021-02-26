import java.util.HashMap;

public class MenghapusNilai {
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

                // mencetak semua isi dari objek
                System.out.println("Menu hari ini: " + makanan);
                
                // menghapus menu Sate 
                makanan.remove(7);
                System.out.println("Menghapus menu yang jarang dibeli : " + makanan);

                // menampilkan menu hari minggu
                makanan.clear();
                System.out.println("Menu hari minggu : " + makanan);
    }
}
