package ss4_lop_va_doi_tuong_trong_java;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Enter milliseconds ");
            Scanner sc = new Scanner(System.in);
            int milliseconds = sc.nextInt();
            StopWatch sw = new StopWatch();
            sw.getStartTime();
            Thread.sleep(milliseconds);
            sw.stop();
            System.out.println("Elapsed: " + sw.getElapsedTime() + " ms");
        }
}