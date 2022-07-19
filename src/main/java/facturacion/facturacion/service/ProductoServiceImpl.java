package facturacion.facturacion.service;

import facturacion.facturacion.model.Producto;
import facturacion.facturacion.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository repository;
    @Override
    public Producto buscarPorId(int producto) {
        return repository.findById(producto).orElse(null);
    }

    @Override
    public List<Producto> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Producto crear(Producto producto) throws Exception {
        return repository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) throws Exception {
        if (buscarPorId(producto.getProducto()) != null) {
            return repository.save(producto);
        } else {
            throw new Exception( "Producto no existe" );
        }
    }
}
