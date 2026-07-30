package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14696n;

/* JADX INFO: renamed from: com.vivo.push.d.o */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14744o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14696n f61843a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14743n f61844b;

    public RunnableC14744o(C14743n c14743n, C14696n c14696n) {
        this.f61844b = c14743n;
        this.f61843a = c14696n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14743n c14743n = this.f61844b;
        ((AbstractC14755z) c14743n).f61858b.onLog(((AbstractRunnableC14764l) c14743n).f61899a, this.f61843a.m85935d(), this.f61843a.m85936e(), this.f61843a.m85937f());
    }
}
