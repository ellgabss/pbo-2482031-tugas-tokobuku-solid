public class Voucher implements MetodeBayar {

    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    // Percobaan LSP: return totalBelanja - nilai; pada keranjang kedua mencetak
    //Voucher Rp100.000    : Rp-36.000
    // Hasil negatif melanggar kontrak MetodeBayar.totalBayar.
    // Diperbaiki dengan Math.max(0, ...) supaya hasilnya tidak pernah di bawah nol.

    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja - nilai);
        //return totalBelanja - nilai;
    }
}