public interface MetodeBayar {

    String nama();

    // Kontrak totalBayar: hasilnya tidak pernah negatif.
    int totalBayar(int totalBelanja);
}