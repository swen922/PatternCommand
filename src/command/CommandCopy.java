package command;

import editor.Editor;

public class CommandCopy extends Command {

    public CommandCopy(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        getEditor().setClipboard(getEditor().getEditText());
    }

}
