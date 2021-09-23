package mrcooper;

public class Property {
	public int proprety_id;
	public String location;
	public String city;
	public double squarefeet;
	public String type;
	public double rent;
	
	
	
	public void setproperty(int id,String location,String city,double sqft,String type,double rent) {
		proprety_id=id;
		location=location;
		city=city;
		squarefeet=sqft;
		type=type;
		rent=rent;
	}
	
	

}
