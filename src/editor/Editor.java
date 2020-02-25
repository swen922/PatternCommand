package editor;

import command.Command;

import java.util.LinkedList;
import java.util.List;

public class Editor {

    private String editText = "";
    private String clipboard = "";
    private LinkedList<Command> undoList = new LinkedList<>();
    private LinkedList<Command> redoList = new LinkedList<>();


    public void type(String text) {
        editText = editText + text;
    }

    public String getEditText() {
        return editText;
    }

    public void setEditText(String editText) {
        this.editText = editText;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public void addUndo(Command command) {
        undoList.addLast(command);
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            Command command = undoList.pollLast();
            command.undo();
            redoList.addLast(command);
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            Command command = redoList.pollLast();
            command.redo();
            undoList.addLast(command);
        }
    }

    public void print() {
        System.out.println(editText);
    }

}
