package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.t0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3522t0<TResult> implements InterfaceC3502j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f11924a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3504k0<TResult> f11925b;

    /* JADX INFO: renamed from: c */
    public final Object f11926c = new Object();

    public C3522t0(Executor executor, InterfaceC3504k0<TResult> interfaceC3504k0) {
        this.f11925b = interfaceC3504k0;
        this.f11924a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3502j0
    /* JADX INFO: renamed from: a */
    public final void mo17517a(C3476a1 c3476a1) {
        this.f11924a.execute(new RunnableC3520s0(this, c3476a1));
    }
}
