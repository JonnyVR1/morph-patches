package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14700r;

/* JADX INFO: renamed from: com.vivo.push.d.y */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14754y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14700r f61856a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14753x f61857b;

    public RunnableC14754y(C14753x c14753x, C14700r c14700r) {
        this.f61857b = c14753x;
        this.f61856a = c14700r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14753x c14753x = this.f61857b;
        ((AbstractC14755z) c14753x).f61858b.onPublish(((AbstractRunnableC14764l) c14753x).f61899a, this.f61856a.m85946h(), this.f61856a.m85945g());
    }
}
