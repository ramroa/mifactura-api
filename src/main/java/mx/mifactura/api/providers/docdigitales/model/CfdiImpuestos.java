package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiImpuestos {
	@JsonProperty("cfdi__traslados")
	public CfdiTraslados getCfdi__traslados() {
		return this.cfdi__traslados;
	}

	public void setCfdi__traslados(CfdiTraslados cfdi__traslados) {
		this.cfdi__traslados = cfdi__traslados;
	}

	CfdiTraslados cfdi__traslados;
}
