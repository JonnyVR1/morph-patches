package com.tencent.cloud.p075ai.network.okhttp3.internal;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.b */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractRunnableC13705b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f56454a;

    public AbstractRunnableC13705b(String str, Object... objArr) {
        this.f56454a = C13706c.m81605a(str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo81597a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f56454a);
        try {
            mo81597a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
