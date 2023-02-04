public class Todo extends Task {
    public Todo(String userInput) {
        super();
        String[] userInputArray = userInput.split("/todo");
        String description = userInputArray[1].trim();
        super.description = description;
    }

    @Override
    public String toString() {
        return "[TODO]\n" + super.toString();
    }
}
