import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int cont;
        System.out.println("Olá! Quantos números deleja informar?"); int tamVet = sc.nextInt();
        int vetNums[] = new int[tamVet];
        for (int i = 0; i<tamVet; i++){
            System.out.print("\nDigite o " + (i+1) + "º valor: \n");
                int valorDigitado = sc.nextInt();
                if (valorDigitado == 0) {
                    break;
                }   else {
                    vetNums[i] = valorDigitado;
                }
                soma = soma + valorDigitado;
                cont ++;
        }
        double media = (double)soma/tamVet;


        for (int i = 0; i<tamVet; i++){
            System.out.println("\nQuantidade de números digitados: " + tamVet);
            System.out.println("\nSoma total: " + soma);
            System.out.println("\nMédia: " + media);
        }
    }
}