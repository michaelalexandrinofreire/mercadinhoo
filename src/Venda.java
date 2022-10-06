
import java.util.ArrayList;

public class Venda {
	public double precoDoCarrinho;
	public double precoDoCarrinhoComDesconto;
	protected String politicaDesconto;
	
	private ArrayList<Produto> carrinhoDeCompras = new ArrayList<Produto>();

	public Venda(String politicaDesconto) {
		this.politicaDesconto = politicaDesconto;
	}
	public void adicionarProduto(Produto P){
		carrinhoDeCompras.add(P);
		precoDoCarrinho += P.getPrecoPodruto();
		System.out.println(P.getNomeProduto() + " adicionado ao carrinho.");
		System.out.println("Valor das compras é R$:"+precoDoCarrinho);
	}
	public void removerProduto(Produto P){
		carrinhoDeCompras.remove(P);
		precoDoCarrinho = getPrecoDoCarrinho() - P.getPrecoPodruto();
		System.out.println(P.getNomeProduto() + " removido do carrinho.");
		System.out.println("Valor das compras é R$:"+precoDoCarrinho);
	}

	public double getPrecoDoCarrinho() {
		return precoDoCarrinho;
	}

	public void setPrecoDoCarrinho(double precoDoCarrinho) {
		this.precoDoCarrinho = precoDoCarrinho;
	}

	public ArrayList<Produto> getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setCarrinhoDeCompras(ArrayList<Produto> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}
	public double getPrecoDoCarrinhoComDesconto() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		DescontoFactory.setNomeDoDesconto(this.getPoliticaDesconto()); 
		setPrecoDoCarrinhoComDesconto(DescontoFactory.getInstance().getEstrategiaDesconto().calculaDesconto(this)); 
		return precoDoCarrinhoComDesconto;
	}
	
	public void setPrecoDoCarrinhoComDesconto(double precoDoCarrinhoComDesconto) {
		this.precoDoCarrinhoComDesconto = precoDoCarrinhoComDesconto;
	}
	public String getPoliticaDesconto() {
		return politicaDesconto;
	}
	public void setPoliticaDesconto(String politicaDesconto) {
		this.politicaDesconto = politicaDesconto;
	}
	
	
		
	
	
	
	
}
