package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;
import p153l.vo50;

/* JADX INFO: renamed from: com.clevertap.android.sdk.task.d */
/* JADX INFO: loaded from: classes.dex */
class C1338d<TResult> extends AbstractC1335a<TResult> {

    /* JADX INFO: renamed from: b */
    private final vo50<TResult> f5512b;

    public C1338d(Executor executor, vo50<TResult> vo50Var) {
        super(executor);
        this.f5512b = vo50Var;
    }

    @Override // com.clevertap.android.sdk.task.AbstractC1335a
    /* JADX INFO: renamed from: a */
    public void mo7007a(final TResult tresult) {
        this.f5506a.execute(new Runnable() { // from class: com.clevertap.android.sdk.task.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5510a.f5512b.onSuccess(tresult);
            }
        });
    }
}
