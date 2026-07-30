package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14548n;

/* JADX INFO: renamed from: com.vivo.push.d.o */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14596o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14548n f60996a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14595n f60997b;

    public RunnableC14596o(C14595n c14595n, C14548n c14548n) {
        this.f60997b = c14595n;
        this.f60996a = c14548n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14595n c14595n = this.f60997b;
        ((AbstractC14607z) c14595n).f61011b.onLog(((AbstractRunnableC14616l) c14595n).f61052a, this.f60996a.m84764d(), this.f60996a.m84765e(), this.f60996a.m84766f());
    }
}
