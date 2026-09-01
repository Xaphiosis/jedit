package org.gjt.sp.jedit;

public class ViewFactory
{
    public View create(Buffer buffer, View.ViewConfig config)
    {
        return new View(buffer, config);
    }
}
