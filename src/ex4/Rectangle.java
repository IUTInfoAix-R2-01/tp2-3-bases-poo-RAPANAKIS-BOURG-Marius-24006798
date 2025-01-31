package ex4;

public class Rectangle {
	
	private float width;
	private float length;
	
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle(float length, float width) {
		this.width = width;
		this.length = length;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea() {
		return width*length;
	}
	
	public float getPerimeter() {
		return (width+length)*2;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
	

}
