package com.juliansyah.irman.belajar.ajakngobrol;

import java.sql.*;

public class MahasiswaDAO{
	private Connection koneksiDB;
	private String dbDriver = "com.mysql.jdbc.Driver";
	private String dbUrl = "jdbc:mysql://localhost/belajar";
	private String dbUsername = "root";
	private String dbPassword = "";
	public void connect(){
		try{
			Class.forName(dbDriver);
			koneksiDB = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void disconnect(){
		try{
			if(koneksiDB != null){
				koneksiDB.close();
			}
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void save(Mahasiswa m){
		try{
			connect();
			String sql = "insert into mahasiswa(npm,nama,kelas) values (?,?,?)";
			
			PreparedStatement ps = koneksiDB.prepareStatement(sql);
			ps.setString(1, m.getNpm());
			ps.setString(2, m.getNama());
			ps.setString(3, m.getKelas());
			
			ps.executeUpdate();
			
			disconnect();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}