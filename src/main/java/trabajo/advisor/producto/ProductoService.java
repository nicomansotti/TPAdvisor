package trabajo.advisor.producto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import trabajo.advisor.producto.dao.ProductoDAO;
import trabajo.advisor.producto.entity.Producto;
import trabajo.advisor.producto.helper.TiendaHelper;

@Service
public class ProductoService {

	@Autowired
	@Qualifier("tiendaCapital")
	TiendaHelper tiendaHelper;

	@Autowired
	private ProductoDAO productoDAO;

	public List<Producto> listar() {
		return (List<Producto>) productoDAO.findAll();
	}

	public List<Producto> listarBaratos() {		
		List<Producto> listaProductos = (List<Producto>) productoDAO.findAll();
		listaProductos = listaProductos.stream().filter(p -> p.getPrecio() <= 500.0).collect(Collectors.toList());
		return listaProductos;
	}	

	public Producto getProducto(Long id) {
		Producto producto = productoDAO.findById(id).orElse(null);
		Double precioActualizado = tiendaHelper.precioActualizado(producto.getPrecio());
		producto.setPrecio(precioActualizado);
		return producto;
	}

}
