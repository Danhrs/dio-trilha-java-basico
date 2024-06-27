

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 18;
        double valorSolicitado = 17;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);

    }
}
