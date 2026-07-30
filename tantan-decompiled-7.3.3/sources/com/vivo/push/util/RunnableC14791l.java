package com.vivo.push.util;

import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.util.l */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14791l implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ List f61974a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AsyncTaskC14790k f61975b;

    public RunnableC14791l(AsyncTaskC14790k asyncTaskC14790k, List list) {
        this.f61975b = asyncTaskC14790k;
        this.f61974a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61975b.f61969b != null) {
            C14802w.m86216b().m86136a("com.vivo.push.notify_key", this.f61975b.f61970c);
            NotifyAdapterUtil.pushNotification(this.f61975b.f61968a, this.f61974a, this.f61975b.f61969b, this.f61975b.f61970c, this.f61975b.f61972e, this.f61975b.f61973f);
        }
    }
}
