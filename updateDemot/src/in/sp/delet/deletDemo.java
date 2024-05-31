package in.sp.delet;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
public class deletDemo  {
	public static void main(String[] args) throws Exception
	{
//TODO Auto-generated method stub
		String email1 ="berhan@gamil.com";
		
		
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection Con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "12345");
       
      PreparedStatement ps= Con.prepareStatement("delete from  register where email=?");
     
      ps.setString(1,email1);
     
      
      int  count = ps.executeUpdate();
      
      if(count >0 )
      {
    	  System.out.println("delete is success");
      }
      else
      {
    	  System.out.println("delete faileld");
      }
      
      Con.close();
      
	}

}
