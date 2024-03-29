package day08;

public class Dog extends Animal{
	String kind = "강아지 종류";
	String name;
	
	public String getSuperkind() {
		return super.kind;
	}	
	public Dog() {
		super("강아지");
	}
	public Dog(String kind, String name) {
		super("강아지");
		//super.kind="강아지";
		this.kind = kind;
		this.name = name;
	}



	
	public void print() {
		System.out.printf("[%s, %s, %s]%n",
				super.kind,this.kind,this.name);
		
		}
	@Override 
	public void breath() { //Animal breath 부모가 public이므로 
						//그밑에 protected 이하 불가능
		System.out.println("폐로 동작...");
	}
	
}
