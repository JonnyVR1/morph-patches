package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.i */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14590i implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f60984a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f60985b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f60986c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f60987d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14589h f60988e;

    public RunnableC14590i(C14589h c14589h, int i, List list, List list2, String str) {
        this.f60988e = c14589h;
        this.f60984a = i;
        this.f60985b = list;
        this.f60986c = list2;
        this.f60987d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14589h c14589h = this.f60988e;
        ((AbstractC14607z) c14589h).f61011b.onDelTags(((AbstractRunnableC14616l) c14589h).f61052a, this.f60984a, this.f60985b, this.f60986c, this.f60987d);
    }
}
