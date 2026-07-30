package p149l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22305b;

/* JADX INFO: loaded from: classes3.dex */
public final class mn5 implements C22305b.h {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C22305b> f134734a;

    /* JADX INFO: renamed from: l.mn5$a */
    public class C18506a implements C22305b.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bs5 f134735a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f134736b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C22305b.j f134737c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicInteger f134738d;

        public C18506a(bs5 bs5Var, AtomicBoolean atomicBoolean, C22305b.j jVar, AtomicInteger atomicInteger) {
            this.f134735a = bs5Var;
            this.f134736b = atomicBoolean;
            this.f134737c = jVar;
            this.f134738d = atomicInteger;
        }

        @Override // p133rx.C22305b.j
        public void onCompleted() {
            if (this.f134738d.decrementAndGet() == 0 && this.f134736b.compareAndSet(false, true)) {
                this.f134737c.onCompleted();
            }
        }

        @Override // p133rx.C22305b.j
        public void onError(Throwable th) {
            this.f134735a.unsubscribe();
            if (this.f134736b.compareAndSet(false, true)) {
                this.f134737c.onError(th);
            } else {
                ejd0.m116793j(th);
            }
        }

        @Override // p133rx.C22305b.j
        public void onSubscribe(c4g0 c4g0Var) {
            this.f134735a.m103655a(c4g0Var);
        }
    }

    public mn5(Iterable<? extends C22305b> iterable) {
        this.f134734a = iterable;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(C22305b.j jVar) {
        bs5 bs5Var = new bs5();
        jVar.onSubscribe(bs5Var);
        try {
            Iterator<? extends C22305b> it = this.f134734a.iterator();
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
                        C22305b next = it.next();
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
                                ejd0.m116793j(nullPointerException);
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.m221315n(new C18506a(bs5Var, atomicBoolean, jVar, atomicInteger));
                    } catch (Throwable th) {
                        bs5Var.unsubscribe();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            jVar.onError(th);
                            return;
                        } else {
                            ejd0.m116793j(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    bs5Var.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        jVar.onError(th2);
                        return;
                    } else {
                        ejd0.m116793j(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            jVar.onError(th3);
        }
    }
}
