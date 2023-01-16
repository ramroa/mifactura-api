package mx.mifactura.api.providers.docdigitales.descargar.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Destinatario {
	@JsonProperty("correo")
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	String correo;
}
