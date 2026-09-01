package org.gjt.sp.jedit.textarea;

import org.gjt.sp.jedit.View;

public class JEditTextAreaFactory
{
    public JEditTextArea create(View view)
    {
        return new JEditTextArea(view);
    }
}
