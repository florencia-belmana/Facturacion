package facturacion.facturacion.controller;


import facturacion.facturacion.model.Cliente;
import facturacion.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crear(cliente);
    }

    @PostMapping("actualizar")
    public Cliente actualizarCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.actualizar(cliente);
    }

    //VER OBJET EN SERVICE
    @GetMapping("/{clienteid}")
    public Cliente buscarPorId(@PathVariable int clienteid) {
        return clienteService.buscarPorId(clienteid);
    }


}
