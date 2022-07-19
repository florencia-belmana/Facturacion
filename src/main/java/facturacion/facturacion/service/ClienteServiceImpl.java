package facturacion.facturacion.service;

import facturacion.facturacion.model.Cliente;
import facturacion.facturacion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service

public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;
    @Override
    public Cliente buscarPorId(int clienteId) {
        return repository.findById(clienteId).orElse(null);
    }

    @Override
    public Cliente crear(Cliente cliente) throws Exception {
        return repository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente getClienteid) throws Exception {
        if (buscarPorId(Integer.parseInt(getClienteid.toString())) != null) {
            return repository.save(getClienteid);
        } else {
            throw new Exception( "Cliente no existe" );
        }

    }

}
