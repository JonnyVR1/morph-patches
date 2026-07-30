package com.vivo.push;

import com.vivo.push.p111b.C14536b;

/* JADX INFO: renamed from: com.vivo.push.h */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14612h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14536b f61043a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f61044b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14608e f61045c;

    public RunnableC14612h(C14608e c14608e, C14536b c14536b, String str) {
        this.f61045c = c14608e;
        this.f61043a = c14536b;
        this.f61044b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61045c.m84878a(this.f61043a);
        this.f61045c.m84872e(this.f61044b);
    }
}
