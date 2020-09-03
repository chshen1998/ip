package duke.command;

import duke.exception.DukeException;

import duke.storage.Storage;

import duke.tasklist.TaskList;

import duke.ui.Ui;

public class DeleteCommand extends Command {
    private String taskIdString;

    public DeleteCommand(String taskIdString) {
        this.taskIdString = taskIdString;
    }

    /**
     * Deletes specified duke.task from duke.tasklist and updates Storage.
     *
     * @param taskList
     * @param ui
     * @param storage
     * @throws DukeException
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        try {
            int taskId = Integer.parseInt(taskIdString);
            if (taskId <= 0 || taskId > taskList.size()) {
                throw new DukeException("Invalid input! That duke.task does not exist!");
            } else {
                int new_size = taskList.size() - 1;
                String response = "Noted! I've deleted this duke.task: \n" + taskList.get(taskId - 1) + "\n"
                        + "Now you have " + new_size + " tasks in the list.";
                taskList.delete(taskId - 1);
                storage.save(taskList);
                return response;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new DukeException("Invalid input! Please specify which duke.task you want to delete!");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
