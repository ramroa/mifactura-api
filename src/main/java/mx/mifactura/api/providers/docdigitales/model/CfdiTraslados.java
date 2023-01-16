package mx.mifactura.api.providers.docdigitales.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiTraslados {
	@JsonProperty("cfdi__traslado")
	public ArrayList<CfdiTraslado> getCfdi__traslado() {
		return this.cfdi__traslado;
	}

	public void setCfdi__traslado(ArrayList<CfdiTraslado> cfdi__traslado) {
		this.cfdi__traslado = cfdi__traslado;
	}

	ArrayList<CfdiTraslado> cfdi__traslado;
}
