class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double luas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}