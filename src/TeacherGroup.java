import java.util.Iterator;
import java.util.List;

public class TeacherGroup<T extends Teacher> implements Iterable<Teacher> {
    private List<T> teachers;

    public TeacherGroup(List<T> teachers) {
        this.teachers = teachers;
    }

    public List<T> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<T> teachers) {
        this.teachers = teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
