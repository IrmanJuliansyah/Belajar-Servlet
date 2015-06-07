package com.juliansyah.irman.belajar.ajakngobrol;

public class Mahasiswa {
	private Integer id;
	private String npm;
	private String nama;
	private String kelas;
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNpm(){
		return npm;
	}
	
	public void setNpm(String x){
		this.npm = x;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(String x){
		this.nama = x;
	}
	
	public String getKelas(){
		return kelas;
	}
	
	public void setKelas(String x){
		this.kelas = x;
	}
}