package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cpt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f81996a;

    public /* synthetic */ cpt0(AtomicReference atomicReference) {
        this.f81996a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ept0.m117676p(this.f81996a);
    }
}
