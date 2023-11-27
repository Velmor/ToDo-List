import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager
{
   private List<String> tasks;

   public TaskManager(){
       tasks=new ArrayList<>();
   }

    public void addTask(String task) {
       if (!task.isEmpty()){
           tasks.add(task);
       }
       System.out.println("Added task"+task);
}
    // Removes a task based on its description
    public void removeTask(String description){
        boolean removed=tasks.remove(description);
        if(removed){
            System.out.println("The task is removed");
        }
        else {
            System.out.println("Task not found"+description);
        }
    }

    public void listTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks to list.");
        } else {
            System.out.println("Tasks:");

            for (String taskDescription : tasks) {
                System.out.println(taskDescription);
            }
        }
    }

}
