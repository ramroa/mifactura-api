package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatosFiscales {
	@JsonProperty("certificado_pem")
	public String getCertificado_pem() {
		return this.certificado_pem;
	}

	public void setCertificado_pem(String certificado_pem) {
		this.certificado_pem = certificado_pem;
	}

	String certificado_pem;

	@JsonProperty("llave_pem")
	public String getLlave_pem() {
		return this.llave_pem;
	}

	public void setLlave_pem(String llave_pem) {
		this.llave_pem = llave_pem;
	}

	String llave_pem;

	@JsonProperty("llave_password")
	public String getLlave_password() {
		return this.llave_password;
	}

	public void setLlave_password(String llave_password) {
		this.llave_password = llave_password;
	}

	String llave_password;
}
