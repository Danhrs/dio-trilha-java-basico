import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro Parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Parametro: ");
        int parametroDois = terminal.nextInt();

        try{

            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O valor do parametro UM deve ser maior que o parametro DOIS!");
        }


    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        else {
            int contagem = parametroDois - parametroUm;

            for(int i = parametroUm; i <= contagem; i++ ){
                System.out.println("O valor é:"+ i);
            }
        }
    }

	@Override
	public String toString() {
		return "Contador []";
	}
}