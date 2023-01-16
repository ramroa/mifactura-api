package mx.mifactura.api.service;

import mx.mifactura.api.providers.docdigitales.descargar.request.DescargarRequest;
import mx.mifactura.api.providers.docdigitales.descargar.response.DescargarResponse;
import mx.mifactura.api.providers.docdigitales.model.ErrorResponse;
import mx.mifactura.api.providers.docdigitales.model.GenerarFacturaRequest;

public interface IFacturaService {
	
	
	public ErrorResponse generarFactura(GenerarFacturaRequest request);

	public DescargarResponse descargarFactura(DescargarRequest request);
	

}
