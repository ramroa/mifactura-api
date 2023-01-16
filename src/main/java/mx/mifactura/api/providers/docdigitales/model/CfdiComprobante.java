package mx.mifactura.api.providers.docdigitales.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiComprobante {
	@JsonProperty("folio")
	public String getFolio() {
		return this.folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	String folio;

	@JsonProperty("fecha")
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	Date fecha;

	@JsonProperty("tipo_comprobante")
	public String getTipo_comprobante() {
		return this.tipo_comprobante;
	}

	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}

	String tipo_comprobante;

	@JsonProperty("lugar_expedicion")
	public String getLugar_expedicion() {
		return this.lugar_expedicion;
	}

	public void setLugar_expedicion(String lugar_expedicion) {
		this.lugar_expedicion = lugar_expedicion;
	}

	String lugar_expedicion;

	@JsonProperty("forma_pago")
	public String getForma_pago() {
		return this.forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	String forma_pago;

	@JsonProperty("metodo_pago")
	public String getMetodo_pago() {
		return this.metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	String metodo_pago;

	@JsonProperty("moneda")
	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	String moneda;

	@JsonProperty("tipo_cambio")
	public String getTipo_cambio() {
		return this.tipo_cambio;
	}

	public void setTipo_cambio(String tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	String tipo_cambio;

	@JsonProperty("subtotal")
	public String getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	String subtotal;

	@JsonProperty("total")
	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	String total;

	@JsonProperty("cfdi__emisor")
	public CfdiEmisor getCfdi__emisor() {
		return this.cfdi__emisor;
	}

	public void setCfdi__emisor(CfdiEmisor cfdi__emisor) {
		this.cfdi__emisor = cfdi__emisor;
	}

	CfdiEmisor cfdi__emisor;

	@JsonProperty("cfdi__receptor")
	public CfdiReceptor getCfdi__receptor() {
		return this.cfdi__receptor;
	}

	public void setCfdi__receptor(CfdiReceptor cfdi__receptor) {
		this.cfdi__receptor = cfdi__receptor;
	}

	CfdiReceptor cfdi__receptor;

	@JsonProperty("cfdi__conceptos")
	public CfdiConceptos getCfdi__conceptos() {
		return this.cfdi__conceptos;
	}

	public void setCfdi__conceptos(CfdiConceptos cfdi__conceptos) {
		this.cfdi__conceptos = cfdi__conceptos;
	}

	CfdiConceptos cfdi__conceptos;
}
