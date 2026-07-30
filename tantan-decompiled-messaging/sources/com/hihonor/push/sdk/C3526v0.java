package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.v0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3526v0<TResult> implements InterfaceC3502j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f11934a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3506l0 f11935b;

    /* JADX INFO: renamed from: c */
    public final Object f11936c = new Object();

    public C3526v0(Executor executor, InterfaceC3506l0 interfaceC3506l0) {
        this.f11935b = interfaceC3506l0;
        this.f11934a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3502j0
    /* JADX INFO: renamed from: a */
    public final void mo17517a(C3476a1 c3476a1) {
        if (c3476a1.m17485e()) {
            return;
        }
        c3476a1.m17484d();
        this.f11934a.execute(new RunnableC3524u0(this, c3476a1));
    }
}
