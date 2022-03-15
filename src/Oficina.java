
public class Oficina {

	private String proprietario;
	private double valorHora;
	private int qtdeFuncionarios;
	private int qtdeHorasSemanais;
	
	public void atribuirProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public String obterProprietario() {
		return this.proprietario;
	}
	
	public void atribuirValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double obterValorHora() {
		return this.valorHora;
	}
	
	public void atribuirQtdeFuncionarios(int qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}
	
	public int obterQtdeFuncionarios() {
		return this.qtdeFuncionarios;
	}
	
	public void atribuirQtdeHorasSemanais(int qtdeHorasSemanais) {
		this.qtdeHorasSemanais = qtdeHorasSemanais;
	}
	
	public int obterQtdeHorasSemanais() {
		return this.qtdeHorasSemanais;
	}
	
	public double calcularValorGastoSemanal() {
		return this.qtdeFuncionarios * this.valorHora * this.qtdeHorasSemanais;
	}
	
	public String exibirDadosOficina() {
		return "Nome do Proprietario:" + this.proprietario 
				+ " | Gasto Semanal: " + calcularValorGastoSemanal();
	}
	
}
