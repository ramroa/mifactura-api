package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Cfdi {
	@JsonProperty("cfdi__comprobante")
	public CfdiComprobante getCfdi__comprobante() {
		return this.cfdi__comprobante;
	}

	public void setCfdi__comprobante(CfdiComprobante cfdi__comprobante) {
		this.cfdi__comprobante = cfdi__comprobante;
	}

	CfdiComprobante cfdi__comprobante;
}
