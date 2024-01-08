public class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Previy", "Opisanie", Status.NEW);
        manager.addTask("vtor", "Opisanie", Status.NEW);
        manager.addTask("tret", "Opisanie", Status.NEW);

        manager.addEpic("EpicName", "EpicDescription", Status.NEW, "SubName", "SubDescription", Status.NEW);
        manager.addSubTask("Probyem dobavit sub v epic", "opisanie", Status.NEW, 4);
        manager.printAllTasksInBacklog();

    }
}
