
public class PoliticaDesconto2 {
	public double calculaDesconto(Venda v) {
		if(v.getPrecoDoCarrinho()>10){
			return v.getPrecoDoCarrinho() - 1;
		}
		return v.getPrecoDoCarrinho();
	}
}
