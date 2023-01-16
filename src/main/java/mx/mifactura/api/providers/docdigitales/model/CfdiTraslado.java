package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiTraslado {
	@JsonProperty("base")
	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	String base;

	@JsonProperty("impuesto")
	public String getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}

	String impuesto;

	@JsonProperty("tipo_factor")
	public String getTipo_factor() {
		return this.tipo_factor;
	}

	public void setTipo_factor(String tipo_factor) {
		this.tipo_factor = tipo_factor;
	}

	String tipo_factor;
}
