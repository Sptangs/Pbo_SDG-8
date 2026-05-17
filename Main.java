public class Main {

    public static void main(String[] args) {

        try {
            Perusahaan perusahaan = new Perusahaan();

            try {
                perusahaan.mengisiData(1, "PT Maju Jaya", "Bandung", "hr@mail.com");
            } catch (Exception e) {
                System.out.println("Error data perusahaan: " + e.getMessage());
            }

            Lowongan lowongan1 = new Lowongan();

            try {
                lowongan1.mengisiData(1, perusahaan, "Java Developer", "Backend", "Bandung");
            } catch (Exception e) {
                System.out.println("Error lowongan1: " + e.getMessage());
            }

            Lowongan lowongan2 = new Lowongan();

            try {
                lowongan2.mengisiData(2, perusahaan, "Frontend Developer", "React Developer", "Jakarta");
            } catch (Exception e) {
                System.out.println("Error lowongan2: " + e.getMessage());
            }

            Lamaran lamaran1 = new Lamaran();

            try {
                lamaran1.mengisiData(1, "Budi", lowongan1, "Diproses");
            } catch (IllegalArgumentException e) {
                System.out.println("Error lamaran1: " + e.getMessage());
            }

            Lamaran lamaran2 = new Lamaran();

            try {
                lamaran2.mengisiData(2, "Budi", lowongan2, "Diterima");
            } catch (IllegalArgumentException e) {
                System.out.println("Error lamaran2: " + e.getMessage());
            }

            Printer printer = new Printer();

            try {
                printer.cetak(perusahaan);
                printer.cetak(lowongan1);
                printer.cetak(lowongan2);
                printer.cetak(lamaran1);
                printer.cetak(lamaran2);
            } catch (Exception e) {
                System.out.println("Error saat mencetak data: " + e.getMessage());
            }

            System.out.println("\n================ PEMBAYARAN =================");
            System.out.println("=== INHERITANCE ===");

            try {
                PembayaranBase p1 = new TransferBankInh(100000);
                PembayaranBase p2 = new EWalletInh(50000);

                p1.proses();
                p2.proses();
            } catch (Exception e) {
                System.out.println("Error pembayaran inheritance: " + e.getMessage());
            }

            System.out.println("\n=== INTERFACE ===");

            try {
                IPembayaran i1 = new TransferBankInt();
                IPembayaran i2 = new EWalletInt();

                i1.proses(150000);
                i2.proses(75000);
            } catch (Exception e) {
                System.out.println("Error pembayaran interface: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan sistem: " + e.getMessage());
        } finally {
            System.out.println("\nProgram selesai dijalankan.");
        }
    }
}