import java.util.ArrayList;
import java.util.Objects;

public class SubTask extends Task {
    public int parentsEpicId;


    public SubTask(int id, String title, String description, Status status, Type type, int parentsEpicId) {
        super(id, title, description, status, Type.SUB_TASK);
        this.parentsEpicId = parentsEpicId;
        this.type = Type.SUB_TASK;
    }

    public SubTask(int id, String title, String description, Status status, Type type) {
        super(id, title, description, status, Type.SUB_TASK);
        this.parentsEpicId = parentsEpicId;
        this.type = Type.SUB_TASK;
    }

    public int getParantsEpicId() {
        return parentsEpicId;
    }

    public void setParantsEpicId(int parantsEpicId) {
        this.parentsEpicId = parantsEpicId;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "id=" + id +
                ", parentsEpicId=" + parentsEpicId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
