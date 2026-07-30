package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.e01;
import p149l.j6f;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
class TopicsSubscriber {
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = 28800;
    private static final long MIN_DELAY_SEC = 30;
    private static final long RPC_TIMEOUT_SEC = 30;
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;

    @GuardedBy("pendingOperations")
    private final Map<String, ArrayDeque<sei0<Void>>> pendingOperations = new e01();

    @GuardedBy("this")
    private boolean syncScheduledOrRunning = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TopicsSubscriber m16830a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    private void addToPendingOperations(TopicOperation topicOperation, sei0<Void> sei0Var) {
        ArrayDeque<sei0<Void>> arrayDeque;
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    arrayDeque = this.pendingOperations.get(strSerialize);
                } else {
                    ArrayDeque<sei0<Void>> arrayDeque2 = new ArrayDeque<>();
                    this.pendingOperations.put(strSerialize, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(sei0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    private static <T> void awaitTask(Task<T> task) throws IOException {
        try {
            tfi0.m188730b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    @WorkerThread
    private void blockingSubscribeToTopic(String str) throws IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @WorkerThread
    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    @VisibleForTesting
    public static Task<TopicsSubscriber> createInstance(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return tfi0.m188731c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TopicsSubscriber.m16830a(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
            }
        });
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    ArrayDeque<sei0<Void>> arrayDeque = this.pendingOperations.get(strSerialize);
                    sei0<Void> sei0VarPoll = arrayDeque.poll();
                    if (sei0VarPoll != null) {
                        sei0VarPoll.m183659c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.pendingOperations.remove(strSerialize);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    @VisibleForTesting
    public TopicsStore getStore() {
        return this.store;
    }

    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    public synchronized boolean isSyncScheduledOrRunning() {
        return this.syncScheduledOrRunning;
    }

    @WorkerThread
    public boolean performTopicOperation(TopicOperation topicOperation) throws IOException {
        try {
            String operation = topicOperation.getOperation();
            int iHashCode = operation.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && operation.equals("U")) {
                    blockingUnsubscribeFromTopic(topicOperation.getTopic());
                    if (!isDebugLogEnabled()) {
                        return true;
                    }
                    topicOperation.getTopic();
                    return true;
                }
            } else if (operation.equals(j6f.LATITUDE_SOUTH)) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (!isDebugLogEnabled()) {
                    return true;
                }
                topicOperation.getTopic();
                return true;
            }
            isDebugLogEnabled();
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.e(Constants.TAG, "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e(Constants.TAG, "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    public Task<Void> scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        sei0<Void> sei0Var = new sei0<>();
        addToPendingOperations(topicOperation, sei0Var);
        return sei0Var.m183657a();
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    public Task<Void> subscribeToTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.subscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }

    @WorkerThread
    public boolean syncTopics() throws IOException {
        while (true) {
            synchronized (this) {
                try {
                    TopicOperation nextTopicOperation = this.store.getNextTopicOperation();
                    if (nextTopicOperation == null) {
                        isDebugLogEnabled();
                        return true;
                    }
                    if (!performTopicOperation(nextTopicOperation)) {
                        return false;
                    }
                    this.store.removeTopicOperation(nextTopicOperation);
                    markCompletePendingOperation(nextTopicOperation);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        Task<Void> taskScheduleTopicOperation = scheduleTopicOperation(TopicOperation.unsubscribe(str));
        startTopicsSyncIfNecessary();
        return taskScheduleTopicOperation;
    }
}
