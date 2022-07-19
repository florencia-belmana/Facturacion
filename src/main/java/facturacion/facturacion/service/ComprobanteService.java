package facturacion.facturacion.service;

import facturacion.facturacion.model.Cliente;
import facturacion.facturacion.model.Comprobante;

import java.util.List;


public interface ComprobanteService {

    Comprobante crear(Comprobante comprobante) throws Exception;

    List<Comprobante> buscarTodosLosComprobantes();

    Comprobante actualizar(Comprobante comprobante) throws Exception;

    Comprobante buscarComprobantePorId(int comprobanteid);
}
