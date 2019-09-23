package de.mainiero;

import java.util.concurrent.TimeUnit;

public class Threads {

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setValue(10);
        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                s.setValue(100);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        };
        System.out.println(s.getValue());
        s.setValue(200);
        task.run();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(s.getValue());
        
    }

    static class Sample{
        private int value;
        
        public void setValue(int newValue){
            this.value = newValue;
        }

        public int getValue(){
            return this.value;
        }
    }
}