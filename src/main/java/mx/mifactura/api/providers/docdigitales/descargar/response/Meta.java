package mx.mifactura.api.providers.docdigitales.descargar.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
	@JsonProperty("ambiente")
	public String getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	String ambiente;

	@JsonProperty("objeto")
	public String getObjeto() {
		return this.objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	String objeto;

	@JsonProperty("respuesta_uid")
	public String getRespuesta_uid() {
		return this.respuesta_uid;
	}

	public void setRespuesta_uid(String respuesta_uid) {
		this.respuesta_uid = respuesta_uid;
	}

	String respuesta_uid;
}
