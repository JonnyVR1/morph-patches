package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14547m;

/* JADX INFO: renamed from: com.vivo.push.d.m */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14594m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14547m f60994a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14593l f60995b;

    public RunnableC14594m(C14593l c14593l, C14547m c14547m) {
        this.f60995b = c14593l;
        this.f60994a = c14547m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14593l c14593l = this.f60995b;
        ((AbstractC14607z) c14593l).f61011b.onListTags(((AbstractRunnableC14616l) c14593l).f61052a, this.f60994a.m84775h(), this.f60994a.m84760d(), this.f60994a.m84774g());
    }
}
