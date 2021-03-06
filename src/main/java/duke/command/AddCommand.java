package duke.command;

import duke.tasklist.TaskList;
import duke.storage.Storage;
import duke.tasklist.task.Task;
import duke.ui.Ui;

import java.io.IOException;

/**
 * Deals with commands related to adding tasks.
 */
public class AddCommand extends Command {
    private Task newtask;

    public AddCommand(Task newtask) {
        this.newtask = newtask;
    }

    /**
     * Adds a new task in taskList, updates ui and backup file.
     *
     * @param tasks Stores all tasks.
     * @param ui Deals with user interface.
     * @param storage Deals with back up file.
     * @throws IOException If cannot find back up file in the hard disk.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        tasks.addTask(newtask);
        ui.showAddTaskMessage(tasks);
        storage.write(tasks);
    }
}
