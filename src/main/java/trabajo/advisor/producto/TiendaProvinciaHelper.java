package trabajo.advisor.producto;

import org.springframework.stereotype.Component;

@Component("tiendaProvincia")
public class TiendaProvinciaHelper implements TiendaHelper {

	@Override
	public Double precioActualizado(Double precio) {
		precio = precio*2;
		return precio;
	}

}
