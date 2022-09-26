import java.lang.String;

public class CompareFileName implements Comparable {
    public CompareFileName(){}
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo s1 = (FileInfo) o1;
        FileInfo s2 = (FileInfo) o2;
        if(s1.getName().compareTo(s2.getName())>0) {
            return 1;
        }
        return 0;
    }
}
