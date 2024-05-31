package updateDemot;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
public class update2Demo   {
	public static void main(String[] args) throws Exception
	{
//TODO Auto-generated method stub
		String city1 = "asko";
		String email1 ="berhan@gamil.com";
		
		
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection Con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "12345");
       
      PreparedStatement ps= Con.prepareStatement("update register set city=? where email=?");
      ps.setString(1,city1);
      ps.setString(2,email1);
     
      
      int  count = ps.executeUpdate();
      
      if(count >0 )
      {
    	  System.out.println("success");
      }
      else
      {
    	  System.out.println(" fail");
      }
      
      Con.close();
      
	}

}
