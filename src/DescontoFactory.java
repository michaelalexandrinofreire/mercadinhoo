

public class DescontoFactory {
	public static String nomeDoDesconto;
	public Venda vendaDesconto;
	public double precoComDesconto;
	public static DescontoFactory instance;
	private iCalculaDesconto estrategiaDesconto;

	public static synchronized DescontoFactory getInstance() {
		if (instance == null) {
			instance = new DescontoFactory();
		}
		return instance;
	}

	public iCalculaDesconto getEstrategiaDesconto()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = nomeDoDesconto;
		estrategiaDesconto = (iCalculaDesconto) Class.forName(className).newInstance();
		return estrategiaDesconto;

	}

	public double calculaDesconto(Venda venda) {
		this.precoComDesconto = venda.precoDoCarrinho;

		return this.precoComDesconto;
	}

	public static void setNomeDoDesconto(String nomeDoDesconto) {
		DescontoFactory.nomeDoDesconto = nomeDoDesconto;
	}

}
