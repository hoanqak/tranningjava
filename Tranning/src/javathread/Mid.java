package javathread;

public class Mid {

	private int number;

	public Mid(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	//dung synchronized truoc method de dong bo method nay, du lieu khong sai, trong 1 thoi diem chi 1 thread duoc phep goi method nay, 
	// nhung thread khac phai cho sau khii thread 1 hoan thanh
	public synchronized void setNumber(int number) {
		this.number = number;
	}

}
