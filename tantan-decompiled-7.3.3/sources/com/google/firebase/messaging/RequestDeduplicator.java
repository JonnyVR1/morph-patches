package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p153l.l01;
import p153l.s26;

/* JADX INFO: loaded from: classes7.dex */
class RequestDeduplicator {
    private final Executor executor;

    @GuardedBy("this")
    private final Map<String, Task<String>> getTokenRequests = new l01();

    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16883a(RequestDeduplicator requestDeduplicator, String str, Task task) {
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
        Task taskMo15424i = getTokenRequest.start().mo15424i(this.executor, new s26() { // from class: com.google.firebase.messaging.k
            @Override // p153l.s26
            public final Object then(Task task2) {
                return RequestDeduplicator.m16883a(this.f11521a, str, task2);
            }
        });
        this.getTokenRequests.put(str, (Task<String>) taskMo15424i);
        return taskMo15424i;
    }
}
