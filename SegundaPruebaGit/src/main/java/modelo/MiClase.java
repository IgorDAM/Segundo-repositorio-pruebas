package modelo;

import interfaces.MiInterfaz;

public class MiClase implements MiInterfaz{

	@Override
	public int metododevuelveentero() {
		int mientero= 5;
		int otroentero=mientero-3;
		int resultado=otroentero;
		
		return resultado;
		
		
		
	}

}
