package com.trainning;

public class InstanceVariable {
	private int mAge;
	private String mName;
	private String mJob;

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmJob() {
		return mJob;
	}

	public void setmJob(String mJob) {
		this.mJob = mJob;
	}

	public String toString() {
		return "HomeWork2 [ mAge = " + mAge + ", mName = " + mName + ", mJob = " + mJob + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable hw1 = new InstanceVariable();
		InstanceVariable hw2 = new InstanceVariable();
		hw1.setmAge(21);
		hw1.setmName("Pham Huy Hoang");
		hw1.setmJob("Sing vien");

		hw2.setmAge(20);
		hw2.setmName("Phan Thi Bich Hang");
		hw2.setmJob("Nha ngoai cam");

		System.out.println(hw1.toString());
		System.out.println(hw2.toString());
	}

}
