package mx.mifactura.api.providers.docdigitales.descargar.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
	@JsonProperty("descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	String descripcion;
}
