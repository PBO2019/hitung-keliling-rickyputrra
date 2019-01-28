public class Main {

    public static void main(String[]Args){
        System.out.println("Hello World !");
        bujurSangkar bangun  = new bujurSangkar();
        Lingkaran ruang = new Lingkaran();

        bangun.setSisi(4);
        bangun.hitungluas();
        System.out.println("Luas BujurSangkar adalah"+bangun.getLuas());

        ruang.setR(5);
        ruang.setPhi(3.14);
        ruang.hitunglingkaran();
        System.out.println("Keliling Lingkaran adalah"+ruang.getKeliling());
    }
}
