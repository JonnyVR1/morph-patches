package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14552r;

/* JADX INFO: renamed from: com.vivo.push.d.y */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14606y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14552r f61009a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14605x f61010b;

    public RunnableC14606y(C14605x c14605x, C14552r c14552r) {
        this.f61010b = c14605x;
        this.f61009a = c14552r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14605x c14605x = this.f61010b;
        ((AbstractC14607z) c14605x).f61011b.onPublish(((AbstractRunnableC14616l) c14605x).f61052a, this.f61009a.m84775h(), this.f61009a.m84774g());
    }
}
