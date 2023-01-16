package mx.mifactura.api.providers.docdigitales.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CfdiConcepto {
	@JsonProperty("clave_producto_servicio")
	public String getClave_producto_servicio() {
		return this.clave_producto_servicio;
	}

	public void setClave_producto_servicio(String clave_producto_servicio) {
		this.clave_producto_servicio = clave_producto_servicio;
	}

	String clave_producto_servicio;

	@JsonProperty("clave_unidad")
	public String getClave_unidad() {
		return this.clave_unidad;
	}

	public void setClave_unidad(String clave_unidad) {
		this.clave_unidad = clave_unidad;
	}

	String clave_unidad;

	@JsonProperty("cantidad")
	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	String cantidad;

	@JsonProperty("descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	String descripcion;

	@JsonProperty("valor_unitario")
	public String getValor_unitario() {
		return this.valor_unitario;
	}

	public void setValor_unitario(String valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	String valor_unitario;

	@JsonProperty("importe")
	public String getImporte() {
		return this.importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}

	String importe;

	@JsonProperty("unidad")
	public String getUnidad() {
		return this.unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	String unidad;

	@JsonProperty("no_identificacion")
	public String getNo_identificacion() {
		return this.no_identificacion;
	}

	public void setNo_identificacion(String no_identificacion) {
		this.no_identificacion = no_identificacion;
	}

	String no_identificacion;

	@JsonProperty("cfdi__impuestos")
	public CfdiImpuestos getCfdi__impuestos() {
		return this.cfdi__impuestos;
	}

	public void setCfdi__impuestos(CfdiImpuestos cfdi__impuestos) {
		this.cfdi__impuestos = cfdi__impuestos;
	}

	CfdiImpuestos cfdi__impuestos;
}
