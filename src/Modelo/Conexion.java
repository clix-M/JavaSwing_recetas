package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class  Conexion { 
	 
	/* 
	private static String URL = "jdbc:mysql://containers-us-west-109.railway.app:8019/railway";
	private static String USER = "root";
	private static String PASSWORD = "Rki2zsbhuvHszyLezasQ";
	*/
	
	
	private static String URL = "jdbc:mysql://localhost:3306/myssql_recetas";
	private static String USER = "root";
	private static String PASSWORD = "root";
	

	  public static Connection getConnection() {
		  Connection connection = null;
		  
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection = DriverManager.getConnection(URL,USER,PASSWORD);
			  /*
			  if(connection != null) {
				  System.out.println("conexion exitosa.");
			  }else {
				  System.out.println("Algo salio mal.");
			  }
			  */
			  
		  }catch (SQLException | ClassNotFoundException e) {
	            System.out.println(e);
	        }
		  
		  return connection;
		  
		  
	  }


	
}



   







    


