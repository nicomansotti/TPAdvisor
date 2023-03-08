package trabajo.advisor.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabajo.advisor.producto.entity.Producto;

@RestController
@RequestMapping("productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.listar();
	}
	
	@GetMapping("/listar/baratos")
	public List<Producto> listarBaratos() {
		return productoService.listarBaratos();
	}

	@GetMapping("/{id}")
	public Producto getProducto(@PathVariable Long id) {
		return productoService.getProducto(id);
	}

}
