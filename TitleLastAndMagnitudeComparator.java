import java.util.*;

/**
 * Write a description of class TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
   public int compare(QuakeEntry qe1, QuakeEntry qe2) {
       String lastw1 = qe1.getInfo();
       String lastw2 = qe2.getInfo();
       String last1 = lastw1.substring(lastw1.lastIndexOf(" ")+1);
       String last2 = lastw2.substring(lastw2.lastIndexOf(" ")+1);
       int title = last1.compareTo(last2);
       
       if (title==0) {
           return Double.compare(qe1.getMagnitude(), qe2.getMagnitude());
        }
       return title;
    }
}