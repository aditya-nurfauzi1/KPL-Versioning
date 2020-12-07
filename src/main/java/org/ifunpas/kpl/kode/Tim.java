package org.ifunpas.kpl.kode;

import java.util.ArrayList;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Pemain> getPemainInti() {
		return pemainInti;
	}

	public void setPemainInti(List<Pemain> pemainInti) {
		this.pemainInti = pemainInti;
	}
	

	public boolean tambahPemainInti(Pemain pemain) {
		if(pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama() + "berhasil ditambahkan sebagai pemain inti.");
			return true;
		}
		else {
			System.out.println(pemain.getNama() + "tidak berhasil ditambahkan sebagai pemmain inti.");
			return false;
		}
	}

}
