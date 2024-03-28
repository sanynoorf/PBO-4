abstract class Segitiga extends BangunDatar {
    double sisiA, sisiB, sisiC;

    Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    double keliling() {
        return sisiA + sisiB + sisiC;
    }
}