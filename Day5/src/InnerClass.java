
public class InnerClass {
private int a;
	
	public InnerClass() {
		System.out.println("����");
		a=30;
	}

	class Member {
		public Member() {
			System.out.println("���");
			a=50;
			System.out.println(a);
		}
	}

	static class Static {
	}

	public void disp() {
		class Local {
		}
	}

	public static void main(String[] args) {
		InnerClass aa = new InnerClass();
		InnerClass.Member bb = aa.new Member();

	}
}
