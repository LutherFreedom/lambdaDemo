package com.luther.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/22 10:12
 * @UpdateTime: 2018/12/22 10:12
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class ManualDiceRolls {
    //次数
    private static final int N = 100000000;

    private final double fraction;
    private final Map<Integer, Double> results;
    private final int numberOfThreads;
    private final ExecutorService executor;
    private final int workPerThread;

    public static void main(String[] args) {
        ManualDiceRolls rolls = new ManualDiceRolls();
        rolls.simulateDiceRoles();
        System.out.println(rolls.results);
    }

    public ManualDiceRolls() {
        this.fraction = 1.0 / N;
        this.results = new ConcurrentHashMap<>();
        // CPU的核数
        this.numberOfThreads = Runtime.getRuntime().availableProcessors();
        //线程池开多少个线程
        this.executor = Executors.newFixedThreadPool(numberOfThreads);
        this.workPerThread = N / numberOfThreads;
    }

    public void simulateDiceRoles() {
        List<Future<?>> futures = submitJobs();
        awaitCompletion(futures);
    }

    private void awaitCompletion(List<Future<?>> futures) {
        futures.forEach(future -> {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }

    private List<Future<?>> submitJobs() {
        List<Future<?>> futureList = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            futureList.add(executor.submit(makeJobs()));
        }
        return futureList;
    }

    private Runnable makeJobs() {
        return () -> {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int entry = twoDiceThrows(random);
            accumulateResult(entry);
        };
    }

    private void accumulateResult(int entry) {
        results.compute(entry, (key, previous) -> {
            return previous == null ? fraction : previous + fraction;
        });
    }

    private int twoDiceThrows(ThreadLocalRandom random) {
        int firstThrow = random.nextInt(1, 7);
        int secondThrow = random.nextInt(1, 7);
        return firstThrow + secondThrow;
    }
}
