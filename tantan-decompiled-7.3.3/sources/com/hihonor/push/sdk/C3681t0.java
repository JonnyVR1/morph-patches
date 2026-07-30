package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.t0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3681t0<TResult> implements InterfaceC3661j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f12665a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3663k0<TResult> f12666b;

    /* JADX INFO: renamed from: c */
    public final Object f12667c = new Object();

    public C3681t0(Executor executor, InterfaceC3663k0<TResult> interfaceC3663k0) {
        this.f12666b = interfaceC3663k0;
        this.f12665a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3661j0
    /* JADX INFO: renamed from: a */
    public final void mo18594a(C3635a1 c3635a1) {
        this.f12665a.execute(new RunnableC3679s0(this, c3635a1));
    }
}
