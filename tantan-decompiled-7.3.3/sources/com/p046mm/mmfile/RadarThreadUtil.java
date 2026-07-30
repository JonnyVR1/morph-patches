package com.p046mm.mmfile;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class RadarThreadUtil {
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static void run(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        threadPoolExecutor.execute(runnable);
    }
}
