package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iyt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f117636a;

    public /* synthetic */ iyt0(AtomicReference atomicReference) {
        this.f117636a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kyt0.m152132p(this.f117636a);
    }
}
