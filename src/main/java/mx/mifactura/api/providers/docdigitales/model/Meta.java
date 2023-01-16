package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
	@JsonProperty("empresa_uid")
	public String getEmpresa_uid() {
		return this.empresa_uid;
	}

	public void setEmpresa_uid(String empresa_uid) {
		this.empresa_uid = empresa_uid;
	}

	String empresa_uid;

	@JsonProperty("empresa_api_key")
	public String getEmpresa_api_key() {
		return this.empresa_api_key;
	}

	public void setEmpresa_api_key(String empresa_api_key) {
		this.empresa_api_key = empresa_api_key;
	}

	String empresa_api_key;

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
}
