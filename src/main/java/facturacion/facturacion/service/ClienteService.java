package facturacion.facturacion.service;

import facturacion.facturacion.model.Cliente;

import java.util.List;

public interface ClienteService {

    //PRA PODER ACTUALIZAR busco por id
    Cliente buscarPorId(int clienteId);

    //PEDIDOS
    Cliente crear(Cliente cliente) throws Exception;
    Cliente actualizar(Cliente cliente) throws Exception;

/*   /* List<Cliente> buscarTodos();*/
}
