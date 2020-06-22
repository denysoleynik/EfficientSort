import java.util.*;

/**
 * Write a description of class TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
   public int compare(QuakeEntry qe1, QuakeEntry qe2) {
       int titlecompare = qe1.getInfo().compareTo(qe2.getInfo());
       if (titlecompare==0) {
           return Double.compare(qe1.getDepth(), qe2.getDepth());
        }
       return titlecompare;
    }
}
