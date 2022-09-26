public class CompareFileSize implements Comparable {
    public CompareFileSize(){}
    @Override
    public int compareTo(Object o1, Object o2) {
        FileInfo s1 = (FileInfo) o1;
        FileInfo s2 = (FileInfo) o2;
        if(s1.getSize() > s2.getSize()){
            return 1;
        }
        return 0;
    }

}
