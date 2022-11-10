package beanpackage;

public class Subject {
	private String name;
	private int subjectcode;
	private int marksaccquired;
	private int semester;

	public Subject(String name, int subjectcode, int marksaccquired, int semester) {
		super();
		this.name = name;
		this.subjectcode = subjectcode;
		this.marksaccquired = marksaccquired;
		this.semester = semester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}

	public int getMarksaccquired() {
		return marksaccquired;
	}

	public void setMarksaccquired(int marksaccquired) {
		this.marksaccquired = marksaccquired;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

}
