package sec06;

class Member {
	private String name, id, password;
	private int age;

	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class MemberTest {

	public static void main(String[] args) {
		Member m = new Member("김영언", "young", "1212", 21);
		System.out.println(m.getName());
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		System.out.println(m.getAge());
	}

}
