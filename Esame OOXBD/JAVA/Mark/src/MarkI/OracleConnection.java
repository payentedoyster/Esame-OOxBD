package MarkI;

import java.beans.Statement;
import java.sql.*;

class OracleConnection{
	public static void main(String args[]) throws Exception{
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");
			System.out.println("CONNECTION STATUS = OK");
			con.close();

		}
		catch(ClassNotFoundException e){System.out.println("DRIVER NOT FOUND"); System.out.println(e);}
		catch (SQLException e) {System.out.println("CONNECTION STATUS = FAILURE");System.out.println(e);}
	}


	public void estrai_driver(String url,String user,String psw){


		url = "jdbc:oracle:thin:@localhost:1521:orclcdb";
		user = "system";
		psw = "oracle";


	}
}


