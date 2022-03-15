import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		Automovel a1 = new Automovel();
		
		String corDoCarro = a1.obterCor();
		System.out.println(corDoCarro);
		
		a1.atribuirCor( leia.next() );
		a1.atribuirMarca( leia.next() );
		a1.atribuirModelo( leia.next() );
		
		System.out.println(a1.obterCor() + "-" + a1.obterMarca() + "-" + a1.obterModelo());
		
		Oficina oficina = new Oficina();
		oficina.atribuirProprietario("Fulano da Silva");
		oficina.atribuirQtdeFuncionarios(3);
		oficina.atribuirValorHora(49.00);
		oficina.atribuirQtdeHorasSemanais(44);
		
		System.out.println(oficina.obterProprietario() + "-" + oficina.obterQtdeFuncionarios() 
			+ "-" + oficina.obterValorHora());
		
		System.out.println(oficina.exibirDadosOficina());
		
		Automovel a2 = new Automovel();
		a2.atribuirCor("VERDE");
		a2.atribuirMarca("VW");
		a2.atribuirModelo("BRASILIA");
		
		System.out.println(a2.obterCor() + "-" + a2.obterMarca() + "-" + a2.obterModelo());
	}
}
