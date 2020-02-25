package command;

import editor.Editor;

public class CommandPaste extends Command {

    public CommandPaste(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        saveBackup();
        getEditor().setEditText(getEditor().getClipboard());
        getEditor().addUndo(this);
    }

}
