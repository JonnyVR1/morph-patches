package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.x0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3530x0<TResult> implements InterfaceC3502j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f11942a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3508m0<TResult> f11943b;

    /* JADX INFO: renamed from: c */
    public final Object f11944c = new Object();

    public C3530x0(Executor executor, InterfaceC3508m0<TResult> interfaceC3508m0) {
        this.f11943b = interfaceC3508m0;
        this.f11942a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3502j0
    /* JADX INFO: renamed from: a */
    public final void mo17517a(C3476a1 c3476a1) {
        if (c3476a1.m17485e()) {
            c3476a1.m17484d();
            this.f11942a.execute(new RunnableC3528w0(this, c3476a1));
        }
    }
}
