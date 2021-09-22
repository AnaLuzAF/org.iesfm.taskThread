package org.iesfm.taskThread;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Printer {
    private static Logger log  = LoggerFactory.getLogger(Printer.class);
    public static void printer(String word, int n){
        for (int i=0; i<n; i++){
            log.info(word);
        }
    }
}
