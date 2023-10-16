package lanchonete.atendimento.cozinha;

public class Almoxarife {
    public void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	public void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	//visibilidade default: apenas classes no mesmo nível de pacote pode visualizar esse método
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
