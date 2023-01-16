package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {
	@JsonProperty("datos_fiscales")
	public DatosFiscales getDatos_fiscales() {
		return this.datos_fiscales;
	}

	public void setDatos_fiscales(DatosFiscales datos_fiscales) {
		this.datos_fiscales = datos_fiscales;
	}

	DatosFiscales datos_fiscales;

	@JsonProperty("cfdi")
	public Cfdi getCfdi() {
		return this.cfdi;
	}

	public void setCfdi(Cfdi cfdi) {
		this.cfdi = cfdi;
	}

	Cfdi cfdi;
}
