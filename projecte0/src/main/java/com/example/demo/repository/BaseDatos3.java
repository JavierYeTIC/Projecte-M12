package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Libro;

public interface BaseDatos3 extends JpaRepository<Libro, Integer>{

	/*public void inserta(Libro libro);					//save

	public ArrayList<Libro> getLibros();					//deleteById

	public void borrar(int id);							//save

	public void modifica(Libro libro);						//findById

	public Libro getLibro(int id);							//findAll

	public boolean compruebaUsuario(String usuario, String password);//NO*/
	

}
