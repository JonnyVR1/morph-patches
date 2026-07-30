package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;
import p149l.pg50;

/* JADX INFO: renamed from: com.clevertap.android.sdk.task.d */
/* JADX INFO: loaded from: classes.dex */
class C1315d<TResult> extends AbstractC1312a<TResult> {

    /* JADX INFO: renamed from: b */
    private final pg50<TResult> f5475b;

    public C1315d(Executor executor, pg50<TResult> pg50Var) {
        super(executor);
        this.f5475b = pg50Var;
    }

    @Override // com.clevertap.android.sdk.task.AbstractC1312a
    /* JADX INFO: renamed from: a */
    public void mo6953a(final TResult tresult) {
        this.f5469a.execute(new Runnable() { // from class: com.clevertap.android.sdk.task.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5473a.f5475b.onSuccess(tresult);
            }
        });
    }
}
