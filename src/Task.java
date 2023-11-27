public class Task
{
    String description;
    boolean isCompleted;

    public Task()
    {
    }

    public Task(String description, boolean isCompleted)
    {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isCompleted()
    {
        return isCompleted;
    }

    public void setCompleted(boolean completed)
    {
        isCompleted = completed;
    }
}
