package dao;

import java.util.List;

import beans.Register;
import beans.Task;

public interface ToDoDAo {
	public int register(Register register);
	public int login(String email, String pass);
	public List<Task> findTaskBYRegId(int regId);
	public int addTask(Task task,int regId);
	public boolean marktaskCompleted(int taskid,int regId);
	
	
}
