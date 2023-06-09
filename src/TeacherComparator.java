import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparator = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparator == 0) {
            resultOfComparator = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparator == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparator;
            }
        } else {
            return resultOfComparator;
        }
    }
}
