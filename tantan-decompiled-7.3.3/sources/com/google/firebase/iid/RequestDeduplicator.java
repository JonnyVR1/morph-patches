package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p153l.l01;
import p153l.s26;

/* JADX INFO: loaded from: classes7.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<Pair<String, String>, Task<InstanceIdResult>> getTokenRequests = new l01();

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
        Task taskMo15424i = getTokenRequest.start().mo15424i(this.executor, new s26(this, pair) { // from class: com.google.firebase.iid.RequestDeduplicator$$Lambda$0
            private final RequestDeduplicator arg$1;
            private final Pair arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = pair;
            }

            @Override // p153l.s26
            public Object then(Task task2) throws Exception {
                this.arg$1.lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(this.arg$2, task2);
                return task2;
            }
        });
        this.getTokenRequests.put(pair, (Task<InstanceIdResult>) taskMo15424i);
        return taskMo15424i;
    }

    public final /* synthetic */ Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(pair);
        }
        return task;
    }
}
