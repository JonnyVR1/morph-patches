package com.tencent.cloud.p080ai.network.okhttp3.internal;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.b */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractRunnableC13868b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f57302a;

    public AbstractRunnableC13868b(String str, Object... objArr) {
        this.f57302a = C13869c.m82788a(str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo82780a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f57302a);
        try {
            mo82780a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
