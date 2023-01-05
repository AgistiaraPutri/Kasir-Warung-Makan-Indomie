import java.sql.SQLOutput;

public class Kasir {
    public static void main(String[] args) {

        DataPetugas dt = new DataPetugas();
        System.out.println("======== SELAMAT DATANG ========");
        System.out.print("Nama Petugas : ");
        dt.NamaPetugas();
        System.out.print("Id Petugas   : ");
        dt.idPetugas();
        System.out.println("--------------------------------\n");

        DataMenu mn  = new DataMenu();
        System.out.println("\t\t==========================");
        System.out.println("\t\t     WARMINDO AGIS'S      ");
        System.out.println("\t\t==========================");

        mn.menu();
        mn.proses();
        mn.run();
        mn.struk();
    }
}