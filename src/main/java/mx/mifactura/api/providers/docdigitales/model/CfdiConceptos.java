package mx.mifactura.api.providers.docdigitales.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiConceptos {
	@JsonProperty("cfdi__concepto")
	public ArrayList<CfdiConcepto> getCfdi__concepto() {
		return this.cfdi__concepto;
	}

	public void setCfdi__concepto(ArrayList<CfdiConcepto> cfdi__concepto) {
		this.cfdi__concepto = cfdi__concepto;
	}

	ArrayList<CfdiConcepto> cfdi__concepto;
}
