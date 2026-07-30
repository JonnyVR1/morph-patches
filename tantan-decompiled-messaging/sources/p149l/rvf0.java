package p149l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class rvf0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f161199a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public void m181279a() {
        if (this.f161199a.compareAndSet(0, 2)) {
            mo176698d();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract T mo8492c() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f161199a.compareAndSet(0, 1)) {
            try {
                T tMo8492c = mo8492c();
                this.f161199a.set(3);
                try {
                    mo113828f(tMo8492c);
                } finally {
                    mo8491b(tMo8492c);
                }
            } catch (Exception e) {
                this.f161199a.set(4);
                mo113827e(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo176698d() {
    }

    /* JADX INFO: renamed from: b */
    public void mo8491b(T t) {
    }

    /* JADX INFO: renamed from: e */
    public void mo113827e(Exception exc) {
    }

    /* JADX INFO: renamed from: f */
    public void mo113828f(T t) {
    }
}
