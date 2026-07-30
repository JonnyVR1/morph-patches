package com.tantanapp.media.ttmediautils.task;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class RunnablePool {
    public static final int IO_OPERATION = 1;
    public static final String IO_WRITE_READ = "ttmeida_io_write_read";
    public static final int LIGHT_OPERATION = 3;
    public static final String LIGHT_OPERATION_NAME = "ttmeida_light_operation_name";
    public static final int LOGGING = 4;
    public static final String LOGGING_NAME = "ttmeida_logging";
    public static final String NETWORK_OPERATION_NAME = "ttmeida_network_operation";
    public static final int NET_OPERATION = 2;
    public static final String REJECT_NAME = "ttmeida_reject";
    public static final int TASK_DISTRIBUTE = 5;
    public static final String TASK_DISTRIBUTE_NAME = "ttmeida_task_distribute_name";
    private static volatile RunnablePool instance;
    private volatile ThreadPoolExecutor mIoExecutor;
    private volatile ThreadPoolExecutor mLightExecutor;
    private volatile ThreadPoolExecutor mLoggingExecutor;
    private volatile ThreadPoolExecutor mNetworkExecutor;
    private volatile ThreadPoolExecutor mTaskDistributor;
    private int maxSize = 16;

    public static class MyRejectHandler implements RejectedExecutionHandler {
        public String threadPoolName;

        public MyRejectHandler(String str) {
            this.threadPoolName = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            RejectExecutorHolder.sRejectExecutor.execute(runnable);
        }
    }

    public static class RejectExecutorHolder {
        private static final LinkedBlockingQueue<Runnable> rejectQueue;
        private static final ThreadPoolExecutor sRejectExecutor;

        static {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            rejectQueue = linkedBlockingQueue;
            sRejectExecutor = new MonitorThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, linkedBlockingQueue, new MyThreadFactory(RunnablePool.REJECT_NAME), new MyRejectHandler(RunnablePool.REJECT_NAME), RunnablePool.REJECT_NAME);
        }

        private RejectExecutorHolder() {
        }
    }

    public @interface Type {
    }

    private RunnablePool() {
    }

    public static RunnablePool getInstance() {
        if (instance == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (instance == null) {
                        instance = new RunnablePool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void initIOExecutor() {
        if (this.mIoExecutor == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (this.mIoExecutor == null) {
                        this.mIoExecutor = new MonitorThreadPoolExecutor(1, 4, 2L, TimeUnit.SECONDS, new ArrayBlockingQueue(this.maxSize), new MyThreadFactory(IO_WRITE_READ), new MyRejectHandler(IO_WRITE_READ), IO_WRITE_READ);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void initLoggingExecutor() {
        if (this.mLoggingExecutor == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (this.mLoggingExecutor == null) {
                        this.mLoggingExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new MyThreadFactory(LOGGING_NAME), new MyRejectHandler(LOGGING_NAME));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void initTaskDistributor() {
        if (this.mTaskDistributor == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (this.mTaskDistributor == null) {
                        this.mTaskDistributor = new MonitorThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(this.maxSize), new MyThreadFactory(TASK_DISTRIBUTE_NAME), new MyRejectHandler(TASK_DISTRIBUTE_NAME), TASK_DISTRIBUTE_NAME);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addTaskIntoPool(Runnable runnable, int i) {
        getExecutor(i).execute(runnable);
    }

    public ThreadPoolExecutor getExecutor(@Type int i) {
        if (i == 1) {
            initIOExecutor();
            return this.mIoExecutor;
        }
        if (i == 2) {
            initNetworkExecutor();
            return this.mNetworkExecutor;
        }
        if (i == 3) {
            initLightExecutor();
            return this.mLightExecutor;
        }
        if (i == 4) {
            initLoggingExecutor();
            return this.mLoggingExecutor;
        }
        if (i != 5) {
            initLightExecutor();
            return this.mLightExecutor;
        }
        initTaskDistributor();
        return this.mTaskDistributor;
    }

    public Thread getThread(Runnable runnable, String str) {
        MyThread myThread = new MyThread(new ThreadGroup("TTMedia#ThreadGroup#RunnablePool"), runnable, str);
        myThread.setPriority(3);
        return myThread;
    }

    public void initLightExecutor() {
        if (this.mLightExecutor == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (this.mLightExecutor == null) {
                        this.mLightExecutor = new MonitorThreadPoolExecutor(2, 4, 2L, TimeUnit.SECONDS, new ArrayBlockingQueue(this.maxSize), new MyThreadFactory(LIGHT_OPERATION_NAME), new MyRejectHandler(LIGHT_OPERATION_NAME), LIGHT_OPERATION_NAME);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void initNetworkExecutor() {
        if (this.mNetworkExecutor == null) {
            synchronized (RunnablePool.class) {
                try {
                    if (this.mNetworkExecutor == null) {
                        this.mNetworkExecutor = new MonitorThreadPoolExecutor(0, 2, 2L, TimeUnit.SECONDS, new ArrayBlockingQueue(this.maxSize), new MyThreadFactory(NETWORK_OPERATION_NAME), new MyRejectHandler(NETWORK_OPERATION_NAME), NETWORK_OPERATION_NAME);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void startThread(Runnable runnable, String str) {
        getThread(runnable, str).start();
    }

    public void addTaskIntoPool(NamedRunnable namedRunnable, int i) {
        getExecutor(i).execute(namedRunnable);
    }

    public Thread getThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        MyThread myThread = new MyThread(threadGroup, runnable, str);
        myThread.setPriority(3);
        return myThread;
    }
}
