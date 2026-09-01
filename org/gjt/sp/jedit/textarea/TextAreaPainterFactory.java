package org.gjt.sp.jedit.textarea;

public class TextAreaPainterFactory
{
    public TextAreaPainter create(TextArea textArea)
    {
        return new TextAreaPainter(textArea);
    }
}
