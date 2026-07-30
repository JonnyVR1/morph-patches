package com.vivo.push.util;

import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.util.l */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14643l implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f61127a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AsyncTaskC14642k f61128b;

    public RunnableC14643l(AsyncTaskC14642k asyncTaskC14642k, List list) {
        this.f61128b = asyncTaskC14642k;
        this.f61127a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61128b.f61122b != null) {
            C14654w.m85045b().m84965a("com.vivo.push.notify_key", this.f61128b.f61123c);
            NotifyAdapterUtil.pushNotification(this.f61128b.f61121a, this.f61127a, this.f61128b.f61122b, this.f61128b.f61123c, this.f61128b.f61125e, this.f61128b.f61126f);
        }
    }
}
