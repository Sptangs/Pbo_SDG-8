class Lamaran extends Entitas implements Tampil {
    String namaPelamar;
    Lowongan lowongan;
    String status;

    void mengisiData(int id, String namaPelamar, Lowongan lowongan, String status) {
        this.id = id;
        this.namaPelamar = namaPelamar;
        this.lowongan = lowongan;
        this.status = status;
    }

    @Override
    void mengisiData() {
    }

    public void tampilInfo() {
        System.out.println("===== LAMARAN =====");
        System.out.println("ID       : " + id);
        System.out.println("Pelamar  : " + namaPelamar);
        System.out.println("Posisi   : " + lowongan.posisi);
        System.out.println("Status   : " + status);
    }
}