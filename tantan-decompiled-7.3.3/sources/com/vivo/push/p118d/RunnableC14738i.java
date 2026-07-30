package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.d.i */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14738i implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f61831a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f61832b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f61833c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f61834d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C14737h f61835e;

    public RunnableC14738i(C14737h c14737h, int i, List list, List list2, String str) {
        this.f61835e = c14737h;
        this.f61831a = i;
        this.f61832b = list;
        this.f61833c = list2;
        this.f61834d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14737h c14737h = this.f61835e;
        ((AbstractC14755z) c14737h).f61858b.onDelTags(((AbstractRunnableC14764l) c14737h).f61899a, this.f61831a, this.f61832b, this.f61833c, this.f61834d);
    }
}
