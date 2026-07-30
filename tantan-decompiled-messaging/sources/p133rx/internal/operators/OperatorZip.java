package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p149l.aaj;
import p149l.baj;
import p149l.bs5;
import p149l.caj;
import p149l.daj;
import p149l.eaj;
import p149l.f5f;
import p149l.faj;
import p149l.kaj;
import p149l.kc2;
import p149l.m250;
import p149l.rc90;
import p149l.rjd0;
import p149l.x9j;
import p149l.y9j;
import p149l.z3g0;
import p149l.z9j;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorZip<R> implements C22306c.c<R, C22306c<?>[]> {

    /* JADX INFO: renamed from: a */
    public final faj<? extends R> f207357a;

    public static final class Zip<R> extends AtomicLong {
        static final int THRESHOLD = (int) (((double) rjd0.f159670g) * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final m250<? super R> child;
        private final bs5 childSubscription;
        int emitted;
        private AtomicLong requested;
        private volatile Object[] subscribers;
        private final faj<? extends R> zipFunction;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$Zip$a */
        public final class C22349a extends z3g0 {

            /* JADX INFO: renamed from: e */
            public final rjd0 f207358e = rjd0.m179580a();

            public C22349a() {
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: d */
            public void mo99382d() {
                m217048e(rjd0.f159670g);
            }

            /* JADX INFO: renamed from: g */
            public void m221447g(long j) {
                m217048e(j);
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f207358e.m179585f();
                Zip.this.tick();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            @Override // p149l.m250
            public void onNext(Object obj) {
                try {
                    this.f207358e.m179586g(obj);
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
            z3g0Var.m217046b(bs5Var);
        }

        public void start(C22306c[] c22306cArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[c22306cArr.length];
            for (int i = 0; i < c22306cArr.length; i++) {
                C22349a c22349a = new C22349a();
                objArr[i] = c22349a;
                this.childSubscription.m103655a(c22349a);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i2 = 0; i2 < c22306cArr.length; i2++) {
                c22306cArr[i2].unsafeSubscribe((C22349a) objArr[i2]);
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
                    rjd0 rjd0Var = ((C22349a) objArr[i]).f207358e;
                    Object objM179587h = rjd0Var.m179587h();
                    if (objM179587h == null) {
                        z = false;
                    } else {
                        if (rjd0Var.m179583d(objM179587h)) {
                            m250Var.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        }
                        objArr2[i] = rjd0Var.m179582c(objM179587h);
                    }
                }
                if (atomicLong.get() > 0 && z) {
                    try {
                        m250Var.onNext(this.zipFunction.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.emitted++;
                        for (Object obj : objArr) {
                            rjd0 rjd0Var2 = ((C22349a) obj).f207358e;
                            rjd0Var2.m179588i();
                            if (rjd0Var2.m179583d(rjd0Var2.m179587h())) {
                                m250Var.onCompleted();
                                this.childSubscription.unsubscribe();
                                return;
                            }
                        }
                        if (this.emitted > THRESHOLD) {
                            for (Object obj2 : objArr) {
                                ((C22349a) obj2).m221447g(this.emitted);
                            }
                            this.emitted = 0;
                        }
                    } catch (Throwable th) {
                        f5f.m119493g(th, m250Var, objArr2);
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

        @Override // p149l.rc90
        public void request(long j) {
            kc2.m145336b(this, j);
            this.zipper.tick();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$a */
    public final class C22350a extends z3g0<C22306c[]> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f207360e;

        /* JADX INFO: renamed from: f */
        public final Zip<R> f207361f;

        /* JADX INFO: renamed from: g */
        public final ZipProducer<R> f207362g;

        /* JADX INFO: renamed from: h */
        public boolean f207363h;

        public C22350a(z3g0<? super R> z3g0Var, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.f207360e = z3g0Var;
            this.f207361f = zip;
            this.f207362g = zipProducer;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C22306c[] c22306cArr) {
            if (c22306cArr == null || c22306cArr.length == 0) {
                this.f207360e.onCompleted();
            } else {
                this.f207363h = true;
                this.f207361f.start(c22306cArr, this.f207362g);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f207363h) {
                return;
            }
            this.f207360e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207360e.onError(th);
        }
    }

    public OperatorZip(x9j x9jVar) {
        this.f207357a = kaj.m145144a(x9jVar);
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super C22306c[]> call(z3g0<? super R> z3g0Var) {
        Zip zip = new Zip(z3g0Var, this.f207357a);
        ZipProducer zipProducer = new ZipProducer(zip);
        C22350a c22350a = new C22350a(z3g0Var, zip, zipProducer);
        z3g0Var.m217046b(c22350a);
        z3g0Var.mo106696f(zipProducer);
        return c22350a;
    }

    public OperatorZip(faj<? extends R> fajVar) {
        this.f207357a = fajVar;
    }

    public OperatorZip(y9j y9jVar) {
        this.f207357a = kaj.m145145b(y9jVar);
    }

    public OperatorZip(z9j z9jVar) {
        this.f207357a = kaj.m145146c(z9jVar);
    }

    public OperatorZip(aaj aajVar) {
        this.f207357a = kaj.m145147d(aajVar);
    }

    public OperatorZip(baj bajVar) {
        this.f207357a = kaj.m145148e(bajVar);
    }

    public OperatorZip(caj cajVar) {
        this.f207357a = kaj.m145149f(cajVar);
    }

    public OperatorZip(daj dajVar) {
        this.f207357a = kaj.m145150g(dajVar);
    }

    public OperatorZip(eaj eajVar) {
        this.f207357a = kaj.m145151h(eajVar);
    }
}
