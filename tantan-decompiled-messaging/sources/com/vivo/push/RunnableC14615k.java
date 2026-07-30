package com.vivo.push;

/* JADX INFO: renamed from: com.vivo.push.k */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14615k implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f61050a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14608e f61051b;

    public RunnableC14615k(C14608e c14608e, String str) {
        this.f61051b = c14608e;
        this.f61050a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14608e.a aVarM84870d = this.f61051b.m84870d(this.f61050a);
        if (aVarM84870d != null) {
            aVarM84870d.m84904a(1003, new Object[0]);
        }
    }
}
