public abstract class IPhone {
	public static void ligar(OS os) {
		os.inicializar();
	}

	public static void main(String[] args) {
		OS ios = new IOS();
		ligar(ios);
		ios.gerenciarApps();
	};
}
