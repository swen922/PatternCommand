package command;

import editor.Editor;

public class CommandCut extends Command {

    public CommandCut(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        saveBackup();
        getEditor().setClipboard(getEditor().getEditText());
        getEditor().setEditText("");
        getEditor().addUndo(this);
    }

}
