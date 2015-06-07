package com.juliansyah.irman.belajar.ajakngobrol;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MahasiswaServlet extends HttpServlet {
	private MahasiswaDAO mahasiswaDao = new MahasiswaDAO();
	public void doGet(HttpServletRequest req, HttpServletResponse res){
	
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		try{
			Mahasiswa m = new Mahasiswa();
			m.setNpm(req.getParameter("npm"));
			m.setNama(req.getParameter("nama"));
			m.setKelas(req.getParameter("kelas"));
			
			mahasiswaDao.save(m);
			
			res.sendRedirect("form.html");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}