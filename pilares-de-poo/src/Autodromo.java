public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("5968450");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("6845087");

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
