package command;

import editor.Editor;

public class CommandUndo extends Command {

    public CommandUndo(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.undo();
    }
}
