package facturacion.facturacion.service;

import facturacion.facturacion.model.Comprobante;
import facturacion.facturacion.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
@Service
public class ComprobanteServiceImpl implements ComprobanteService{

    @Autowired
    private ComprobanteRepository repository;

    //metodos//
    @Override
    public Comprobante crear(Comprobante comprobante) throws Exception {
        if (buscarComprobantePorId(comprobante.getComprobanteid()) == null){
            return  repository.save(comprobante);
            //  return repository.save(comprobante);
        } else {
            throw new Exception( "El comprobante ya existe");
        }
        // ARRAY CON DATOS DEL COMPROBANTE(ID CLIENTE + ID PRODUCTO), ITERARLOS Y MOSTRARLOS
        // MOSTRAR VENTA, DEALLE, FECHA (EXTERNO, DSP), CLIENTE, LISA DE PROD. Y SUS CARAC. TOTAL
    }

    @Override
    public List<Comprobante> buscarTodosLosComprobantes() {
        return repository.findAll();
    }
    @Override
    public Comprobante buscarComprobantePorId(int comprobanteid) {
        return repository.findById(comprobanteid).orElse(null);
    }
    @Override
    public Comprobante actualizar(Comprobante comprobante) throws Exception {
        if (buscarComprobantePorId(comprobante.getComprobanteid()) != null){

            return repository.save(comprobante);
        } else {
        throw new Exception("El comprobante ya existe");
        }
    }


}

