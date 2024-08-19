package exerciciosAulas;

public class Carro {

    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public double ptMotor;
    public double valor;
    public int velMaxima;
    public String retrovisor;


    public Carro(String modelo, String marca, int ano, String cor, double ptMotor, double valor, int velMaxima, String corDoRetrovisor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.ptMotor = ptMotor;
        this.valor = valor;
        this.velMaxima = velMaxima;
        this.retrovisor = corDoRetrovisor;
    }

    @Override
    public String toString() {
        return marca + "  " + modelo + "  " + cor + "  "  +ano + "  " + ptMotor + "  " + valor + "  " + velMaxima;
    }

    public void Acelerar(){
        System.out.println("Acelerou ");
    } public void Freiar(){
        System.out.println("Freiou");
    }


}
