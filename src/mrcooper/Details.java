package mrcooper;

public class Details {
	public int user_id;
	public String user_name;
	public String Email_id;
	public int phone_no;
	public int adhar_no;
	
	
	
	public void setdetails(int id,String name,String email,int pno,int a_no) {
		user_id=id;
		user_name=name;
		Email_id=email;
		phone_no=pno;
		adhar_no=a_no;
		
	}
	public int getuserid() {
		return user_id;
	}
	public String getusename() {
		return user_name;
	}
	public int getphno() {
		return phone_no;
	}

}
