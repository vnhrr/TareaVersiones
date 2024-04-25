public class Principal {
    public static void main(String[] args) {
        Cuenta_corriente[] cuentas = new Cuenta_corriente[2];
        cuentas[0] = new Cuenta_corriente(new Titular("ivan", "herrero", 27)
                , "78235646", 500);
        cuentas[1] = new Cuenta_ahorro(new Titular("Tefy", "Sanchez", 23)
                , "12387", 3);

        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i].getTitular();
        }
    }
}
