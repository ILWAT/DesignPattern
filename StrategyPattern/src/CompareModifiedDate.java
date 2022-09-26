import java.util.Date;

public class CompareModifiedDate implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo s1 = (FileInfo) o1;
        FileInfo s2 = (FileInfo) o2;
        if(s1.getModifiedDate().compareTo(s2.getModifiedDate())>0) {
            return 1;
        }
        return 0;
    }
}
