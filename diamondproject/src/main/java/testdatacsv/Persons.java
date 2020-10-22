package testdatacsv;

public class Persons {

	private String name;
	private String age;
	private String city;

	public Persons(String name, String age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
