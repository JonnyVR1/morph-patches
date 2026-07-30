package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.ac */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14724ac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f61821a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f61822b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f61823c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f61824d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14722aa f61825e;

    public RunnableC14724ac(C14722aa c14722aa, int i, List list, List list2, String str) {
        this.f61825e = c14722aa;
        this.f61821a = i;
        this.f61822b = list;
        this.f61823c = list2;
        this.f61824d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14722aa c14722aa = this.f61825e;
        ((AbstractC14755z) c14722aa).f61858b.onSetAlias(((AbstractRunnableC14764l) c14722aa).f61899a, this.f61821a, this.f61822b, this.f61823c, this.f61824d);
    }
}
