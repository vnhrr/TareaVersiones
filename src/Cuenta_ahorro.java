class Cuenta_ahorro extends Cuenta_corriente{

    private double interes;
    public Cuenta_ahorro(Titular ctitular, String cnum_cuenta, double csaldo, double cinteres) {
        super(ctitular, cnum_cuenta, csaldo);
        interes = cinteres;
    }
    public Cuenta_ahorro(Titular ctitular, String cnum_cuenta, double cinteres) {
        super(ctitular, cnum_cuenta, 15.3);
        interes = cinteres;
    }

    public Cuenta_ahorro(Titular ctitular, String cnum_cuenta) {
        super(ctitular, cnum_cuenta, 15.3);
        interes = 2.5;
    }

    public void calcular_interes(){
        double incre;
        incre=getSaldo()*(interes/100);
        incre = getSaldo()+incre;
        setSaldo(incre);
    }

    //GETTERS SETTERS TO STRING

    public double getInteres() {
        return interes;
    }
}
