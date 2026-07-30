package p003l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p014rx.C1098b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mn5 implements C1098b.h {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C1098b> f5688a;

    /* JADX INFO: renamed from: l.mn5$a */
    public class C0430a implements C1098b.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bs5 f5689a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f5690b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1098b.j f5691c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicInteger f5692d;

        public C0430a(bs5 bs5Var, AtomicBoolean atomicBoolean, C1098b.j jVar, AtomicInteger atomicInteger) {
            this.f5689a = bs5Var;
            this.f5690b = atomicBoolean;
            this.f5691c = jVar;
            this.f5692d = atomicInteger;
        }

        @Override // p014rx.C1098b.j
        public void onCompleted() {
            if (this.f5692d.decrementAndGet() == 0 && this.f5690b.compareAndSet(false, true)) {
                this.f5691c.onCompleted();
            }
        }

        @Override // p014rx.C1098b.j
        public void onError(Throwable th) {
            this.f5689a.unsubscribe();
            if (this.f5690b.compareAndSet(false, true)) {
                this.f5691c.onError(th);
            } else {
                ejd0.m3864j(th);
            }
        }

        @Override // p014rx.C1098b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f5689a.m3164a(c4g0Var);
        }
    }

    public mn5(Iterable<? extends C1098b> iterable) {
        this.f5688a = iterable;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(C1098b.j jVar) {
        bs5 bs5Var = new bs5();
        jVar.onSubscribe(bs5Var);
        try {
            Iterator<? extends C1098b> it = this.f5688a.iterator();
            if (it == null) {
                jVar.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!bs5Var.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            jVar.onCompleted();
                            return;
                        }
                        return;
                    }
                    if (bs5Var.isUnsubscribed()) {
                        return;
                    }
                    try {
                        C1098b next = it.next();
                        if (bs5Var.isUnsubscribed()) {
                            return;
                        }
                        if (next == null) {
                            bs5Var.unsubscribe();
                            Throwable nullPointerException = new NullPointerException("A completable source is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                jVar.onError(nullPointerException);
                                return;
                            } else {
                                ejd0.m3864j(nullPointerException);
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.m9772n(new C0430a(bs5Var, atomicBoolean, jVar, atomicInteger));
                    } catch (Throwable th) {
                        bs5Var.unsubscribe();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            jVar.onError(th);
                            return;
                        } else {
                            ejd0.m3864j(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    bs5Var.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        jVar.onError(th2);
                        return;
                    } else {
                        ejd0.m3864j(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            jVar.onError(th3);
        }
    }
}
