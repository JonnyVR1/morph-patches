package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p149l.e01;
import p149l.n16;

/* JADX INFO: loaded from: classes7.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<Pair<String, String>, Task<InstanceIdResult>> getTokenRequests = new e01();

    public interface GetTokenRequest {
        Task<InstanceIdResult> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    public synchronized Task<InstanceIdResult> getOrStartGetTokenRequest(String str, String str2, GetTokenRequest getTokenRequest) {
        final Pair<String, String> pair = new Pair<>(str, str2);
        Task<InstanceIdResult> task = this.getTokenRequests.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                new StringBuilder(String.valueOf(pair).length() + 29);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            new StringBuilder(String.valueOf(pair).length() + 24);
        }
        Task taskMo15370i = getTokenRequest.start().mo15370i(this.executor, new n16(this, pair) { // from class: com.google.firebase.iid.RequestDeduplicator$$Lambda$0
            private final RequestDeduplicator arg$1;
            private final Pair arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = pair;
            }

            @Override // p149l.n16
            public Object then(Task task2) throws Exception {
                this.arg$1.lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(this.arg$2, task2);
                return task2;
            }
        });
        this.getTokenRequests.put(pair, (Task<InstanceIdResult>) taskMo15370i);
        return taskMo15370i;
    }

    public final /* synthetic */ Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(pair);
        }
        return task;
    }
}
