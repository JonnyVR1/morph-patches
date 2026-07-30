package com.tencent.could.component.common.p079ai.net;

import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadManager {

    /* JADX INFO: renamed from: f */
    public static ThreadManager f57310f = new ThreadManager();

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f57312b;

    /* JADX INFO: renamed from: d */
    public HttpTask f57314d;

    /* JADX INFO: renamed from: a */
    public LinkedBlockingQueue<Runnable> f57311a = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: c */
    public DelayQueue<HttpTask> f57313c = new DelayQueue<>();
    public Runnable failedRunnable = new Runnable() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.1
        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    HttpTask httpTask = (HttpTask) ThreadManager.this.f57313c.take();
                    ThreadManager.this.f57314d = httpTask;
                    int failedNum = httpTask.getFailedNum();
                    if (ThreadManager.this == null) {
                        throw null;
                    }
                    NetWorkParam requestNetWorkParam = httpTask.getRequestNetWorkParam();
                    if (failedNum < (requestNetWorkParam == null ? 3 : requestNetWorkParam.getRetryTimes())) {
                        httpTask.setFailedNum(httpTask.getFailedNum() + 1);
                        ThreadManager.this.f57312b.execute(httpTask);
                        TxNetWorkHelper.getInstance().logDebug("ThreadManager", "network test time: " + httpTask.getFailedNum());
                    } else {
                        CallBackListener callBackListener = ((JsonHttpRequest) httpTask.getIHttpRequest()).getCallBackListener();
                        if (callBackListener != null) {
                            callBackListener.onFailed(httpTask.getTaskError());
                        }
                    }
                } catch (InterruptedException e) {
                    TxNetWorkHelper.getInstance().logError("ThreadManager", "network error , message: " + e.getMessage());
                }
            }
        }
    };

    /* JADX INFO: renamed from: e */
    public Runnable f57315e = new Runnable() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.2
        /* JADX INFO: Infinite loop detected, blocks: 13, insns: 0 */
        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Runnable runnableTake = ThreadManager.this.f57311a.take();
                    if (runnableTake instanceof HttpTask) {
                        ThreadManager.this.f57314d = (HttpTask) runnableTake;
                    }
                    ThreadManager.this.f57312b.execute(runnableTake);
                } catch (InterruptedException e) {
                    TxNetWorkHelper.getInstance().logError("ThreadManager", "network error , message: " + e.getMessage());
                }
            }
        }
    };

    public ThreadManager() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 15L, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new RejectedExecutionHandler() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.3
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                ThreadManager.this.addTask(runnable);
            }
        });
        this.f57312b = threadPoolExecutor;
        threadPoolExecutor.execute(this.f57315e);
        this.f57312b.execute(this.failedRunnable);
    }

    public static ThreadManager getInstance() {
        return f57310f;
    }

    public void addFailedTask(HttpTask httpTask) {
        if (httpTask == null) {
            return;
        }
        httpTask.setDelayTime(1000L);
        this.f57313c.offer(httpTask);
    }

    public void addTask(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            this.f57311a.put(runnable);
        } catch (InterruptedException e) {
            TxNetWorkHelper.getInstance().logError("ThreadManager", "add network task error , message: " + e.getMessage());
        }
    }

    public synchronized void stopCurrentRequest() {
        HttpTask httpTask = this.f57314d;
        if (httpTask != null) {
            httpTask.cleanRequest();
        }
    }
}
