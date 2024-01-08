import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Epic extends Task{

    public Epic(int id, String title, String description, Status status, Type type ) {
        super(id, title, description, status, type);
        this.type = Type.EPIC;
    }
    @Override
    public String toString() {
        return "Epic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
