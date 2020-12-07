package org.ifunpas.kpl.kode;

public class Pemain {
	private String nama;
	private int noPunggung;
	
	public Pemain(String nama, int noPunggung) {
		this.nama = nama;
		this.noPunggung = noPunggung;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNoPunggung(int noPunggung) {
		this.noPunggung = noPunggung;
	}
	
	public int getNoPunggung() {
		return noPunggung;
	}

}
