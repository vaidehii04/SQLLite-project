import java.sql.*; 

public class sqlMiddle {  
	public static void main(String[] args)
      {
        try
        (
          // create a database connection
          Connection connection = DriverManager.getConnection("jdbc:sqlite:db/test.db");
          Statement statement = connection.createStatement();
        )
        {
          statement.setQueryTimeout(30);  // set timeout to 30 sec.

          statement.executeUpdate("drop table if exists person");
          statement.executeUpdate("create table person (id integer, name string)");
          statement.executeUpdate("insert into person values(1, 'leo')");
          statement.executeUpdate("insert into person values(2, 'yui')");
          ResultSet rs = statement.executeQuery("select * from person");
          while(rs.next())
          {
            // read the result set
            System.out.println("name = " + rs.getString("name"));
            System.out.println("id = " + rs.getInt("id"));
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          e.printStackTrace(System.err);
        }
      }
}
