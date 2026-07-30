package p153l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a4g0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f68389a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public void m95923a() {
        if (this.f68389a.compareAndSet(0, 2)) {
            mo95924d();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract T mo8546c() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f68389a.compareAndSet(0, 1)) {
            try {
                T tMo8546c = mo8546c();
                this.f68389a.set(3);
                try {
                    mo95926f(tMo8546c);
                } finally {
                    mo8545b(tMo8546c);
                }
            } catch (Exception e) {
                this.f68389a.set(4);
                mo95925e(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo95924d() {
    }

    /* JADX INFO: renamed from: b */
    public void mo8545b(T t) {
    }

    /* JADX INFO: renamed from: e */
    public void mo95925e(Exception exc) {
    }

    /* JADX INFO: renamed from: f */
    public void mo95926f(T t) {
    }
}
