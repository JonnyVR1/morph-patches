package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.p111b.C14543i;

/* JADX INFO: renamed from: com.vivo.push.d.ae */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14578ae implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14543i f60979a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14577ad f60980b;

    public RunnableC14578ae(C14577ad c14577ad, C14543i c14543i) {
        this.f60980b = c14577ad;
        this.f60979a = c14543i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14577ad c14577ad = this.f60980b;
        ((AbstractC14607z) c14577ad).f61011b.onUnBind(((AbstractRunnableC14616l) c14577ad).f61052a, this.f60979a.m84775h(), this.f60979a.m84754d());
    }
}
