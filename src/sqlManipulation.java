public class sqlManipulation{
	
	String statement;

	public static String getSQL(String field, String table, String condition){
		this.field = field;
		this.table = table;
		this.condition = condition;

		statement = "SELECT " + field + " FROM " + table + " Where " + condition;

		return output;
	}	
}
