package com.vivo.push.p118d;

import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.p116b.C14695m;

/* JADX INFO: renamed from: com.vivo.push.d.m */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14742m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C14695m f61841a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14741l f61842b;

    public RunnableC14742m(C14741l c14741l, C14695m c14695m) {
        this.f61842b = c14741l;
        this.f61841a = c14695m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14741l c14741l = this.f61842b;
        ((AbstractC14755z) c14741l).f61858b.onListTags(((AbstractRunnableC14764l) c14741l).f61899a, this.f61841a.m85946h(), this.f61841a.m85931d(), this.f61841a.m85945g());
    }
}
