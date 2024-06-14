abstract class NavegadorInternet implements Navegabilidade {
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
	};

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina " + url + ".");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina.");
	}
}
