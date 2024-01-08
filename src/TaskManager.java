import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskManager {
    public int idNumber = 1;
    HashMap<Integer, Object> backlog = new HashMap<>();


    public void addTask( String title, String description, Status status) {
        Task newTask = new Task(idNumber, title, description, status, Type.TASK);
        backlog.put(idNumber, newTask);
        idNumber++;
    }

    public void addEpic(String title, String description, Status status, String titleSub,
                        String descriptionSub, Status statusSub ) {
        Epic newEpic = new Epic(idNumber, title, description, status, Type.EPIC);
        backlog.put(idNumber, newEpic);
        idNumber++;

        SubTask newSubTaskInEpic = new SubTask(idNumber, titleSub, descriptionSub,statusSub,Type.SUB_TASK,
                idNumber - 1);
        ArrayList<SubTask> newSubTaskList = new ArrayList<>();
        newSubTaskList.add(newSubTaskInEpic);
        backlog.put(idNumber, newSubTaskList); // неверная логика, класть в бэклог надо сабтаски, а не списки
        idNumber++;
    }

    public void addSubTask(String title, String description, Status status, int parentsEpicId) {
        SubTask newSubTask = new SubTask(idNumber, title, description, status, Type.SUB_TASK, parentsEpicId);
        idNumber++;
        ArrayList<SubTask> currenList = (ArrayList<SubTask>) backlog.get(parentsEpicId);
        currenList.add(newSubTask);
        backlog.put(parentsEpicId, currenList);

    } // 22
    public void printAllTasksInBacklog() {
        for(Object obj : backlog.values()) {
            System.out.println(obj);

        }
    }

    public int getIdNumber(Task task) {
        return idNumber;
    }
}
