package it.fgorlani.test.ArrayList;

public class Cella {
	private String nomeColonna;
	private String tipoColonna;
	private String valore;
	

	@Override
	public String toString() {
		return "InformazioniCella [nomeColonna=" + nomeColonna + ", tipoColonna=" + tipoColonna + ", valore=" + valore
				+ "]";
	}

	public String getTipoColonna() {
		return tipoColonna;
	}

	public void setTipoColonna(String tipoColonna) {
		this.tipoColonna = tipoColonna;
	}

	public String getNomeColonna() {
		return nomeColonna;
	}

	public void setNomeColonna(String nomeColonna) {
		this.nomeColonna = nomeColonna;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}


}
