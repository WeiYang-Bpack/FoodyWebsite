
public class Food {
	int Id;
	String Name;
	String Image;
	String Description;
	String Price;
	public Food( int Id, String name,String Image, String Description,String Price) {
		this.Id = Id;
		this.Name = name;
		this.Image = Image;
		this.Description = Description;
		this.Price = Price;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String toString() {
		String output ="Food ID : "  + this.Id + " Name: " + this.Name + "\nImage: " + this.Image + "\n" + "info: "+ this.Description;
		return output;
	}
	
}
