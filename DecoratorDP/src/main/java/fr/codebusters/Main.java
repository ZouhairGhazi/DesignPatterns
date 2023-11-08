package fr.codebusters;

public class Main {

	public static void main(String[] args) {
		
        Text text = new PlainText("Hello Code Busters !");

        // Decorate with bold and italic styles
        Text boldItalicText = new BoldTextDecorator(new ItalicTextDecorator(text));

        System.out.println(boldItalicText.getContent());

	}

}
