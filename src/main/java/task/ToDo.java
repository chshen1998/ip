package task;

import java.time.LocalDate;

public class ToDo extends Task {

    public ToDo(String description, boolean isDone) {
        super(description, isDone);
    }

    public String toString() {
        String icon = this.completed ? "[" + "\u2713" + "]" : "[" + "\u2718" + "]";
        return "[T]" + icon + " " + this.description;
    }

    /**
     * Encode task into a String to be saved in text file.
     *
     * @return String of encoded task details.
     */
    public String toEncoding() {
        int completedBinary = this.completed ? 1 : 0;
        return "T>" + completedBinary + ">" + this.description;
    }

    public boolean isDate(LocalDate dateFilter) {
        return false;
    }
}
