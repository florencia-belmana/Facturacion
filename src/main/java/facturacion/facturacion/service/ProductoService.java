package facturacion.facturacion.service;

import facturacion.facturacion.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto buscarPorId(int producto);
    List<Producto> buscarTodos();
    Producto crear(Producto producto) throws Exception;
    Producto actualizar(Producto producto) throws Exception;


}
