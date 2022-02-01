package one.digitalinnovation.gof.singleton;

/** 
 * Singleton "preguiçoso".
 * 
 * @see <a href = "https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author mauriciolariao
 * */
public class SingletonLazyHolder {

	//encapsula a instancia em uma classe statica interna
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();;
	}
	
	private SingletonLazyHolder() {
		super ();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return InstanceHolder.instancia;
	}
}
