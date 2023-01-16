package mx.mifactura.api.providers.docdigitales.descargar.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescargarResponse {
	@JsonProperty("meta")
	public Meta getMeta() {
		return this.meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	Meta meta;

	@JsonProperty("data")
	public ArrayList<Datum> getData() {
		return this.data;
	}

	public void setData(ArrayList<Datum> data) {
		this.data = data;
	}

	ArrayList<Datum> data;
}