package cn.shuzilm.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: cn.shuzilm.core.p */
/* JADX INFO: loaded from: classes.dex */
class C0828p implements Listener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f3835a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CountDownLatch f3836b;

    public C0828p(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f3835a = atomicReference;
        this.f3836b = countDownLatch;
    }

    @Override // cn.shuzilm.core.Listener
    public void handler(String str) {
        this.f3835a.set(str);
        this.f3836b.countDown();
    }
}
