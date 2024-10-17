package day06l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App{

    public static void main(String[] args) {
    //     Thread th = new Thread(new Runnable() {
    //         public void run(){

    //             for(int i = 0; i < 10; i++){
    //                 System.out.println(Thread.currentThread().getName() + " -> " + i);
    //             }


    //         }
    //     });

    // //to run the thread 
    // th.start(); // this line is needed if not cannot run
    //above prints: Thread-0 -> 0 to 9

    MyImplemention my1 = new MyImplemention();
    MyImplemention my2 = new MyImplemention();
    MyImplemention my3 = new MyImplemention();
    MyImplemention my4 = new MyImplemention();
    MyImplemention my5 = new MyImplemention();

    //executing the task using a single thread
    // ExecutorService es = Executors.newSingleThreadExecutor();
    // es.execute(my1);
    // es.execute(my2);
    // es.shutdown();
        // above prints: pool-1-thread-1 -> 0 to 9 two times


    //executing the tasks using fixed thread pool
    ExecutorService es1 = Executors.newFixedThreadPool(5);
    es1.execute(my1); 
    es1.execute(my2); 
    es1.execute(my3); 
    es1.execute(my4); 
    es1.execute(my5); 
    es1.shutdown();




    }

    //note that thread(Runnable) - means it uses runnable interface



}

