package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import beans.Register;
import beans.Task;
import factory.DBConn;

public class ToDoDAOimpl implements ToDoDAo {
	static ToDoDAO toDoDAO;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt1,pstmt2,pstmt3,pstmt4;
	ResultSet rs;
	
	//to make DAO implimentation class singleton
	private ToDoDAOimpl() {
		try {
			con=DBConn.getConn();
			stmt=con.createStatement();
			pstmt1=con.prepareStatement("INSERT INTO register VALUES (???????)");
			pstmt2=con.prepareStatement("INSERT INTO task VALUES(?????)");
			pstmt3=con.prepareStatement("INSERT INTO taskid_pks VALUES(??)");
			pstmt4=con.prepareStatement("UPDATE taskid_pks SET taskid=? WHERE regid=?");
		}catch (Exception e); {
			e.printStackTrace();
		}
		
	}
	@Override
	public int register(Register register) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int login(String email, String pass) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Task> findTaskBYRegId(int regId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addTask(Task task, int regId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean marktaskCompleted(int taskid, int regId) {
		// TODO Auto-generated method stub
		return false;
	}

}
