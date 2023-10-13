package model;

import dataStructures.*;


public class Controller {

    private HashTable tasksStore;
    private Queue taskQueue;
    private MaxHeap lastAction;

    public Controller(){
        taskQueue = new Queue<>();
        tasksStore = new HashTable<>( 100);
        // lastAction; para el deshacer

    }

    public void undo() {
    }

    public void changeTaskPriority() {
    }

    public void storeTasks(String title, String description, String limitDate, String priority,int priorityLvl) throws Exception{
        if(priority.equals("Y")){
            PriorityTask temporalPriorityTask = new PriorityTask(title, description, priority, limitDate,priorityLvl);
            tasksStore.add(priority,temporalPriorityTask);
        }
        else{
            Task temporalTask = new Task(title, description, priority, limitDate);
            tasksStore.add(priority,temporalTask);
        }

    }

    public String printAllTasks(){

        String msg=tasksStore.print();
        return msg;
    }

    public void testing() {
        Task temporalTask = new Task("test title", "test description", "N", null);
        tasksStore.add("N",temporalTask);
    }

}
