abstract class AparelhoTelefonico implements Telefone {
    public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio voz do aparelho telefonico.");
    }

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero " + numero + ".");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao.");
	}
}
