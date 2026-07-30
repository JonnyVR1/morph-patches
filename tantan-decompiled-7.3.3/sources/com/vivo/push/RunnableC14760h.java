package com.vivo.push;

import com.vivo.push.p116b.C14684b;

/* JADX INFO: renamed from: com.vivo.push.h */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14760h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14684b f61890a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f61891b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14756e f61892c;

    public RunnableC14760h(C14756e c14756e, C14684b c14684b, String str) {
        this.f61892c = c14756e;
        this.f61890a = c14684b;
        this.f61891b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61892c.m86049a(this.f61890a);
        this.f61892c.m86043e(this.f61891b);
    }
}
