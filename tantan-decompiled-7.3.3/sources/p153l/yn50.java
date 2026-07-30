package p153l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.ExceptionsUtils;
import p137rx.internal.util.ScalarSynchronousObservable;
import p137rx.internal.util.unsafe.SpscArrayQueue;
import p137rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class yn50<T, R> implements C22421c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f200775a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super T, ? extends C22421c<? extends R>> f200776b;

    /* JADX INFO: renamed from: c */
    public final int f200777c;

    /* JADX INFO: renamed from: d */
    public final int f200778d;

    /* JADX INFO: renamed from: l.yn50$a */
    public class C21641a implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C21644d f200779a;

        public C21641a(C21644d c21644d) {
            this.f200779a = c21644d;
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f200779a.m216770m(j);
        }
    }

    /* JADX INFO: renamed from: l.yn50$b */
    public static final class C21642b<T, R> implements vk90 {

        /* JADX INFO: renamed from: a */
        public final R f200781a;

        /* JADX INFO: renamed from: b */
        public final C21644d<T, R> f200782b;

        /* JADX INFO: renamed from: c */
        public boolean f200783c;

        public C21642b(R r, C21644d<T, R> c21644d) {
            this.f200781a = r;
            this.f200782b = c21644d;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (this.f200783c || j <= 0) {
                return;
            }
            this.f200783c = true;
            C21644d<T, R> c21644d = this.f200782b;
            c21644d.m216768k(this.f200781a);
            c21644d.m216766i(1L);
        }
    }

    /* JADX INFO: renamed from: l.yn50$c */
    public static final class C21643c<T, R> extends gcg0<R> {

        /* JADX INFO: renamed from: e */
        public final C21644d<T, R> f200784e;

        /* JADX INFO: renamed from: f */
        public long f200785f;

        public C21643c(C21644d<T, R> c21644d) {
            this.f200784e = c21644d;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f200784e.f200789h.m211356c(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f200784e.m216766i(this.f200785f);
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f200784e.m216767j(th, this.f200785f);
        }

        @Override // p153l.bb50
        public void onNext(R r) {
            this.f200785f++;
            this.f200784e.m216768k(r);
        }
    }

    /* JADX INFO: renamed from: l.yn50$d */
    public static final class C21644d<T, R> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super R> f200786e;

        /* JADX INFO: renamed from: f */
        public final qcj<? super T, ? extends C22421c<? extends R>> f200787f;

        /* JADX INFO: renamed from: g */
        public final int f200788g;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f200790i;

        /* JADX INFO: renamed from: l */
        public final wqe0 f200793l;

        /* JADX INFO: renamed from: m */
        public volatile boolean f200794m;

        /* JADX INFO: renamed from: n */
        public volatile boolean f200795n;

        /* JADX INFO: renamed from: h */
        public final xk90 f200789h = new xk90();

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f200791j = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<Throwable> f200792k = new AtomicReference<>();

        public C21644d(gcg0<? super R> gcg0Var, qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i, int i2) {
            this.f200786e = gcg0Var;
            this.f200787f = qcjVar;
            this.f200788g = i2;
            this.f200790i = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new ozf0<>(i);
            this.f200793l = new wqe0();
            m129868e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m216764g() {
            if (this.f200791j.getAndIncrement() != 0) {
                return;
            }
            int i = this.f200788g;
            while (!this.f200786e.isUnsubscribed()) {
                if (!this.f200795n) {
                    if (i == 1 && this.f200792k.get() != null) {
                        Throwable thTerminate = ExceptionsUtils.terminate(this.f200792k);
                        if (ExceptionsUtils.isTerminated(thTerminate)) {
                            return;
                        }
                        this.f200786e.onError(thTerminate);
                        return;
                    }
                    boolean z = this.f200794m;
                    Object objPoll = this.f200790i.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable thTerminate2 = ExceptionsUtils.terminate(this.f200792k);
                        if (thTerminate2 == null) {
                            this.f200786e.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(thTerminate2)) {
                                return;
                            }
                            this.f200786e.onError(thTerminate2);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            C22421c<? extends R> c22421cCall = this.f200787f.call((Object) NotificationLite.m222581f().m222586e(objPoll));
                            if (c22421cCall == null) {
                                m216765h(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (c22421cCall != C22421c.empty()) {
                                if (c22421cCall instanceof ScalarSynchronousObservable) {
                                    this.f200795n = true;
                                    this.f200789h.m211356c(new C21642b(((ScalarSynchronousObservable) c22421cCall).m222724c(), this));
                                } else {
                                    C21643c c21643c = new C21643c(this);
                                    this.f200793l.m207511b(c21643c);
                                    if (c21643c.isUnsubscribed()) {
                                        return;
                                    }
                                    this.f200795n = true;
                                    c22421cCall.unsafeSubscribe(c21643c);
                                }
                                m129868e(1L);
                            } else {
                                m129868e(1L);
                            }
                        } catch (Throwable th) {
                            j6f.m143663e(th);
                            m216765h(th);
                            return;
                        }
                    }
                }
                if (this.f200791j.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m216765h(Throwable th) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.f200792k, th)) {
                m216769l(th);
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f200792k);
            if (ExceptionsUtils.isTerminated(thTerminate)) {
                return;
            }
            this.f200786e.onError(thTerminate);
        }

        /* JADX INFO: renamed from: i */
        public void m216766i(long j) {
            if (j != 0) {
                this.f200789h.m211355b(j);
            }
            this.f200795n = false;
            m216764g();
        }

        /* JADX INFO: renamed from: j */
        public void m216767j(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.f200792k, th)) {
                m216769l(th);
                return;
            }
            if (this.f200788g == 0) {
                Throwable thTerminate = ExceptionsUtils.terminate(this.f200792k);
                if (!ExceptionsUtils.isTerminated(thTerminate)) {
                    this.f200786e.onError(thTerminate);
                }
                unsubscribe();
                return;
            }
            if (j != 0) {
                this.f200789h.m211355b(j);
            }
            this.f200795n = false;
            m216764g();
        }

        /* JADX INFO: renamed from: k */
        public void m216768k(R r) {
            this.f200786e.onNext(r);
        }

        /* JADX INFO: renamed from: l */
        public void m216769l(Throwable th) {
            hrd0.m136792j(th);
        }

        /* JADX INFO: renamed from: m */
        public void m216770m(long j) {
            if (j > 0) {
                this.f200789h.request(j);
            } else {
                if (j >= 0) {
                    return;
                }
                fcg0.m125008a("n >= 0 required but it was ", j);
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f200794m = true;
            m216764g();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f200792k, th)) {
                m216769l(th);
                return;
            }
            this.f200794m = true;
            if (this.f200788g != 0) {
                m216764g();
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f200792k);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.f200786e.onError(thTerminate);
            }
            this.f200793l.unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f200790i.offer(NotificationLite.m222581f().m222590j(t))) {
                m216764g();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    public yn50(C22421c<? extends T> c22421c, qcj<? super T, ? extends C22421c<? extends R>> qcjVar, int i, int i2) {
        this.f200775a = c22421c;
        this.f200776b = qcjVar;
        this.f200777c = i;
        this.f200778d = i2;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super R> gcg0Var) {
        C21644d c21644d = new C21644d(this.f200778d == 0 ? new are0<>(gcg0Var) : gcg0Var, this.f200776b, this.f200777c, this.f200778d);
        gcg0Var.m129866b(c21644d);
        gcg0Var.m129866b(c21644d.f200793l);
        gcg0Var.mo95773f(new C21641a(c21644d));
        if (gcg0Var.isUnsubscribed()) {
            return;
        }
        this.f200775a.unsafeSubscribe(c21644d);
    }
}
