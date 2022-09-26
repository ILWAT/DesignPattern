public class CompareFileType implements Comparable {
    public CompareFileType(){}
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo s1 = (FileInfo) o1;
        FileInfo s2 = (FileInfo) o2;
        if(s1.getType().compareTo(s2.getType())>0) {
            return 1;
        }
        return 0;
    }
}
