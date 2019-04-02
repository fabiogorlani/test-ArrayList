package it.fgorlani.test.ArrayList;

public class RigaTerComuni {
    private String pkId;
	private String des;
    private String cod;

    
    public String getPkId() {
		return pkId;
	}
	public void setPkId(String pkId) {
		this.pkId = pkId;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}

	
	
	@Override
	public String toString() {
		return "RigaTerComuni [pkId=" + pkId + ", des=" + des + ", cod=" + cod + "]";
	}
    
}