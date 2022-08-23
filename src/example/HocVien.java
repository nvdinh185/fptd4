package example;

public class HocVien {
	@Override
	public String toString() {
		return "HocVien [id=" + id + ", name=" + name + "]";
	}

	private String id;
	private String name;

	public HocVien() {
		System.out.println("HOC VIEN KHONG THAM SO");
	}

	public HocVien(String id, String name) {
//		super();
		this.id = id;
		this.name = name;
		System.out.println("HOC VIEN CO THAM SO");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
