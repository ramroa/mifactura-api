package mx.mifactura.api.providers.docdigitales.descargar.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Datum {
	@JsonProperty("uuid")
	public ArrayList<String> getUuid() {
		return this.uuid;
	}

	public void setUuid(ArrayList<String> uuid) {
		this.uuid = uuid;
	}

	ArrayList<String> uuid;

	@JsonProperty("destinatarios")
	public ArrayList<Destinatario> getDestinatarios() {
		return this.destinatarios;
	}

	public void setDestinatarios(ArrayList<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}

	ArrayList<Destinatario> destinatarios;

	@JsonProperty("titulo")
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	String titulo;

	@JsonProperty("texto")
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	String texto;

	@JsonProperty("pdf")
	public String getPdf() {
		return this.pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	String pdf;

	@JsonProperty("logo")
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	String logo;
}
