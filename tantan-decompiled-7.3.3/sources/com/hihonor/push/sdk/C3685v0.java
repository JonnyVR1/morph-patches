package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.hihonor.push.sdk.v0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3685v0<TResult> implements InterfaceC3661j0<TResult> {

    /* JADX INFO: renamed from: a */
    public Executor f12675a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3665l0 f12676b;

    /* JADX INFO: renamed from: c */
    public final Object f12677c = new Object();

    public C3685v0(Executor executor, InterfaceC3665l0 interfaceC3665l0) {
        this.f12676b = interfaceC3665l0;
        this.f12675a = executor;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3661j0
    /* JADX INFO: renamed from: a */
    public final void mo18594a(C3635a1 c3635a1) {
        if (c3635a1.m18562e()) {
            return;
        }
        c3635a1.m18561d();
        this.f12675a.execute(new RunnableC3683u0(this, c3635a1));
    }
}
