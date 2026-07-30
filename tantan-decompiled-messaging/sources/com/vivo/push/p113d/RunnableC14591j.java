package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.j */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14591j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f60989a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f60990b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f60991c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f60992d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14589h f60993e;

    public RunnableC14591j(C14589h c14589h, int i, List list, List list2, String str) {
        this.f60993e = c14589h;
        this.f60989a = i;
        this.f60990b = list;
        this.f60991c = list2;
        this.f60992d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14589h c14589h = this.f60993e;
        ((AbstractC14607z) c14589h).f61011b.onDelAlias(((AbstractRunnableC14616l) c14589h).f61052a, this.f60989a, this.f60990b, this.f60991c, this.f60992d);
    }
}
