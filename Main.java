public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();
        perusahaan.mengisiData(1, "PT Maju Jaya", "Bandung", "hr@mail.com");

        Lowongan lowongan1 = new Lowongan();
        lowongan1.mengisiData(1, perusahaan, "Java Developer", "Backend", "Bandung");

        Lowongan lowongan2 = new Lowongan();
        lowongan2.mengisiData(2, perusahaan, "Frontend Developer", "React Developer", "Jakarta");

        Lamaran lamaran1 = new Lamaran();
        lamaran1.mengisiData(1, "Budi", lowongan1, "Diproses");

        Lamaran lamaran2 = new Lamaran();
        lamaran2.mengisiData(2, "Andi", lowongan2, "Diterima");

        Printer printer = new Printer();

        printer.cetak(perusahaan);
        printer.cetak(lowongan1);
        printer.cetak(lowongan2);
        printer.cetak(lamaran1);
        printer.cetak(lamaran2);

        System.out.println("\n================ PEMBAYARAN =================");
        System.out.println("=== INHERITANCE ===");

        PembayaranBase p1 = new TransferBankInh(100000);
        PembayaranBase p2 = new EWalletInh(50000);

        p1.proses();
        p2.proses();
        System.out.println("\n=== INTERFACE ===");

        IPembayaran i1 = new TransferBankInt();
        IPembayaran i2 = new EWalletInt();

        i1.proses(150000);
        i2.proses(75000);
    }
}
