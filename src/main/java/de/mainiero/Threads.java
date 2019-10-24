package de.mainiero;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        Sampler sampler = new Sampler();

        Thread thread1 = new Thread(new SamplerIncRunnable(sampler));
        thread1.start();

        Thread thread2 = new Thread(new SamplerIncRunnable(sampler));
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sampler.getValue());
        
    }

    static class SamplerIncRunnable implements Runnable {
        private Sampler sampler;
    
        public SamplerIncRunnable(Sampler sampler) {
            this.sampler = sampler;
        }
    
        public void run() {
            for ( int i=0; i<1_000_000; i++ ) {
                sampler.incrementValue();
            }
        }
    }

    static class Sampler {
        private int value = 0;
        
        void incrementValue(){
            this.value++;
        }

        public int getValue(){
            return this.value;
        }
    }
}