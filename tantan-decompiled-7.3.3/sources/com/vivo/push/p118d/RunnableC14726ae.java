package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14691i;

/* JADX INFO: renamed from: com.vivo.push.d.ae */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14726ae implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14691i f61826a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14725ad f61827b;

    public RunnableC14726ae(C14725ad c14725ad, C14691i c14691i) {
        this.f61827b = c14725ad;
        this.f61826a = c14691i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14725ad c14725ad = this.f61827b;
        ((AbstractC14755z) c14725ad).f61858b.onUnBind(((AbstractRunnableC14764l) c14725ad).f61899a, this.f61826a.m85946h(), this.f61826a.m85925d());
    }
}
