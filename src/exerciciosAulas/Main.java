package exerciciosAulas;

public class Main {
    public static void main(String[] args){
        Carro bmwAzul = new Carro("i4", "bmw", 2020, "amarelo", 600.1, 99999.99, 250, "preto");
       // System.out.println(bmwAzul.toString());

        Carro golVermelho = new Carro("g4", "volks", 2010, "branco", 100, 15000, 200, "azul");

        bmwAzul.Acelerar();
        bmwAzul.Freiar();
    }
}


