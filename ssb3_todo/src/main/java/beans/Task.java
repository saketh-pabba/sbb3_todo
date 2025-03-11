package beans;

import java.util.Objects;

public class Task {
	private int taskid;
	private String taskName;
	private String tadskdate;
	private int taskstatus;
	private int regid;
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTadskdate() {
		return tadskdate;
	}
	public void setTadskdate(String tadskdate) {
		this.tadskdate = tadskdate;
	}
	public int getTaskstatus() {
		return taskstatus;
	}
	public void setTaskstatus(int taskstatus) {
		this.taskstatus = taskstatus;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(regid, tadskdate, taskName, taskid, taskstatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return regid == other.regid && Objects.equals(tadskdate, other.tadskdate)
				&& Objects.equals(taskName, other.taskName) && taskid == other.taskid && taskstatus == other.taskstatus;
	}
	
}
