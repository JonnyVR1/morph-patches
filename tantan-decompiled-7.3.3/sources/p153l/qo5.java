package p153l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22420b;

/* JADX INFO: loaded from: classes3.dex */
public final class qo5 implements C22420b.h {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends C22420b> f158696a;

    /* JADX INFO: renamed from: l.qo5$a */
    public class C19612a implements C22420b.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ft5 f158697a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f158698b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C22420b.j f158699c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicInteger f158700d;

        public C19612a(ft5 ft5Var, AtomicBoolean atomicBoolean, C22420b.j jVar, AtomicInteger atomicInteger) {
            this.f158697a = ft5Var;
            this.f158698b = atomicBoolean;
            this.f158699c = jVar;
            this.f158700d = atomicInteger;
        }

        @Override // p137rx.C22420b.j
        public void onCompleted() {
            if (this.f158700d.decrementAndGet() == 0 && this.f158698b.compareAndSet(false, true)) {
                this.f158699c.onCompleted();
            }
        }

        @Override // p137rx.C22420b.j
        public void onError(Throwable th) {
            this.f158697a.unsubscribe();
            if (this.f158698b.compareAndSet(false, true)) {
                this.f158699c.onError(th);
            } else {
                hrd0.m136792j(th);
            }
        }

        @Override // p137rx.C22420b.j
        public void onSubscribe(kcg0 kcg0Var) {
            this.f158697a.m127297a(kcg0Var);
        }
    }

    public qo5(Iterable<? extends C22420b> iterable) {
        this.f158696a = iterable;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(C22420b.j jVar) {
        ft5 ft5Var = new ft5();
        jVar.onSubscribe(ft5Var);
        try {
            Iterator<? extends C22420b> it = this.f158696a.iterator();
            if (it == null) {
                jVar.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!ft5Var.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            jVar.onCompleted();
                            return;
                        }
                        return;
                    }
                    if (ft5Var.isUnsubscribed()) {
                        return;
                    }
                    try {
                        C22420b next = it.next();
                        if (ft5Var.isUnsubscribed()) {
                            return;
                        }
                        if (next == null) {
                            ft5Var.unsubscribe();
                            Throwable nullPointerException = new NullPointerException("A completable source is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                jVar.onError(nullPointerException);
                                return;
                            } else {
                                hrd0.m136792j(nullPointerException);
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.m222561n(new C19612a(ft5Var, atomicBoolean, jVar, atomicInteger));
                    } catch (Throwable th) {
                        ft5Var.unsubscribe();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            jVar.onError(th);
                            return;
                        } else {
                            hrd0.m136792j(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    ft5Var.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        jVar.onError(th2);
                        return;
                    } else {
                        hrd0.m136792j(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            jVar.onError(th3);
        }
    }
}
