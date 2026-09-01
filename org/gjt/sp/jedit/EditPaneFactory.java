package org.gjt.sp.jedit;

import org.gjt.sp.jedit.bufferset.BufferSet;

public class EditPaneFactory
{
    public EditPane create(View view, BufferSet bufferSetSource, Buffer buffer)
    {
        return new EditPane(view, bufferSetSource, buffer);
    }
}
