package Task3.textEdit;

import Task3.base.Editable;

public class TextEdit implements Editable {
    @Override
    public long length() {
        return 9;
    }

    @Override
    public void requestFocus() {
        System.out.println("Focused");
    }
}
