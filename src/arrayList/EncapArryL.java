package arrayList;

public class EncapArryL {
	private String name;
	private int marks[];

	 EncapArryL(String name, int marks[]){
		this.marks = marks;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks.length;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}


}