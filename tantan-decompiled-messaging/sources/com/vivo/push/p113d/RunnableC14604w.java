package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.model.UPSNotificationMessage;

/* JADX INFO: renamed from: com.vivo.push.d.w */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14604w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ UPSNotificationMessage f61007a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14602u f61008b;

    public RunnableC14604w(C14602u c14602u, UPSNotificationMessage uPSNotificationMessage) {
        this.f61008b = c14602u;
        this.f61007a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14602u c14602u = this.f61008b;
        ((AbstractC14607z) c14602u).f61011b.onNotificationMessageClicked(((AbstractRunnableC14616l) c14602u).f61052a, this.f61007a);
    }
}
