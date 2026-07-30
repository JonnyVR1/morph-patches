package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: renamed from: com.vivo.push.d.q */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14746q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UnvarnishedMessage f61845a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14745p f61846b;

    public RunnableC14746q(C14745p c14745p, UnvarnishedMessage unvarnishedMessage) {
        this.f61846b = c14745p;
        this.f61845a = unvarnishedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14745p c14745p = this.f61846b;
        ((AbstractC14755z) c14745p).f61858b.onTransmissionMessage(((AbstractRunnableC14764l) c14745p).f61899a, this.f61845a);
    }
}
