package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p003l.aaj;
import p003l.baj;
import p003l.bs5;
import p003l.caj;
import p003l.daj;
import p003l.eaj;
import p003l.f5f;
import p003l.faj;
import p003l.kaj;
import p003l.kc2;
import p003l.m250;
import p003l.rc90;
import p003l.rjd0;
import p003l.x9j;
import p003l.y9j;
import p003l.z3g0;
import p003l.z9j;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OperatorZip<R> implements C1099c.c<R, C1099c<?>[]> {

    /* JADX INFO: renamed from: a */
    public final faj<? extends R> f10982a;

    public static final class Zip<R> extends AtomicLong {
        static final int THRESHOLD = (int) (((double) rjd0.f6938g) * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final m250<? super R> child;
        private final bs5 childSubscription;
        int emitted;
        private AtomicLong requested;
        private volatile Object[] subscribers;
        private final faj<? extends R> zipFunction;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$Zip$a */
        public final class C1142a extends z3g0 {

            /* JADX INFO: renamed from: e */
            public final rjd0 f10983e = rjd0.m7263a();

            public C1142a() {
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: d */
            public void mo2918d() {
                m9242e(rjd0.f6938g);
            }

            /* JADX INFO: renamed from: g */
            public void m9904g(long j) {
                m9242e(j);
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f10983e.m7268f();
                Zip.this.tick();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            @Override // p003l.m250
            public void onNext(Object obj) {
                try {
                    this.f10983e.m7269g(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                Zip.this.tick();
            }
        }

        public Zip(z3g0<? super R> z3g0Var, faj<? extends R> fajVar) {
            bs5 bs5Var = new bs5();
            this.childSubscription = bs5Var;
            this.child = z3g0Var;
            this.zipFunction = fajVar;
            z3g0Var.m9240b(bs5Var);
        }

        public void start(C1099c[] c1099cArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[c1099cArr.length];
            for (int i = 0; i < c1099cArr.length; i++) {
                C1142a c1142a = new C1142a();
                objArr[i] = c1142a;
                this.childSubscription.m3164a(c1142a);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i2 = 0; i2 < c1099cArr.length; i2++) {
                c1099cArr[i2].unsafeSubscribe((C1142a) objArr[i2]);
            }
        }

        public void tick() {
            Object[] objArr = this.subscribers;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            m250<? super R> m250Var = this.child;
            AtomicLong atomicLong = this.requested;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i = 0; i < length; i++) {
                    rjd0 rjd0Var = ((C1142a) objArr[i]).f10983e;
                    Object objM7270h = rjd0Var.m7270h();
                    if (objM7270h == null) {
                        z = false;
                    } else {
                        if (rjd0Var.m7266d(objM7270h)) {
                            m250Var.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        }
                        objArr2[i] = rjd0Var.m7265c(objM7270h);
                    }
                }
                if (atomicLong.get() > 0 && z) {
                    try {
                        m250Var.onNext(this.zipFunction.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.emitted++;
                        for (Object obj : objArr) {
                            rjd0 rjd0Var2 = ((C1142a) obj).f10983e;
                            rjd0Var2.m7271i();
                            if (rjd0Var2.m7266d(rjd0Var2.m7270h())) {
                                m250Var.onCompleted();
                                this.childSubscription.unsubscribe();
                                return;
                            }
                        }
                        if (this.emitted > THRESHOLD) {
                            for (Object obj2 : objArr) {
                                ((C1142a) obj2).m9904g(this.emitted);
                            }
                            this.emitted = 0;
                        }
                    } catch (Throwable th) {
                        f5f.m3966g(th, m250Var, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    public static final class ZipProducer<R> extends AtomicLong implements rc90 {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        @Override // p003l.rc90
        public void request(long j) {
            kc2.m5640b(this, j);
            this.zipper.tick();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$a */
    public final class C1143a extends z3g0<C1099c[]> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f10985e;

        /* JADX INFO: renamed from: f */
        public final Zip<R> f10986f;

        /* JADX INFO: renamed from: g */
        public final ZipProducer<R> f10987g;

        /* JADX INFO: renamed from: h */
        public boolean f10988h;

        public C1143a(z3g0<? super R> z3g0Var, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.f10985e = z3g0Var;
            this.f10986f = zip;
            this.f10987g = zipProducer;
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C1099c[] c1099cArr) {
            if (c1099cArr == null || c1099cArr.length == 0) {
                this.f10985e.onCompleted();
            } else {
                this.f10988h = true;
                this.f10986f.start(c1099cArr, this.f10987g);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f10988h) {
                return;
            }
            this.f10985e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10985e.onError(th);
        }
    }

    public OperatorZip(x9j x9jVar) {
        this.f10982a = kaj.m5631a(x9jVar);
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C1099c[]> call(z3g0<? super R> z3g0Var) {
        Zip zip = new Zip(z3g0Var, this.f10982a);
        ZipProducer zipProducer = new ZipProducer(zip);
        C1143a c1143a = new C1143a(z3g0Var, zip, zipProducer);
        z3g0Var.m9240b(c1143a);
        z3g0Var.mo3257f(zipProducer);
        return c1143a;
    }

    public OperatorZip(faj<? extends R> fajVar) {
        this.f10982a = fajVar;
    }

    public OperatorZip(y9j y9jVar) {
        this.f10982a = kaj.m5632b(y9jVar);
    }

    public OperatorZip(z9j z9jVar) {
        this.f10982a = kaj.m5633c(z9jVar);
    }

    public OperatorZip(aaj aajVar) {
        this.f10982a = kaj.m5634d(aajVar);
    }

    public OperatorZip(baj bajVar) {
        this.f10982a = kaj.m5635e(bajVar);
    }

    public OperatorZip(caj cajVar) {
        this.f10982a = kaj.m5636f(cajVar);
    }

    public OperatorZip(daj dajVar) {
        this.f10982a = kaj.m5637g(dajVar);
    }

    public OperatorZip(eaj eajVar) {
        this.f10982a = kaj.m5638h(eajVar);
    }
}
