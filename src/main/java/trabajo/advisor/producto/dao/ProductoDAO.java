package trabajo.advisor.producto.dao;

import org.springframework.data.repository.CrudRepository;

import trabajo.advisor.producto.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
