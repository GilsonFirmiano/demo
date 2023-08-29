package via.java.demo;

public class ExerciciosIf {


    public static void main(String[] args) {

        exercicioUm(99);

        exercicioDois(70);

        exercicioTres(50);

    }

    private static void exercicioUm(int valor) {
        if (valor <= 100) {
            System.out.println("exercicioUm - Valor menor ou igual a 100");
        }
    }


    private static void exercicioDois(int valor) {
        if (valor >=10) {
            if (valor <= 100) {
                System.out.println("exercicioDois - Valor entre 10 e 100");
            }
        }
    }

    private static void exercicioTres(int valor) {
        if (valor >=10 && valor <= 100) {
                System.out.println("exercicioTres - Valor entre 10 e 100");
        }
    }

}

/*

1. Receba um valor inteiro e verifique se o valor for menor ou igual a 100.

 Caso seja imprima no terminal que o valor é menor ou igual a 100

2. Receba um valor inteiro e verifique se o valor está entre 10 e 100.

Caso seja imprima no terminal que o valor está entre 10 e 100. (Use if encadeado)


3. Receba um valor inteiro e verifique se o valor está entre 10 e 100.

Caso seja imprima no terminal que o valor está entre 10 e 100. (Use uma condição concatenada)

*/




