package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.x0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3689x0<TResult> implements InterfaceC3661j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f12683a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3667m0<TResult> f12684b;

    /* JADX INFO: renamed from: c */
    public final Object f12685c = new Object();

    public C3689x0(Executor executor, InterfaceC3667m0<TResult> interfaceC3667m0) {
        this.f12684b = interfaceC3667m0;
        this.f12683a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3661j0
    /* JADX INFO: renamed from: a */
    public final void mo18594a(C3635a1 c3635a1) {
        if (c3635a1.m18562e()) {
            c3635a1.m18561d();
            this.f12683a.execute(new RunnableC3687w0(this, c3635a1));
        }
    }
}
