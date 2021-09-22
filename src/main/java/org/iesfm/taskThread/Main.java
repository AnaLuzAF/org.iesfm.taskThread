package org.iesfm.taskThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger log  = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        imprimirTarea imprimirTask= new imprimirTarea(100, "hola");
        Thread h= new Thread(imprimirTask);
        h.start();
        imprimirTarea imprimirTarea2= new imprimirTarea(50, "adios");
        Thread a= new Thread(imprimirTarea2);
        a.start();
}}
