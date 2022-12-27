import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DataMenu extends Transaksi{
    Scanner input = new Scanner(System.in);
    Locale h = new Locale("in", "ID");
    NumberFormat o = NumberFormat.getCurrencyInstance(h);
    @Override
    public void menu() {

        System.out.println("Pilihan Menu Makanan");
        System.out.println("1. Indomie Dok-dok");
        System.out.println("2. Magelangan Aceh");
        System.out.println("3. Magelangan Rendang");
        System.out.println("4. Megelangan Geprek");
        System.out.println("5. Nasi Orak-arik");

        System.out.println("Pilihan Menu Minuman");
        System.out.println("6. Es Teh");
        System.out.println("7. Es Jeruk");
        System.out.println("8. Marimas/Nutrisari");
    }

    @Override
    public void proses() {
        System.out.println("---------------------------------------------");
        System.out.println("Masukkan Jumlah Menu : ");
        jumlah = input.nextInt();
        for (int i = 0; i < jumlah ; i++){
            System.out.println("Menu ke - "+(i+1)+ " : No : ");
            no[i] = input.nextInt();
            System.out.println("             Qty : ");
            qty[i] = input.nextInt();

            switch (no[i]){
                case 1:
                    namamenu[i]="Indomie Dok-dok";
                    harga[i] = 11000;
                    break;
                case 2:
                    namamenu[i]="Magelangan Aceh";
                    harga[i] = 13000;
                    break;
                case 3:
                    namamenu[i]="Magelangan Rendang";
                    harga[i] = 13000;
                    break;
                case 4:
                    namamenu[i]="Magelangan Geprek";
                    harga[i] = 12000;
                    break;
                case 5:
                    namamenu[i]="Nasi Orak-arik";
                    harga[i] = 10000;
                    break;
                case 6:
                    namamenu[i]="Es Teh";
                    harga[i] = 3000;
                    break;
                case 7:
                    namamenu[i]="Es Jeruk";
                    harga[i] = 4000;
                    break;
                case 8:
                    namamenu[i]="Marimas/Nutrisari";
                    harga[i] = 3000;
                    break;
                default:
                    System.out.println("Menu Tidak Tersedia");

            }
        }

    }

    @Override
    public void run() {
        System.out.println("====================== STRUK PEMBAYARAN =========================");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                        WARMINDO AGIS'S                         " );
        System.out.println("               Jl. Wiroyudo III, Wirosaban, Yogyakarta           ");
        System.out.println("=================================================================\n");
        System.out.println("No  Nama Menu\t\t\t\t Harga\t\t  Qty\t\t Sub Total");
        System.out.println("==================================================================");
        for (int i = 0; i < jumlah ; i++){
            total[i] = qty[i] * harga[i];
            bayar += total[i];
            tqty += qty[i];
            System.out.println((i+1)+"  "+namamenu[i]+" \t\t"+o.format(harga[i])+ " \t\t"+qty[i]+"\t\t"+o.format(total[i]));
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("QTY : "+tqty+"\t\t\t\t\tTOTAL : "+o.format(bayar));
        System.out.println("\t\t\t\t\t\tBAYAR : Rp.");
        tunai = input.nextInt();
        kembalian = tunai - bayar;
        System.out.println("\t\t\t\t\t\tKEMBALI : Rp."+o.format(kembalian));
        System.out.println("------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tTerima Kasih");
        System.out.println("------------------------------------------------------------------");
    }
}
