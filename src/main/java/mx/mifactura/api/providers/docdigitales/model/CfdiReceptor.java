package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiReceptor {
	@JsonProperty("rfc")
	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	String rfc;

	@JsonProperty("nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String nombre;

	@JsonProperty("uso_cfdi")
	public String getUso_cfdi() {
		return this.uso_cfdi;
	}

	public void setUso_cfdi(String uso_cfdi) {
		this.uso_cfdi = uso_cfdi;
	}

	String uso_cfdi;
}
