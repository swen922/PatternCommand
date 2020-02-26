package command;

import editor.Editor;

public class CommandPaste extends Command {

    public CommandPaste(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        saveBackup();
        editor.setEditText(editor.getClipboard());
        editor.addUndo(this);
    }

}
