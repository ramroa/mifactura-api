package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
	
	public ErrorResponse() {
		
	}
	
	public ErrorResponse(String cadena) {
		this.descripcion = cadena;
	}
	
	@JsonProperty("error")
	public boolean getError() {
		return this.error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	boolean error;

	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	String code;

	@JsonProperty("descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	String descripcion;
}