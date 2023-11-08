package fr.codebusters;

// Concrete decorator for adding italic style
public class ItalicTextDecorator extends TextDecorator {
	
	public ItalicTextDecorator(Text decoratedText) {
		super(decoratedText);
	}

	@Override
	public String getContent() {
		return "<i>" + super.getContent() + "</i>"; // add italic tags
	}
}
