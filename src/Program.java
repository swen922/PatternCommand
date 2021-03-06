import command.*;
import editor.Editor;

import java.util.ArrayList;
import java.util.List;

public class Program {


    private List<Editor> editors = new ArrayList<>();


    public void addEditor(Editor editor) {
        editors.add(editor);
    }

    public void type(String text, int pos) {
        if (editors.get(pos) != null) {
            editors.get(pos).type(text);
        }
    }



    /** Тута пошли как бы кнопки в программе */

    public void copy(int pos) {
        if (checkPosition(pos)) {
            Command command = new CommandCopy(editors.get(pos));
            command.execute();
            String clip = editors.get(pos).getClipboard();
            for (Editor e : editors) {
                e.setClipboard(clip);
            }
        }
    }

    public void cut(int pos) {
        if (checkPosition(pos)) {
            Command command = new CommandCut(editors.get(pos));
            command.execute();
            String clip = editors.get(pos).getClipboard();
            for (Editor e : editors) {
                e.setClipboard(clip);
            }
        }
    }

    public void paste(int pos) {
        if (checkPosition(pos)) {
            Command command = new CommandPaste(editors.get(pos));
            command.execute();
        }
    }

    public void undo(int pos) {
        if (checkPosition(pos)) {
            Command command = new CommandUndo(editors.get(pos));
            command.execute();
        }
    }

    public void redo(int pos) {
        if (checkPosition(pos)) {
            Command command = new CommandRedo(editors.get(pos));
            command.execute();
        }
    }

    public void print(int pos) {
        if (checkPosition(pos)) {
            editors.get(pos).print();
        }
    }

    private boolean checkPosition(int pos) {
        if (pos < 0 || pos >= editors.size()) {
            return false;
        }
        return true;
    }



}
