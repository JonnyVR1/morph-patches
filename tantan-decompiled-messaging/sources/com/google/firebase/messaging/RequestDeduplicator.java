package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p149l.e01;
import p149l.n16;

/* JADX INFO: loaded from: classes7.dex */
class RequestDeduplicator {
    private final Executor executor;

    @GuardedBy("this")
    private final Map<String, Task<String>> getTokenRequests = new e01();

    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16828a(RequestDeduplicator requestDeduplicator, String str, Task task) {
        synchronized (requestDeduplicator) {
            requestDeduplicator.getTokenRequests.remove(str);
        }
        return task;
    }

    public synchronized Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            Log.isLoggable(Constants.TAG, 3);
            return task;
        }
        Log.isLoggable(Constants.TAG, 3);
        Task taskMo15370i = getTokenRequest.start().mo15370i(this.executor, new n16() { // from class: com.google.firebase.messaging.k
            @Override // p149l.n16
            public final Object then(Task task2) {
                return RequestDeduplicator.m16828a(this.f11484a, str, task2);
            }
        });
        this.getTokenRequests.put(str, (Task<String>) taskMo15370i);
        return taskMo15370i;
    }
}
