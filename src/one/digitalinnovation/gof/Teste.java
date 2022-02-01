package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Testes relacionados ao padrao de projeto - Singleton
		//retorna a mesma instancia
//		SingletonLazy lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		
//		//retorna a mesma instancia
//		SingletonEager eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		
//		//retorna a mesma instancia
//		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
//		System.out.println(holder);
//		holder = SingletonLazyHolder.getInstancia();
//		System.out.println(holder);
		
		//Strategy
//		Comportamento normal = new ComportamentoNormal();
//		Comportamento defensivo = new ComportamentoDefensivo();
//		Comportamento agressivo = new ComportamentoAgressivo();
//		
//		Robo robo = new Robo();
//		robo.setComportamento(normal);
//		robo.mover();
//		robo.mover();
//		
//		robo.setComportamento(defensivo);
//		robo.mover();
//		robo.mover();
//		
//		robo.setComportamento(agressivo);
//		robo.mover();
//		robo.mover();
		
		//Facade
		Facade facade = new Facade();
		String nome = "Maurício";
		String cep = "05782545";
		facade.migrarCliente(nome, cep);
	}
}
