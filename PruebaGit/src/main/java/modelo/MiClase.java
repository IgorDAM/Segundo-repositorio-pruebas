package modelo;

import Interface.Miinterfaz;

public class MiClase implements Miinterfaz{

	@Override
	public int metododevuelveentero() {
		// TODO Auto-generated method stub
		
		
		int mientero=5;
		int otroEntero = mientero-3;
		int resultado = otroEntero;
		
		
		return resultado;
	}

}
