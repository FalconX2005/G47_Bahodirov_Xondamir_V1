package task1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class task1 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Bank bank = new Bank();
        Runnable task = ()->{
          bank.increaseBalance();
        };
        for (int i = 0; i < 100; i++) {

            new Thread(task).start();
        }
    }
}
