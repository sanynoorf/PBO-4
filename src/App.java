public class App {
    public static void main(String[] args) {
        BangunDatar[] bangunDatarArray = new BangunDatar[6];
        bangunDatarArray[0] = new Lingkaran(7);
        bangunDatarArray[1] = new SegitigaSamaSisi(4);
        bangunDatarArray[2] = new SegitigaSamaKaki(3, 4);
        bangunDatarArray[3] = new SegitigaSikuSiku(3, 4);
        bangunDatarArray[4] = new Persegi(6);
        bangunDatarArray[5] = new SegitigaSembarang(6,5 , 4);
       

        for (BangunDatar bangunDatar : bangunDatarArray) {
            System.out.println("Nama: " + bangunDatar.getClass().getSimpleName());
            System.out.println("Luas: " + bangunDatar.luas());
            System.out.println("Keliling: " + bangunDatar.keliling());
            System.out.println();
        }
    }
}