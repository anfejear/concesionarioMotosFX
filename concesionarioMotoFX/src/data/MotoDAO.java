package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Moto;


public class MotoDAO {
    private Connection connection;

    public MotoDAO(Connection connection) {
        this.connection = connection;
    }



	public ArrayList<Moto> fetchDisponibles() {
        ArrayList<Moto> motos = new ArrayList<>();

        return motos;
	}

	public ArrayList<Moto> fetchNoDisponibles() {
        ArrayList<Moto> motos = new ArrayList<>();              
        
        return motos;
	}


	public void actualizarNoDisponible(int referencia) {

	}

	public void actualizarDisponible(int referencia) {

	}
	
	
	



}
