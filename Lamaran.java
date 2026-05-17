class Lamaran extends Entitas implements Tampil {
    String namaPelamar;
    Lowongan lowongan;
    String status;

    void mengisiData(int id,
            String namaPelamar,
            Lowongan lowongan,
            String status)
            throws IllegalArgumentException {
        if (namaPelamar == null || namaPelamar.trim().isEmpty()) {
            throw new IllegalArgumentException(" Nama pelamar tidak boleh kosong!");
        }
        if (lowongan == null) {
            throw new IllegalArgumentException(" Lowongan tidak boleh null!");
        }
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException(" Status tidak boleh kosong!");
        }
        this.id = id;
        this.namaPelamar = namaPelamar;
        this.lowongan = lowongan;
        this.status = status;
    }

    @Override
    void mengisiData() {
    }

    public void tampilInfo() {
        try {

            System.out.println("===== LAMARAN =====");
            System.out.println("ID       : " + id);
            System.out.println("Pelamar  : " + namaPelamar);
            if (lowongan != null) {
                System.out.println("Posisi   : " + lowongan.posisi);
            } else {
                System.out.println("Posisi   : [Tidak tersedia]");
            }
            System.out.println("Status   : " + status);
        } catch (NullPointerException e) {

            System.out.println(" Error NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Terjadi error: " + e.getMessage());
        } finally {
            System.out.println(" Proses tampilInfo selesai.");
        }
    }
}