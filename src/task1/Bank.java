package task1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    int balance;
    Lock lock=new ReentrantLock();
    public void increaseBalance(){
        lock.lock();
        this.balance += 1;
        System.out.println(this.balance);
        lock.unlock();
    }
}
