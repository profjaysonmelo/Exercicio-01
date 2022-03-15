
public class Automovel {

	private String cor;
	private String modelo;
	private String marca;
	
	public void atribuirCor(String cor) {
		this.cor = cor;
	}
	
	public String obterCor() {
		return this.cor;
	}
	
	public void atribuirModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String obterModelo() {
		return this.modelo;
	}
	
	public void atribuirMarca(String marca) {
		this.marca = marca;
	}
	
	public String obterMarca() {
		return this.marca;
	}
}
