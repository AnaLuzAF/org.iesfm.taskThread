package org.iesfm.taskThread;

public class imprimirTarea implements  Runnable {
    private int n;
    private String word;
    public imprimirTarea(int n, String word) {
        this.n = n;
        this.word = word;
    }
    @Override
    public void run() {
        Printer.printer(word,n);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
