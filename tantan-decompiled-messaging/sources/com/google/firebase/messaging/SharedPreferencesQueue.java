package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
final class SharedPreferencesQueue {
    private final String itemSeparator;
    private final String queueName;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;

    @GuardedBy("internalQueue")
    @VisibleForTesting
    final ArrayDeque<String> internalQueue = new ArrayDeque<>();

    @GuardedBy("internalQueue")
    private boolean bulkOperation = false;

    private SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.sharedPreferences = sharedPreferences;
        this.queueName = str;
        this.itemSeparator = str2;
        this.syncExecutor = executor;
    }

    @GuardedBy("internalQueue")
    private boolean checkAndSyncState(boolean z) {
        if (z && !this.bulkOperation) {
            syncStateAsync();
        }
        return z;
    }

    @WorkerThread
    public static SharedPreferencesQueue createInstance(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        sharedPreferencesQueue.initQueue();
        return sharedPreferencesQueue;
    }

    @WorkerThread
    private void initQueue() {
        synchronized (this.internalQueue) {
            try {
                this.internalQueue.clear();
                String string = this.sharedPreferences.getString(this.queueName, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.itemSeparator)) {
                    String[] strArrSplit = string.split(this.itemSeparator, -1);
                    if (strArrSplit.length == 0) {
                        Log.e(Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.internalQueue.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void syncState() {
        synchronized (this.internalQueue) {
            this.sharedPreferences.edit().putString(this.queueName, serialize()).commit();
        }
    }

    private void syncStateAsync() {
        this.syncExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f11486a.syncState();
            }
        });
    }

    public boolean add(@NonNull String str) {
        boolean zCheckAndSyncState;
        if (TextUtils.isEmpty(str) || str.contains(this.itemSeparator)) {
            return false;
        }
        synchronized (this.internalQueue) {
            zCheckAndSyncState = checkAndSyncState(this.internalQueue.add(str));
        }
        return zCheckAndSyncState;
    }

    @GuardedBy("internalQueue")
    public void beginTransaction() {
        this.bulkOperation = true;
    }

    @VisibleForTesting
    public void beginTransactionSync() {
        synchronized (this.internalQueue) {
            beginTransaction();
        }
    }

    public void clear() {
        synchronized (this.internalQueue) {
            this.internalQueue.clear();
            checkAndSyncState(true);
        }
    }

    @GuardedBy("internalQueue")
    public void commitTransaction() {
        this.bulkOperation = false;
        syncStateAsync();
    }

    @VisibleForTesting
    public void commitTransactionSync() {
        synchronized (this.internalQueue) {
            commitTransaction();
        }
    }

    @Nullable
    public String peek() {
        String strPeek;
        synchronized (this.internalQueue) {
            strPeek = this.internalQueue.peek();
        }
        return strPeek;
    }

    public String remove() {
        String strCheckAndSyncState;
        synchronized (this.internalQueue) {
            strCheckAndSyncState = checkAndSyncState(this.internalQueue.remove());
        }
        return strCheckAndSyncState;
    }

    @NonNull
    @GuardedBy("internalQueue")
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.internalQueue.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.itemSeparator);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public String serializeSync() {
        String strSerialize;
        synchronized (this.internalQueue) {
            strSerialize = serialize();
        }
        return strSerialize;
    }

    public int size() {
        int size;
        synchronized (this.internalQueue) {
            size = this.internalQueue.size();
        }
        return size;
    }

    @NonNull
    public List<String> toList() {
        ArrayList arrayList;
        synchronized (this.internalQueue) {
            arrayList = new ArrayList(this.internalQueue);
        }
        return arrayList;
    }

    @GuardedBy("internalQueue")
    private String checkAndSyncState(String str) {
        checkAndSyncState(str != null);
        return str;
    }

    public boolean remove(@Nullable Object obj) {
        boolean zCheckAndSyncState;
        synchronized (this.internalQueue) {
            zCheckAndSyncState = checkAndSyncState(this.internalQueue.remove(obj));
        }
        return zCheckAndSyncState;
    }
}
