package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.model.UPSNotificationMessage;

/* JADX INFO: renamed from: com.vivo.push.d.w */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14752w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSNotificationMessage f61854a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14750u f61855b;

    public RunnableC14752w(C14750u c14750u, UPSNotificationMessage uPSNotificationMessage) {
        this.f61855b = c14750u;
        this.f61854a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14750u c14750u = this.f61855b;
        ((AbstractC14755z) c14750u).f61858b.onNotificationMessageClicked(((AbstractRunnableC14764l) c14750u).f61899a, this.f61854a);
    }
}
