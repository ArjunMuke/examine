package beanpackage;

public class Student {
	private int id;
	private String name;
	private String dept;
	private int rank;
	private int total;

	public Student(int id, String name, String dept, int rank, int total) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.rank = rank;
		this.total = total;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;

	}
}
