package prog5121poe;

public class Task {
    // Task attributes
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskStatus;
    public String taskID;
    
    // Constructor
    public Task(String taskName, int taskNumber, String taskDescription, 
                String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }
    
    // Method to check task description length
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }
    
    // Method to create task ID
    public String createTaskID() {
        String firstTwoLetters = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();
        String[] nameParts = developerDetails.split(" ");
        String lastName = nameParts[nameParts.length - 1];
        String lastThreeLetters = lastName.substring(Math.max(0, lastName.length() - 3)).toUpperCase();
        return firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;
    }
    
    // Method to return task details as formatted string
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + taskDuration + " hours";
    }
    
    // Getter for task duration
    public int getTaskDuration() {
        return taskDuration;
    }
}