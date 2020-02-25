package command;

import editor.Editor;

public class CommandRedo extends Command {

    public CommandRedo(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getEditor().redo();
    }
}
