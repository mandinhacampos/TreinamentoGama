
public class BombaDeCombustivel {

	private String combustivel;
	private double precoLitro, qtdeLitro, totalPagar;
	
	public BombaDeCombustivel(String combustivel, double precoLitro){
		this.combustivel=combustivel;
		this.precoLitro=precoLitro;
	}
	
	public void abastecerPorValor(double totalPagar){
		this.totalPagar=totalPagar;
		this.qtdeLitro=this.totalPagar/this.precoLitro;
	}
	
	public void abastecerPorLitro(double qtdeLitro){
		this.qtdeLitro=qtdeLitro;
		this.totalPagar= this.qtdeLitro*this.precoLitro;
	}
	
	public String exibirRecibo(){
		String recibo = "------------------------------------------\n"+
						"        ISIDROCORP GAS & ENERGY           \n"+
						"------------------------------------------\n"+
						"\n"+
						"Combustível: "+combustivel+"\n"+
						"Preço Litro: R$ "+ String.format("%.3f\n", precoLitro) + "\n" +
						"Quantidade: " + String.format("%.3f\n", qtdeLitro) + "\n" +
						"Valor TOTAL: R$ "+ String.format("%.2f\n", totalPagar) + "\n" +
						"\n" + "------------------------------------------\n"+ "\n" +
						"Agradecemos a preferência!";
		return recibo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitro() {
		return qtdeLitro;
	}

	public void setQtdeLitro(double qtdeLitro) {
		this.qtdeLitro = qtdeLitro;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	
	
}
