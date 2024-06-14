abstract class ReprodutorMusical implements ReprodutorAudiovisual {
	public void selecionarMusica(String musica) {
		 System.out.println("Selecionando a musica " + musica + ".");
	};

	@Override
	public void tocar() {
		 System.out.println("Tocando musica.");
	}

	@Override
	public void pausar() {
		 System.out.println("Pausando musica.");
	}
}
