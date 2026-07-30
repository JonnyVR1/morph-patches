package com.google.firebase.remoteconfig.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p153l.fm50;
import p153l.ol50;
import p153l.pox;
import p153l.to50;
import p153l.toi0;
import p153l.zdg0;

/* JADX INFO: loaded from: classes7.dex */
@AnyThread
public class ConfigCacheClient {
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;

    @Nullable
    @GuardedBy("this")
    private Task<ConfigContainer> cachedContainerTask = null;
    private final Executor executor;
    private final ConfigStorageClient storageClient;

    @GuardedBy("ConfigCacheClient.class")
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new pox();

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16905a(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer, Void r3) {
        if (z) {
            configCacheClient.updateInMemoryConfigContainer(configContainer);
        } else {
            configCacheClient.getClass();
        }
        return toi0.m192068f(configContainer);
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        task.mo15420e(executor, awaitListener);
        task.mo15418c(executor, awaitListener);
        task.mo15416a(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.mo15431p()) {
            return task.mo15427l();
        }
        throw new ExecutionException(task.mo15426k());
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        clientInstances.clear();
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        String fileName;
        Map<String, ConfigCacheClient> map;
        try {
            fileName = configStorageClient.getFileName();
            map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new ConfigCacheClient(executor, configStorageClient));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(fileName);
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = toi0.m192068f(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = toi0.m192068f(null);
        }
        this.storageClient.clear();
    }

    public synchronized Task<ConfigContainer> get() {
        try {
            Task<ConfigContainer> task = this.cachedContainerTask;
            if (task == null || (task.mo15430o() && !this.cachedContainerTask.mo15431p())) {
                Executor executor = this.executor;
                final ConfigStorageClient configStorageClient = this.storageClient;
                Objects.requireNonNull(configStorageClient);
                this.cachedContainerTask = toi0.m192065c(executor, new Callable() { // from class: l.aw5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return configStorageClient.read();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cachedContainerTask;
    }

    @Nullable
    @VisibleForTesting
    public ConfigContainer getBlocking(long j) {
        synchronized (this) {
            try {
                Task<ConfigContainer> task = this.cachedContainerTask;
                if (task == null || !task.mo15431p()) {
                    try {
                        return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return this.cachedContainerTask.mo15427l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public synchronized Task<ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return toi0.m192065c(this.executor, new Callable() { // from class: l.yv5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f201678a.storageClient.write(configContainer);
            }
        }).mo15432q(this.executor, new zdg0() { // from class: l.zv5
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                return ConfigCacheClient.m16905a(this.f206184a, z, configContainer, (Void) obj);
            }
        });
    }

    public static class AwaitListener<TResult> implements to50<TResult>, fm50, ol50 {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.latch.await(j, timeUnit);
        }

        @Override // p153l.ol50
        public void onCanceled() {
            this.latch.countDown();
        }

        @Override // p153l.fm50
        public void onFailure(@NonNull Exception exc) {
            this.latch.countDown();
        }

        @Override // p153l.to50
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return getBlocking(5L);
    }
}
