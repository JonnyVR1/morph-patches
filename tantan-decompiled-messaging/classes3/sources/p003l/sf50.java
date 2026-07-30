package p003l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.ExceptionsUtils;
import p014rx.internal.util.ScalarSynchronousObservable;
import p014rx.internal.util.unsafe.SpscArrayQueue;
import p014rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class sf50<T, R> implements C1099c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f7225a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends C1099c<? extends R>> f7226b;

    /* JADX INFO: renamed from: c */
    public final int f7227c;

    /* JADX INFO: renamed from: d */
    public final int f7228d;

    /* JADX INFO: renamed from: l.sf50$a */
    public class C0529a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0532d f7229a;

        public C0529a(C0532d c0532d) {
            this.f7229a = c0532d;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f7229a.m7576m(j);
        }
    }

    /* JADX INFO: renamed from: l.sf50$b */
    public static final class C0530b<T, R> implements rc90 {

        /* JADX INFO: renamed from: a */
        public final R f7231a;

        /* JADX INFO: renamed from: b */
        public final C0532d<T, R> f7232b;

        /* JADX INFO: renamed from: c */
        public boolean f7233c;

        public C0530b(R r, C0532d<T, R> c0532d) {
            this.f7231a = r;
            this.f7232b = c0532d;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (this.f7233c || j <= 0) {
                return;
            }
            this.f7233c = true;
            C0532d<T, R> c0532d = this.f7232b;
            c0532d.m7574k(this.f7231a);
            c0532d.m7572i(1L);
        }
    }

    /* JADX INFO: renamed from: l.sf50$c */
    public static final class C0531c<T, R> extends z3g0<R> {

        /* JADX INFO: renamed from: e */
        public final C0532d<T, R> f7234e;

        /* JADX INFO: renamed from: f */
        public long f7235f;

        public C0531c(C0532d<T, R> c0532d) {
            this.f7234e = c0532d;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f7234e.f7239h.m7738c(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f7234e.m7572i(this.f7235f);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7234e.m7573j(th, this.f7235f);
        }

        @Override // p003l.m250
        public void onNext(R r) {
            this.f7235f++;
            this.f7234e.m7574k(r);
        }
    }

    /* JADX INFO: renamed from: l.sf50$d */
    public static final class C0532d<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f7236e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends C1099c<? extends R>> f7237f;

        /* JADX INFO: renamed from: g */
        public final int f7238g;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f7240i;

        /* JADX INFO: renamed from: l */
        public final rie0 f7243l;

        /* JADX INFO: renamed from: m */
        public volatile boolean f7244m;

        /* JADX INFO: renamed from: n */
        public volatile boolean f7245n;

        /* JADX INFO: renamed from: h */
        public final tc90 f7239h = new tc90();

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f7241j = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<Throwable> f7242k = new AtomicReference<>();

        public C0532d(z3g0<? super R> z3g0Var, w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i, int i2) {
            this.f7236e = z3g0Var;
            this.f7237f = w9jVar;
            this.f7238g = i2;
            this.f7240i = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
            this.f7243l = new rie0();
            m9242e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m7570g() {
            if (this.f7241j.getAndIncrement() != 0) {
                return;
            }
            int i = this.f7238g;
            while (!this.f7236e.isUnsubscribed()) {
                if (!this.f7245n) {
                    if (i == 1 && this.f7242k.get() != null) {
                        Throwable thTerminate = ExceptionsUtils.terminate(this.f7242k);
                        if (ExceptionsUtils.isTerminated(thTerminate)) {
                            return;
                        }
                        this.f7236e.onError(thTerminate);
                        return;
                    }
                    boolean z = this.f7244m;
                    Object objPoll = this.f7240i.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable thTerminate2 = ExceptionsUtils.terminate(this.f7242k);
                        if (thTerminate2 == null) {
                            this.f7236e.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(thTerminate2)) {
                                return;
                            }
                            this.f7236e.onError(thTerminate2);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            C1099c<? extends R> c1099cCall = this.f7237f.call((Object) NotificationLite.m9792f().m9797e(objPoll));
                            if (c1099cCall == null) {
                                m7571h(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (c1099cCall != C1099c.empty()) {
                                if (c1099cCall instanceof ScalarSynchronousObservable) {
                                    this.f7245n = true;
                                    this.f7239h.m7738c(new C0530b(((ScalarSynchronousObservable) c1099cCall).m9935c(), this));
                                } else {
                                    C0531c c0531c = new C0531c(this);
                                    this.f7243l.m7260b(c0531c);
                                    if (c0531c.isUnsubscribed()) {
                                        return;
                                    }
                                    this.f7245n = true;
                                    c1099cCall.unsafeSubscribe(c0531c);
                                }
                                m9242e(1L);
                            } else {
                                m9242e(1L);
                            }
                        } catch (Throwable th) {
                            f5f.m3964e(th);
                            m7571h(th);
                            return;
                        }
                    }
                }
                if (this.f7241j.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m7571h(Throwable th) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.f7242k, th)) {
                m7575l(th);
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f7242k);
            if (ExceptionsUtils.isTerminated(thTerminate)) {
                return;
            }
            this.f7236e.onError(thTerminate);
        }

        /* JADX INFO: renamed from: i */
        public void m7572i(long j) {
            if (j != 0) {
                this.f7239h.m7737b(j);
            }
            this.f7245n = false;
            m7570g();
        }

        /* JADX INFO: renamed from: j */
        public void m7573j(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.f7242k, th)) {
                m7575l(th);
                return;
            }
            if (this.f7238g == 0) {
                Throwable thTerminate = ExceptionsUtils.terminate(this.f7242k);
                if (!ExceptionsUtils.isTerminated(thTerminate)) {
                    this.f7236e.onError(thTerminate);
                }
                unsubscribe();
                return;
            }
            if (j != 0) {
                this.f7239h.m7737b(j);
            }
            this.f7245n = false;
            m7570g();
        }

        /* JADX INFO: renamed from: k */
        public void m7574k(R r) {
            this.f7236e.onNext(r);
        }

        /* JADX INFO: renamed from: l */
        public void m7575l(Throwable th) {
            ejd0.m3864j(th);
        }

        /* JADX INFO: renamed from: m */
        public void m7576m(long j) {
            if (j > 0) {
                this.f7239h.request(j);
            } else {
                if (j >= 0) {
                    return;
                }
                y3g0.m8887a("n >= 0 required but it was ", j);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f7244m = true;
            m7570g();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f7242k, th)) {
                m7575l(th);
                return;
            }
            this.f7244m = true;
            if (this.f7238g != 0) {
                m7570g();
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f7242k);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.f7236e.onError(thTerminate);
            }
            this.f7243l.unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f7240i.offer(NotificationLite.m9792f().m9801j(t))) {
                m7570g();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    public sf50(C1099c<? extends T> c1099c, w9j<? super T, ? extends C1099c<? extends R>> w9jVar, int i, int i2) {
        this.f7225a = c1099c;
        this.f7226b = w9jVar;
        this.f7227c = i;
        this.f7228d = i2;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C0532d c0532d = new C0532d(this.f7228d == 0 ? new vie0<>(z3g0Var) : z3g0Var, this.f7226b, this.f7227c, this.f7228d);
        z3g0Var.m9240b(c0532d);
        z3g0Var.m9240b(c0532d.f7243l);
        z3g0Var.mo3257f(new C0529a(c0532d));
        if (z3g0Var.isUnsubscribed()) {
            return;
        }
        this.f7225a.unsafeSubscribe(c0532d);
    }
}
