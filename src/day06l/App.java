package day06l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class App{

public static void main(String[] args) {
    
        
    List<Product> products = new ArrayList<>();

    products.add(new Product(1L, "Apple iPad", "Apple tablet", "Computer"));
    products.add(new Product(2L, "Apple Macbook Pro", "Apple laptop", "Computer"));
    products.add(new Product(3L, "Logitech Mouse", "Mouse", "Computer"));
    products.add(new Product(4L, "32 inch monitor", "Samsung Monitor", "Computer"));
    products.add(new Product(5L, "Huawei 5", "Huawei Phone", "Mobile"));
    products.add(new Product(6L, "Oppo 7 Pro", "Oppo Phone", "Mobile"));
    products.add(new Product(7L, "Galazy 24", "Samsung Phone", "Mobile"));
    products.add(new Product(8L, "iPhone 1500 Pro Max Ultra", "Apple Phone", "Mobile"));

    // products.forEach(prod -> {
    //     System.out.println(prod);
    // });

    products.forEach(Product::print);

    //only retireve products with cat "mobile"
    List<Product> filteredProducts = new ArrayList<>();
    filteredProducts = products.stream()
                        .filter((p -> p.getCategory().equals("Mobile")))
                        .collect(Collectors.toList());
    
    filteredProducts.forEach(Product::print);







}

    //note that thread(Runnable) - means it uses runnable interface



}

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

    // MyImplemention my1 = new MyImplemention();
    // MyImplemention my2 = new MyImplemention();
    // MyImplemention my3 = new MyImplemention();
    // MyImplemention my4 = new MyImplemention();
    // MyImplemention my5 = new MyImplemention();

    //executing the task using a single thread
    // ExecutorService es = Executors.newSingleThreadExecutor();
    // es.execute(my1);
    // es.execute(my2);
    // es.shutdown();
        // above prints: pool-1-thread-1 -> 0 to 9 two times


    //executing the tasks using fixed thread pool
    // ExecutorService es1 = Executors.newFixedThreadPool(5);
    // es1.execute(my1); 
    // es1.execute(my2); 
    // es1.execute(my3); 
    // es1.execute(my4); 
    // es1.execute(my5); 
    // es1.shutdown();
    // // above prints: 
            // pool-1-thread-5 -> 0
            // pool-1-thread-4 -> 0
            // pool-1-thread-2 -> 0
            // pool-1-thread-4 -> 1
            // pool-1-thread-3 -> 0
            // pool-1-thread-5 -> 1
            // pool-1-thread-1 -> 0
            // pool-1-thread-5 -> 2
            // pool-1-thread-3 -> 1
            // pool-1-thread-4 -> 2
            // pool-1-thread-2 -> 1
            // pool-1-thread-4 -> 3
            // pool-1-thread-3 -> 2
            // pool-1-thread-3 -> 3
            // pool-1-thread-5 -> 3
            // pool-1-thread-1 -> 1
            // pool-1-thread-5 -> 4
            // pool-1-thread-3 -> 4
            // pool-1-thread-3 -> 5
            // pool-1-thread-3 -> 6
            // pool-1-thread-4 -> 4
            // pool-1-thread-4 -> 5
            // pool-1-thread-4 -> 6
            // pool-1-thread-2 -> 2
            // pool-1-thread-4 -> 7
            // pool-1-thread-3 -> 7
            // pool-1-thread-3 -> 8
            // pool-1-thread-3 -> 9
            // pool-1-thread-5 -> 5
            // pool-1-thread-1 -> 2
            // pool-1-thread-5 -> 6
            // pool-1-thread-4 -> 8
            // pool-1-thread-2 -> 3
            // pool-1-thread-4 -> 9
            // pool-1-thread-5 -> 7
            // pool-1-thread-5 -> 8
            // pool-1-thread-5 -> 9
            // pool-1-thread-1 -> 3
            // pool-1-thread-1 -> 4
            // pool-1-thread-2 -> 4
            // pool-1-thread-1 -> 5
            // pool-1-thread-1 -> 6
            // pool-1-thread-1 -> 7
            // pool-1-thread-1 -> 8
            // pool-1-thread-1 -> 9
            // pool-1-thread-2 -> 5
            // pool-1-thread-2 -> 6
            // pool-1-thread-2 -> 7
            // pool-1-thread-2 -> 8
            // pool-1-thread-2 -> 9

