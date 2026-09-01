package org.gjt.sp.jedit;

import org.gjt.sp.jedit.textarea.JEditTextArea;
import org.gjt.sp.jedit.textarea.TextAreaMouseHandler;
import org.gjt.sp.jedit.textarea.MouseHandler;


public class EditPaneMouseHandlerFactory
{
    public TextAreaMouseHandler create(EditPane editPane)
    {
        return new MouseHandler(editPane.getTextArea());
    }
}
