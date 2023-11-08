package fr.codebusters;

public class ProxyImage implements Image {

	private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // The real image is only created when the display method is called
        }
        realImage.display();
    }

}
