class SegitigaSikuSiku extends Segitiga {
    SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
    }

    @Override
    double luas() {
        return 0.5 * sisiA * sisiB;
    }
}