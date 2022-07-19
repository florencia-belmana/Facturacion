package facturacion.facturacion.controller;


import facturacion.facturacion.model.Comprobante;
import facturacion.facturacion.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    //////METODOS/////

    //PARA PODER ACTUALIZAR CON ID//
    @GetMapping("/{comprobanteid}")
    public Comprobante buscarComprobantePorId(@PathVariable int comprobanteid) {
        return comprobanteService.buscarComprobantePorId(comprobanteid);
    }

    @PostMapping ("/crear")
    public Comprobante crearComprobante(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.crear(comprobante);
    }

    @PostMapping("/actualizar")
    public Comprobante actualizarComprobante(@RequestBody Comprobante comprobante) throws Exception {
        return comprobanteService.actualizar(comprobante);
    }

    @GetMapping("/all")
    public List<Comprobante> obtenerComprobante() {
        return comprobanteService.buscarTodosLosComprobantes();
    }
}
