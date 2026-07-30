package com.vivo.push;

import com.vivo.push.p116b.C14684b;

/* JADX INFO: renamed from: com.vivo.push.j */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14762j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14684b f61894a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f61895b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14756e f61896c;

    public RunnableC14762j(C14756e c14756e, C14684b c14684b, String str) {
        this.f61896c = c14756e;
        this.f61894a = c14684b;
        this.f61895b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61896c.m86049a(this.f61894a);
        this.f61896c.m86043e(this.f61895b);
    }
}
