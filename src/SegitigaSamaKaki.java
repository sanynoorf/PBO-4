class SegitigaSamaKaki extends Segitiga {
    SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi, tinggi);
    }

    @Override
    double luas() {
        return 0.5 * sisiA * sisiB;
    }
}