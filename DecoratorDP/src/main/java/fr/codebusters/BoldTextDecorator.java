package fr.codebusters;

// Concrete decorator for adding bold style
public class BoldTextDecorator extends TextDecorator {
	
	public BoldTextDecorator(Text decoratedText) {
		super(decoratedText);
	}

	@Override
	public String getContent() {
		return "<b>" + super.getContent() + "</b>"; // adding bold tags
	}	
}
