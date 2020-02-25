import editor.Editor;

/** Команда, также известен как: Действие, Транзакция, Action, Command */

public class App {

    public static void main(String[] args) {
        Program program = new Program();
        program.addEditor(new Editor());
        program.addEditor(new Editor());
        program.addEditor(new Editor());

        program.type("Hello World", 0);
        program.print(0);

        program.type("Second sreen", 1);
        program.print(1);

        System.out.println("-");

        program.copy(0);
        program.paste(1);
        program.print(0);
        program.print(1);

        System.out.println("-");

        program.type(" and let see it!", 1);

        program.cut(1);
        program.print(1);
        program.undo(1);
        program.print(1);
        program.redo(1);
        program.type("new text here", 1);
        program.print(1);
        program.undo(1);
        program.print(1);
        program.undo(1);
        program.print(1);
        program.redo(1);
        program.print(1);
        program.redo(1);
        program.print(1);

        System.out.println("-");

        program.paste(2);
        program.print(2);

        // wrong editor - all is ok?
        program.paste(5);
        program.print(10);

    }
}
