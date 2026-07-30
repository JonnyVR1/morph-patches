package com.vivo.push;

/* JADX INFO: renamed from: com.vivo.push.k */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14763k implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f61897a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14756e f61898b;

    public RunnableC14763k(C14756e c14756e, String str) {
        this.f61898b = c14756e;
        this.f61897a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14756e.a aVarM86041d = this.f61898b.m86041d(this.f61897a);
        if (aVarM86041d != null) {
            aVarM86041d.m86075a(1003, new Object[0]);
        }
    }
}
