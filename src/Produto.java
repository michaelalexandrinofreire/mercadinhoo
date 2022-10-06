

public class Produto {
	public String nomeProduto;
	public double precoProduto;
	public double  codigoProduto;
	
	public Produto(String nomeProduto, double precoPodruto) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoPodruto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoPodruto() {
		return precoProduto;
	}
	public void setPrecoPodruto(double precoPodruto) {
		this.precoProduto = precoPodruto;
	}
	public double getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(double codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
}
