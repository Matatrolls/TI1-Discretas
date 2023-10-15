package model;

import dataStructures.*;
import java.util.ArrayList;


public class Controller {

    private HashTable tasksStore;
    private Queue taskQueue;
    private MaxHeap priorityTaskQueue;
    private Stack lastAction;
    private ArrayList priorityTaskList;

    public Controller(){
        taskQueue = new Queue<>();
        tasksStore = new HashTable<>( 500);
        lastAction = new Stack<>();
        priorityTaskList = new ArrayList<>();
        priorityTaskQueue = new MaxHeap<>(priorityTaskList);
    }

    public void undo() {
        lastAction.pop();

    }

    public void changeTaskPriority() {
        
    }

    public void storeTasks(String title, String description, String limitDate, String priority,int priorityLvl) throws Exception{
        if(priority.equals("Y")){
            PriorityTask temporalPriorityTask = new PriorityTask(title, description, limitDate,priorityLvl);
            tasksStore.add(title,temporalPriorityTask);

            priorityTaskList.add(temporalPriorityTask);
        }
        else{
            Task temporalTask = new Task(title, description, limitDate);
            tasksStore.add(title,temporalTask);
            taskQueue.enqueue(temporalTask);
        }

    }

    public String printAllTasks(){

        String msg=tasksStore.print();
        return msg;
    }

    public void testing() {
        Task temporalTask = new Task("test title", "test description", "00/00/01");
        tasksStore.add("test title",temporalTask);
        taskQueue.enqueue(temporalTask);

        PriorityTask temporalPriorityTask = new PriorityTask("test title", "test description",  "00/00/01", 1);
        tasksStore.add("test title",temporalPriorityTask);
        priorityTaskList.add(temporalPriorityTask);
    }

    public String printCommonTasks(){

        String msg=taskQueue.print();
        return msg;
    }

     public String printPriorityTasks(){

        String msg=priorityTaskQueue.print();
        return msg;
    }
    
    

}
