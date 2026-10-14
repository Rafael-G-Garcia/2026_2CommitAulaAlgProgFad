import java.util.Scanner;

public class Veiculo {
    String modelo;
    int ano;
    String placa;

    public Veiculo(){

    }

    public Veiculo(String _modelo, int _ano, String _placa){
        this.modelo = _modelo;
        this.ano = _ano;
        this.placa = _placa;
    }

    public void Imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
    }
    public void Cadastrar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, digite o modelo do carro: ");
        this.modelo = sc.next();
        System.out.print("Digite o ano do carro: ");
        this.ano = sc.nextInt();
        System.out.print("Digite a placa do carro: ");
        this.placa = sc.next();

    }
}

