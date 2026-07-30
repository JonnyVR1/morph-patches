package cn.shuzilm.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: cn.shuzilm.core.i */
/* JADX INFO: loaded from: classes.dex */
class C0817i implements Listener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f3823a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CountDownLatch f3824b;

    public C0817i(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f3823a = atomicReference;
        this.f3824b = countDownLatch;
    }

    @Override // cn.shuzilm.core.Listener
    public void handler(String str) {
        this.f3823a.set(str);
        this.f3824b.countDown();
    }
}
