class PembayaranBase {
    protected int jumlah;

    public PembayaranBase(int jumlah) {
        this.jumlah = jumlah;
    }

    public void proses() {
        System.out.println("Pembayaran: " + jumlah);
    }
}

class TransferBankInh extends PembayaranBase {
    public TransferBankInh(int jumlah) {
        super(jumlah);
    }

    @Override
    public void proses() {
        System.out.println("Transfer Bank (Inheritance): " + jumlah);
    }
}

class EWalletInh extends PembayaranBase {
    public EWalletInh(int jumlah) {
        super(jumlah);
    }

    @Override
    public void proses() {
        System.out.println("E-Wallet (Inheritance): " + jumlah);
    }
}

interface IPembayaran {
    void proses(int jumlah);
}

class TransferBankInt implements IPembayaran {
    public void proses(int jumlah) {
        System.out.println("Transfer Bank (Interface): " + jumlah);
    }
}

class EWalletInt implements IPembayaran {
    public void proses(int jumlah) {
        System.out.println("E-Wallet (Interface): " + jumlah);
    }
}

public class Pembayaran {
    public static void main(String[] args) {

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
