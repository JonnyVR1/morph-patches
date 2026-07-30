package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;
import p153l.hm50;

/* JADX INFO: renamed from: com.clevertap.android.sdk.task.b */
/* JADX INFO: loaded from: classes.dex */
class C1336b<TResult> extends AbstractC1335a<TResult> {

    /* JADX INFO: renamed from: b */
    private final hm50<TResult> f5507b;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.task.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f5508a;

        public a(Object obj) {
            this.f5508a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            C1336b.this.f5507b.mo118349a(this.f5508a);
        }
    }

    public C1336b(Executor executor, hm50<TResult> hm50Var) {
        super(executor);
        this.f5507b = hm50Var;
    }

    @Override // com.clevertap.android.sdk.task.AbstractC1335a
    /* JADX INFO: renamed from: a */
    public void mo7007a(TResult tresult) {
        this.f5506a.execute(new a(tresult));
    }
}
