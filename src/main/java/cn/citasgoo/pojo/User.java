package cn.citasgoo.pojo;

public class User {

	private String kid;
	private String kuname;
	private String kupassword;

	public String getKid() {
		return kid;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public String getKuname() {
		return kuname;
	}

	public void setKuname(String kuname) {
		this.kuname = kuname;
	}

	public String getKupassword() {
		return kupassword;
	}

	public void setKupassword(String kupassword) {
		this.kupassword = kupassword;
	}

	@Override
	public String toString() {
		return "User [kid=" + kid + ", kuname=" + kuname + ", kupassword=" + kupassword + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String kid, String kuname, String kupassword) {
		super();
		this.kid = kid;
		this.kuname = kuname;
		this.kupassword = kupassword;
	}

}
