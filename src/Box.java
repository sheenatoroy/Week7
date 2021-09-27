
public class Box {

	private double width = 0;
	private double length = 0;
	private double height = 0;

	//setters
	//there's an error if the access modifier is private
	//to make that possible we can use package to access the data from outside class
	public void setWidth(double widthBox) {
		   
		if(widthBox <= 0) {
			System.out.println("Invalid width!");
		}else {
				this.width =  widthBox;
			}
	}

	
	public void setLength(double lengthBox) {
	
		if(lengthBox <= 0) {
			System.out.println("Invalid length!");
		
		}else{
			
			this.length =  lengthBox;
		}
	}
		  
			
	public void setHeight(double heightBox) {
        
		if(heightBox <= 0) {
			
			System.out.println("Invalid height!");
		}else {
			this.height =  heightBox;
			
	}
		}
			

	//getters
	
	public double getVolume(double widthBox, double lengthBox, double heigthBox) {
				
		return (length * width * height);
	}
			
	public double getSurface(double widthBox, double lengthBox, double heigthBox) {
				
		return 2*(length * width + length * height + width * height);
			
	}
			
	public double getLateral(double widthBox, double lengthBox, double heigthBox) {
				
		return 2 * height * (length + width);
			
	}
			
	public void showResult() {
				
		System.out.println("The Volume of the Box is: " + this.getVolume(width, length, height));
		System.out.println("The Surface Area of the Box is: " + this.getSurface(width, length, height));
		System.out.println("The Lateral Surface Area of the Box is: " + this.getLateral(width, length, height));
	
}

}
	
	

