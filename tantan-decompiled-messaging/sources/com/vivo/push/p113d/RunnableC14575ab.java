package com.vivo.push.p113d;

import com.vivo.push.AbstractRunnableC14616l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.ab */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14575ab implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f60969a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f60970b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f60971c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f60972d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14574aa f60973e;

    public RunnableC14575ab(C14574aa c14574aa, int i, List list, List list2, String str) {
        this.f60973e = c14574aa;
        this.f60969a = i;
        this.f60970b = list;
        this.f60971c = list2;
        this.f60972d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14574aa c14574aa = this.f60973e;
        ((AbstractC14607z) c14574aa).f61011b.onSetTags(((AbstractRunnableC14616l) c14574aa).f61052a, this.f60969a, this.f60970b, this.f60971c, this.f60972d);
    }
}
