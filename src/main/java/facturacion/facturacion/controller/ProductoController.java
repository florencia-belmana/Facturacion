package facturacion.facturacion.controller;

import facturacion.facturacion.model.Producto;
import facturacion.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("facturacion/productos")
@RestController

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> obtenerProducto() {
        return productoService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Producto buscarProductoPorId(@PathVariable int producto) {
        return productoService.buscarPorId(producto);
    }
    @PostMapping("/actualizar")
    public Producto actualizarProducto(@RequestBody Producto producto) throws Exception {
        return productoService.actualizar(producto);
    }

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto) throws Exception {
        return productoService.crear(producto);
    }


}
