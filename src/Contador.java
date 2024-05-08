import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = terminal.nextInt();

        try {
            counter(firstParameter, secondParameter);
        } catch(ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static void counter(int firstParameter, int secondParameter ) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        int count = secondParameter - firstParameter;
        for (int i=1; i<=count; i++)
            System.out.println("Imprimindo o número " + i);
    }
}