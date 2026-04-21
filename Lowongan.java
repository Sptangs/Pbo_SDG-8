class Lowongan extends Entitas implements Tampil {
    Perusahaan perusahaan;
    String posisi, deskripsi, lokasi;

    void mengisiData(int id, Perusahaan perusahaan, String posisi, String deskripsi, String lokasi) {
        this.id = id;
        this.perusahaan = perusahaan;
        this.posisi = posisi;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
    }

    @Override
    void mengisiData() {
    }

    public void tampilInfo() {
        System.out.println("===== LOWONGAN =====");
        System.out.println("ID         : " + id);
        System.out.println("Posisi     : " + posisi);
        System.out.println("Perusahaan : " + perusahaan.nama);
        System.out.println("Lokasi     : " + lokasi);
    }
}