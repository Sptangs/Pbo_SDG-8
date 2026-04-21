class Perusahaan extends Entitas implements Tampil {
    String nama, alamat, email;
    void mengisiData(int id, String nama, String alamat, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    @Override
    void mengisiData() {
    }

    public void tampilInfo() {
        System.out.println("===== PERUSAHAAN =====");
        System.out.println("ID     : " + id);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email  : " + email);
    }
}   