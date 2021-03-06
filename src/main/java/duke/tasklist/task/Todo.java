package duke.tasklist.task;

/**
 * Stores a todo task.
 */
public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toFile() {
        return "T | " + super.toFile();
    }
}
