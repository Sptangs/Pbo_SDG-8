public class Pembayaran {

    public interface IPembayaran {
        void bayar(int jumlah);
    }

    public static class TransferBank implements IPembayaran {
        private String bank;

        public TransferBank(String bank) {
            this.bank = bank;
        }

        public void bayar(int jumlah) {
            System.out.println("Bank: " + bank);
            System.out.println("Bayar: " + jumlah);
        }
    }

    public static class EWallet implements IPembayaran {
        private String nama;

        public EWallet(String nama) {
            this.nama = nama;
        }

        public void bayar(int jumlah) {
            System.out.println("E-Wallet: " + nama);
            System.out.println("Bayar: " + jumlah);
        }
    }
}