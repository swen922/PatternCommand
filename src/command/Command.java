package command;


import com.sun.istack.internal.NotNull;
import editor.Editor;

public abstract class Command {

    protected Editor editor;
    protected String undoText = "";
    protected String redoText = "";

    public Command(@NotNull Editor editor) {
        this.editor = editor;
    }

    public void saveBackup() {
        undoText = editor.getEditText();
    }

    public void undo() {
        if (undoText != null) {
            redoText = editor.getEditText();
            editor.setEditText(undoText);
        }

    }

    public void redo() {
        editor.setEditText(redoText);
    }
    
    public abstract void execute();

}
