package mrcooper;

public class Approver {
	public int approver_id;
	public String user_name;
	public String Email_id;
	public double phone_no;
	public double adhar_no;
	
	
	
	public void setdetails(int id,String name,String email,double pno,double a_no) {
		approver_id=id;
		user_name=name;
		Email_id=email;
		phone_no=pno;
		adhar_no=a_no;
		
	}
	public void setproperty(int id,String location,String city,double sqft,String type,double rent) {
	}

	


}
