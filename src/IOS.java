public class IOS implements OS {
	public void inicializar() {
		System.out.println("Iniciando IOS.");
	}

	public void gerenciarApps() {
		System.out.println();

		AparelhoTelefonico telefone = new  TelefoneApp();
		telefone.ligar("11987654321");
		telefone.atender();
		telefone.iniciarCorreioVoz();

		System.out.println();

		ReprodutorMusical musicaApp = new MusicaApp();
		musicaApp.selecionarMusica("Lofi");
		musicaApp.tocar();
		musicaApp.pausar();

		System.out.println();

		NavegadorInternet navegador = new NavegadorInternetApp();
		navegador.adicionarNovaAba();
		navegador.exibirPagina("http://localhost.br");
		navegador.atualizarPagina();
	}
}
