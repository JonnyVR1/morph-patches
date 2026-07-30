package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;
import p149l.ae50;

/* JADX INFO: renamed from: com.clevertap.android.sdk.task.b */
/* JADX INFO: loaded from: classes.dex */
class C1313b<TResult> extends AbstractC1312a<TResult> {

    /* JADX INFO: renamed from: b */
    private final ae50<TResult> f5470b;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.task.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f5471a;

        public a(Object obj) {
            this.f5471a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            C1313b.this.f5470b.mo96043a(this.f5471a);
        }
    }

    public C1313b(Executor executor, ae50<TResult> ae50Var) {
        super(executor);
        this.f5470b = ae50Var;
    }

    @Override // com.clevertap.android.sdk.task.AbstractC1312a
    /* JADX INFO: renamed from: a */
    public void mo6953a(TResult tresult) {
        this.f5469a.execute(new a(tresult));
    }
}
