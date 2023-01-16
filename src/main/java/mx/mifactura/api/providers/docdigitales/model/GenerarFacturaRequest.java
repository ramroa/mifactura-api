package mx.mifactura.api.providers.docdigitales.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GenerarFacturaRequest {
	@JsonGetter("meta")
	public Meta getMeta() {
		return this.meta;
	}

	
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	
	Meta meta;

	@JsonGetter("data")
	public ArrayList<Datum> getData() {
		return this.data;
	}

	@JsonSetter("datos") //Postman
	public void setData(ArrayList<Datum> data) {
		this.data = data;
	}

	ArrayList<Datum> data;
}
