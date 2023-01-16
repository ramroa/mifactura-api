package mx.mifactura.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.mifactura.api.providers.docdigitales.descargar.request.DescargarRequest;
import mx.mifactura.api.providers.docdigitales.descargar.response.DescargarResponse;
import mx.mifactura.api.providers.docdigitales.model.ErrorResponse;
import mx.mifactura.api.providers.docdigitales.model.GenerarFacturaRequest;
import mx.mifactura.api.service.IFacturaService;

@RestController
@RequestMapping("/v1/factura")
public class FacturacionController {
	
	@Autowired
	//@Qualifier("docDigitalesFacturaService")
	private IFacturaService facturaService;
	
	
	@PostMapping
	public ErrorResponse generarFacturar(@RequestBody GenerarFacturaRequest request) {
		try {
			return facturaService.generarFactura(request);
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping("/xml")
	public DescargarResponse descargarFactura(@RequestBody DescargarRequest request) {
		try {
			return facturaService.descargarFactura(request);
		} catch (Exception e) {
			return null;
		}
	}

}
