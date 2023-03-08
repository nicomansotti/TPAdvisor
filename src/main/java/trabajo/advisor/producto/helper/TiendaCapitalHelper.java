package trabajo.advisor.producto.helper;

import org.springframework.stereotype.Component;

@Component("tiendaCapital")
public class TiendaCapitalHelper implements TiendaHelper {

	@Override
	public Double precioActualizado(Double precio) {
		precio = precio*3;
		return precio;
	}	

}
