package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.model.UnvarnishedMessage;

/* JADX INFO: renamed from: com.vivo.push.d.q */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14598q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UnvarnishedMessage f60998a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14597p f60999b;

    public RunnableC14598q(C14597p c14597p, UnvarnishedMessage unvarnishedMessage) {
        this.f60999b = c14597p;
        this.f60998a = unvarnishedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14597p c14597p = this.f60999b;
        ((AbstractC14607z) c14597p).f61011b.onTransmissionMessage(((AbstractRunnableC14616l) c14597p).f61052a, this.f60998a);
    }
}
