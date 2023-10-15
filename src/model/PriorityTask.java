package model;

public class PriorityTask extends Task implements Comparable<PriorityTask> {
 
    private int priorityLvl;


    
    public PriorityTask(String title, String description,  String limitDate,int priorityLvl) {
        super(title, description, limitDate);
        this.priorityLvl=priorityLvl;

    }



    @Override
    public String toString() {
        return "\nPriorTask " + getTitle() + ", description=" + getDescription() + ", lvl="+priorityLvl+ ", limitDate=" + getLimitDate();
    }


    public int getPriorityLvl() {
        return priorityLvl;
    }


    public void setPriorityLvl(int priorityLvl) {
        this.priorityLvl = priorityLvl;
    }



    @Override
    public int compareTo(PriorityTask o) {
        if(this.priorityLvl < o.priorityLvl)return -1;
        if(this.priorityLvl==o.priorityLvl)return 0;
        if(this.priorityLvl > o.priorityLvl)return 1;
        return 0;
    }

    
    
}
