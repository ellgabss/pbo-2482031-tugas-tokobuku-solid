public class StrukPrinter {

    public static void cetakKeranjang(String judul, Keranjang keranjang) {
        int sisa = 41 - judul.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        System.out.println("=".repeat(kiri) + " " + judul + " " + "=".repeat(kanan));
        for (Buku buku : keranjang.getIsi()) {
            System.out.println(buku.getJudul() + " (" + buku.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(buku.getHarga()));
            System.out.println("  Keterangan  : " + buku.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(buku.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public static void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar metode : pilihan) {
            System.out.printf("%-20s : %s%n", metode.nama(), Buku.formatRupiah(metode.totalBayar(totalBelanja)));
        }
    }
}