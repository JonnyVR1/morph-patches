package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class FcmExecutors {
    private static final String THREAD_FILE = "Firebase-Messaging-File";
    static final String THREAD_FILE_IO = "Firebase-Messaging-File-Io";
    private static final String THREAD_INIT = "Firebase-Messaging-Init";
    private static final String THREAD_INTENT_HANDLE = "Firebase-Messaging-Intent-Handle";
    private static final String THREAD_NETWORK_IO = "Firebase-Messaging-Network-Io";
    static final String THREAD_RPC_TASK = "Firebase-Messaging-Rpc-Task";
    private static final String THREAD_TASK = "Firebase-Messaging-Task";
    private static final String THREAD_TOPICS_IO = "Firebase-Messaging-Topics-Io";

    private FcmExecutors() {
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static Executor newCachedSingleThreadExecutor(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService newFileExecutor() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(THREAD_FILE));
    }

    public static Executor newFileIOExecutor() {
        return newCachedSingleThreadExecutor(THREAD_FILE_IO);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService newInitExecutor() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(THREAD_INIT));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService newIntentHandleExecutor() {
        return PoolableExecutors.factory().newSingleThreadExecutor(new NamedThreadFactory(THREAD_INTENT_HANDLE), ThreadPriority.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService newNetworkIOExecutor() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(THREAD_NETWORK_IO));
    }

    public static Executor newRpcTasksExecutor() {
        return newCachedSingleThreadExecutor(THREAD_RPC_TASK);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService newTaskExecutor() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(THREAD_TASK));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService newTopicsSyncExecutor() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(THREAD_TOPICS_IO));
    }
}
