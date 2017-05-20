package ketnoi;

public class ChuoiKetNoi {
	public String name="root";
	public String pass="1411";
	//String sql="jdbc:mysql://localhost:3306/ckeditor";
	String sql = String.format(
		        "jdbc:mysql://google/%s?cloudSqlInstance=%s&"
		            + "socketFactory=com.google.cloud.sql.mysql.SocketFactory", "ckeditor","clear-faculty-168102:asia-northeast1:dtdmnhom12");
	
	public String getSQL()
	{
		return sql;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
}
