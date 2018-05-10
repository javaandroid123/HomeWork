package com.trainning;

public class StaticVariable {
	private int mAge;
	private String mName;
	private String mJob;
	public static int sCount = 0;
	
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
	
	public void counter() {
		sCount++;
	}
	public String toString() {
		StringBuilder builder = new StringBuidler();
		builder.append("HomeWork3 [ mAge = ");
		builder.append(mAge);
		builder.append(", mName = ");
		builder.append(mName);
		builder.append(", mJob = ");
		builder.append(mJob);
		builder.append("]");
		return builder.toString();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable hw1= new StaticVariable();
		StaticVariable hw2= new StaticVariable();
		hw1.setmAge(21);
		hw1.setmName("Pham Huy Hoang");
		hw1.setmJob("Sinh vien");
		hw1.counter();
		System.out.println(hw1.toString()+" "+ hw1.sCount);
		
		hw2.setmAge(22);
		hw2.setmName("Luong Bich Huu");
		hw2.setmJob("Ca si");
		hw2.counter();
		System.out.println(hw2.toString()+ " "+ hw2.sCount);

}
}