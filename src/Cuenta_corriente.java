public class Cuenta_corriente {
    private Titular titular;
    private String num_cuenta;
    private double saldo;

    public Cuenta_corriente(){

    }

    public Cuenta_corriente (Titular ctitular, String cnum_cuenta){
        titular = ctitular;
        num_cuenta = cnum_cuenta;
        saldo = 15.3;
    }

    public Cuenta_corriente(Titular ctitular, String cnum_cuenta, double csaldo) {
        titular = ctitular;
        num_cuenta = cnum_cuenta;
        saldo = csaldo;
    }

    public void ingreso (double cantidad){
        saldo+=cantidad;
    }

    public void retirada (double cantidad){
        saldo-=cantidad;
    }

    public String datos_cuenta(){
        return num_cuenta+" dispone de un saldo de "+saldo+" euros.";
    }

    public String comparar (Cuenta_corriente CcuentaCorriente){
        boolean iguales = true;
        if (getNum_cuenta().compareTo(CcuentaCorriente.getNum_cuenta()) == 0){
            return "Son iguales";
        }
        else{
            return "No son iguales";
        }
    }
    //GETTERS SETTERS


    public Titular getTitular() {
        return titular;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
