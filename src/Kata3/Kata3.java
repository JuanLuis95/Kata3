
package Kata3;


public class Kata3 {

    
    public static void main(String[] args) {
        
        
        Histogram<String> histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulll.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
