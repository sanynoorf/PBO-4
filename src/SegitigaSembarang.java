class SegitigaSembarang extends Segitiga {
    SegitigaSembarang(double sisiA, double sisiB, double sisiC) {
        super(sisiA, sisiB, sisiC);
    }

    @Override
    double luas() {
        double s = keliling() / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}