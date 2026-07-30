package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.ab */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14723ab implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f61816a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f61817b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f61818c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f61819d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14722aa f61820e;

    public RunnableC14723ab(C14722aa c14722aa, int i, List list, List list2, String str) {
        this.f61820e = c14722aa;
        this.f61816a = i;
        this.f61817b = list;
        this.f61818c = list2;
        this.f61819d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14722aa c14722aa = this.f61820e;
        ((AbstractC14755z) c14722aa).f61858b.onSetTags(((AbstractRunnableC14764l) c14722aa).f61899a, this.f61816a, this.f61817b, this.f61818c, this.f61819d);
    }
}
