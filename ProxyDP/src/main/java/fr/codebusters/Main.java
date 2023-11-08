package fr.codebusters;

public class Main {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("largeImage.jpg"); // Real object is not created yet

        // Real object is created and loaded when display() is called
        image.display(); 

        // Subsequent calls directly use the real object
        image.display();

	}

}
