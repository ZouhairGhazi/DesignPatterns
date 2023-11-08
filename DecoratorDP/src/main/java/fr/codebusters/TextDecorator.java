package fr.codebusters;

// Decorator 
public abstract class TextDecorator implements Text {
	
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getContent() {
        return decoratedText.getContent();
    }
}
