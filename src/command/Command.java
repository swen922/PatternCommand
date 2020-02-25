package command;


import com.sun.istack.internal.NotNull;
import editor.Editor;

public abstract class Command {

    private Editor editor;
    private String undoText = "";
    private String redoText = "";

    public Command(@NotNull Editor editor) {
        this.editor = editor;
    }

    public Editor getEditor() {
        return editor;
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
