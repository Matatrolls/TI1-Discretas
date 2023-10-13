package model;

public class PriorityTask extends Task {
    private String title;
    private String description;
    private String priority;
    private int priorityLvl;
    private String limitDate;

    
    public PriorityTask(String title, String description, String priority, String limitDate,int priorityLvl) {
        super(title, description, priority, limitDate);
        this.priorityLvl=priorityLvl;

    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }


    public String getLimitDate() {
        return limitDate;
    }


    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }


    @Override
    public String toString() {
        return "\nTask" + title + ", description=" + description + ", priority=" + priority +", lvl="+priorityLvl+ ", limitDate=" + limitDate;
    }


    public int getPriorityLvl() {
        return priorityLvl;
    }


    public void setPriorityLvl(int priorityLvl) {
        this.priorityLvl = priorityLvl;
    }

    
    
}
