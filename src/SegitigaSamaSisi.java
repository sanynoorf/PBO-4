class SegitigaSamaSisi extends Segitiga {
    SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }

    @Override
    double luas() {
        double s = keliling() / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}