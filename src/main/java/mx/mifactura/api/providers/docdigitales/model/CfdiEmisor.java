package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiEmisor {
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

	@JsonProperty("regimen_fiscal")
	public String getRegimen_fiscal() {
		return this.regimen_fiscal;
	}

	public void setRegimen_fiscal(String regimen_fiscal) {
		this.regimen_fiscal = regimen_fiscal;
	}

	String regimen_fiscal;
}
