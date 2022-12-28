public abstract class Transaksi {

    protected int jumlah, bayar, tunai, kembalian, tqty;
    private String NamaKasir;
    private  String idKasir;

    int no[] = new int[50];
    int qty[] = new int[50];
    int harga[] = new int[50];
    int total[] = new int[50];
    String namamenu[] = new String[50];

    abstract void menu();
     abstract void proses();
     abstract void run();
     abstract void struk();
}
