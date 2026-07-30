package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p153l.bb50;
import p153l.edj;
import p153l.ft5;
import p153l.gcg0;
import p153l.j6f;
import p153l.rc2;
import p153l.rcj;
import p153l.scj;
import p153l.tcj;
import p153l.ucj;
import p153l.urd0;
import p153l.vcj;
import p153l.vk90;
import p153l.wcj;
import p153l.xcj;
import p153l.ycj;
import p153l.zcj;

/* JADX INFO: loaded from: classes3.dex */
public final class OperatorZip<R> implements C22421c.c<R, C22421c<?>[]> {

    /* JADX INFO: renamed from: a */
    public final zcj<? extends R> f208279a;

    public static final class Zip<R> extends AtomicLong {
        static final int THRESHOLD = (int) (((double) urd0.f180601g) * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final bb50<? super R> child;
        private final ft5 childSubscription;
        int emitted;
        private AtomicLong requested;
        private volatile Object[] subscribers;
        private final zcj<? extends R> zipFunction;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$Zip$a */
        public final class C22464a extends gcg0 {

            /* JADX INFO: renamed from: e */
            public final urd0 f208280e = urd0.m197504a();

            public C22464a() {
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: d */
            public void mo95884d() {
                m129868e(urd0.f180601g);
            }

            /* JADX INFO: renamed from: g */
            public void m222693g(long j) {
                m129868e(j);
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f208280e.m197509f();
                Zip.this.tick();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(Object obj) {
                try {
                    this.f208280e.m197510g(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                Zip.this.tick();
            }
        }

        public Zip(gcg0<? super R> gcg0Var, zcj<? extends R> zcjVar) {
            ft5 ft5Var = new ft5();
            this.childSubscription = ft5Var;
            this.child = gcg0Var;
            this.zipFunction = zcjVar;
            gcg0Var.m129866b(ft5Var);
        }

        public void start(C22421c[] c22421cArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[c22421cArr.length];
            for (int i = 0; i < c22421cArr.length; i++) {
                C22464a c22464a = new C22464a();
                objArr[i] = c22464a;
                this.childSubscription.m127297a(c22464a);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i2 = 0; i2 < c22421cArr.length; i2++) {
                c22421cArr[i2].unsafeSubscribe((C22464a) objArr[i2]);
            }
        }

        public void tick() {
            Object[] objArr = this.subscribers;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            bb50<? super R> bb50Var = this.child;
            AtomicLong atomicLong = this.requested;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i = 0; i < length; i++) {
                    urd0 urd0Var = ((C22464a) objArr[i]).f208280e;
                    Object objM197511h = urd0Var.m197511h();
                    if (objM197511h == null) {
                        z = false;
                    } else {
                        if (urd0Var.m197507d(objM197511h)) {
                            bb50Var.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        }
                        objArr2[i] = urd0Var.m197506c(objM197511h);
                    }
                }
                if (atomicLong.get() > 0 && z) {
                    try {
                        bb50Var.onNext(this.zipFunction.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.emitted++;
                        for (Object obj : objArr) {
                            urd0 urd0Var2 = ((C22464a) obj).f208280e;
                            urd0Var2.m197512i();
                            if (urd0Var2.m197507d(urd0Var2.m197511h())) {
                                bb50Var.onCompleted();
                                this.childSubscription.unsubscribe();
                                return;
                            }
                        }
                        if (this.emitted > THRESHOLD) {
                            for (Object obj2 : objArr) {
                                ((C22464a) obj2).m222693g(this.emitted);
                            }
                            this.emitted = 0;
                        }
                    } catch (Throwable th) {
                        j6f.m143665g(th, bb50Var, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    public static final class ZipProducer<R> extends AtomicLong implements vk90 {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        @Override // p153l.vk90
        public void request(long j) {
            rc2.m180770b(this, j);
            this.zipper.tick();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$a */
    public final class C22465a extends gcg0<C22421c[]> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f208282e;

        /* JADX INFO: renamed from: f */
        public final Zip<R> f208283f;

        /* JADX INFO: renamed from: g */
        public final ZipProducer<R> f208284g;

        /* JADX INFO: renamed from: h */
        public boolean f208285h;

        public C22465a(gcg0<? super R> gcg0Var, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.f208282e = gcg0Var;
            this.f208283f = zip;
            this.f208284g = zipProducer;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(C22421c[] c22421cArr) {
            if (c22421cArr == null || c22421cArr.length == 0) {
                this.f208282e.onCompleted();
            } else {
                this.f208285h = true;
                this.f208283f.start(c22421cArr, this.f208284g);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f208285h) {
                return;
            }
            this.f208282e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208282e.onError(th);
        }
    }

    public OperatorZip(rcj rcjVar) {
        this.f208279a = edj.m120459a(rcjVar);
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super C22421c[]> call(gcg0<? super R> gcg0Var) {
        Zip zip = new Zip(gcg0Var, this.f208279a);
        ZipProducer zipProducer = new ZipProducer(zip);
        C22465a c22465a = new C22465a(gcg0Var, zip, zipProducer);
        gcg0Var.m129866b(c22465a);
        gcg0Var.mo95773f(zipProducer);
        return c22465a;
    }

    public OperatorZip(zcj<? extends R> zcjVar) {
        this.f208279a = zcjVar;
    }

    public OperatorZip(scj scjVar) {
        this.f208279a = edj.m120460b(scjVar);
    }

    public OperatorZip(tcj tcjVar) {
        this.f208279a = edj.m120461c(tcjVar);
    }

    public OperatorZip(ucj ucjVar) {
        this.f208279a = edj.m120462d(ucjVar);
    }

    public OperatorZip(vcj vcjVar) {
        this.f208279a = edj.m120463e(vcjVar);
    }

    public OperatorZip(wcj wcjVar) {
        this.f208279a = edj.m120464f(wcjVar);
    }

    public OperatorZip(xcj xcjVar) {
        this.f208279a = edj.m120465g(xcjVar);
    }

    public OperatorZip(ycj ycjVar) {
        this.f208279a = edj.m120466h(ycjVar);
    }
}
