/**
 * 
 */
package models;

/**
 * @author nightmare
 *
 */
public class ModeloCarros {
	
		
		private Integer id;
		private String valor;
		private String modelo;
		private TipoNegocio tipoNegocio;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public TipoNegocio getTipoNegocio() {
			return tipoNegocio;
		}
		public void setTipoNegocio(TipoNegocio tipoNegocio) {
			this.tipoNegocio = tipoNegocio;
		}

		

	
}
