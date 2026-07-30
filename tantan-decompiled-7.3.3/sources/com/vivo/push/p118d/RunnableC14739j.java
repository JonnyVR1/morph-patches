package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.j */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14739j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f61836a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f61837b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f61838c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f61839d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14737h f61840e;

    public RunnableC14739j(C14737h c14737h, int i, List list, List list2, String str) {
        this.f61840e = c14737h;
        this.f61836a = i;
        this.f61837b = list;
        this.f61838c = list2;
        this.f61839d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14737h c14737h = this.f61840e;
        ((AbstractC14755z) c14737h).f61858b.onDelAlias(((AbstractRunnableC14764l) c14737h).f61899a, this.f61836a, this.f61837b, this.f61838c, this.f61839d);
    }
}
