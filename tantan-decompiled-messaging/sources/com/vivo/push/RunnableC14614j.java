package com.vivo.push;

import com.vivo.push.p111b.C14536b;

/* JADX INFO: renamed from: com.vivo.push.j */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14614j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14536b f61047a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f61048b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14608e f61049c;

    public RunnableC14614j(C14608e c14608e, C14536b c14536b, String str) {
        this.f61049c = c14608e;
        this.f61047a = c14536b;
        this.f61048b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61049c.m84878a(this.f61047a);
        this.f61049c.m84872e(this.f61048b);
    }
}
