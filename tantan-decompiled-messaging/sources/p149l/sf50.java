package p149l;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.ExceptionsUtils;
import p133rx.internal.util.ScalarSynchronousObservable;
import p133rx.internal.util.unsafe.SpscArrayQueue;
import p133rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class sf50<T, R> implements C22306c.a<R> {

    /* JADX INFO: renamed from: a */
    public final C22306c<? extends T> f164243a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super T, ? extends C22306c<? extends R>> f164244b;

    /* JADX INFO: renamed from: c */
    public final int f164245c;

    /* JADX INFO: renamed from: d */
    public final int f164246d;

    /* JADX INFO: renamed from: l.sf50$a */
    public class C19932a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C19935d f164247a;

        public C19932a(C19935d c19935d) {
            this.f164247a = c19935d;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f164247a.m183877m(j);
        }
    }

    /* JADX INFO: renamed from: l.sf50$b */
    public static final class C19933b<T, R> implements rc90 {

        /* JADX INFO: renamed from: a */
        public final R f164249a;

        /* JADX INFO: renamed from: b */
        public final C19935d<T, R> f164250b;

        /* JADX INFO: renamed from: c */
        public boolean f164251c;

        public C19933b(R r, C19935d<T, R> c19935d) {
            this.f164249a = r;
            this.f164250b = c19935d;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (this.f164251c || j <= 0) {
                return;
            }
            this.f164251c = true;
            C19935d<T, R> c19935d = this.f164250b;
            c19935d.m183875k(this.f164249a);
            c19935d.m183873i(1L);
        }
    }

    /* JADX INFO: renamed from: l.sf50$c */
    public static final class C19934c<T, R> extends z3g0<R> {

        /* JADX INFO: renamed from: e */
        public final C19935d<T, R> f164252e;

        /* JADX INFO: renamed from: f */
        public long f164253f;

        public C19934c(C19935d<T, R> c19935d) {
            this.f164252e = c19935d;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f164252e.f164257h.m187981c(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f164252e.m183873i(this.f164253f);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f164252e.m183874j(th, this.f164253f);
        }

        @Override // p149l.m250
        public void onNext(R r) {
            this.f164253f++;
            this.f164252e.m183875k(r);
        }
    }

    /* JADX INFO: renamed from: l.sf50$d */
    public static final class C19935d<T, R> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super R> f164254e;

        /* JADX INFO: renamed from: f */
        public final w9j<? super T, ? extends C22306c<? extends R>> f164255f;

        /* JADX INFO: renamed from: g */
        public final int f164256g;

        /* JADX INFO: renamed from: i */
        public final Queue<Object> f164258i;

        /* JADX INFO: renamed from: l */
        public final rie0 f164261l;

        /* JADX INFO: renamed from: m */
        public volatile boolean f164262m;

        /* JADX INFO: renamed from: n */
        public volatile boolean f164263n;

        /* JADX INFO: renamed from: h */
        public final tc90 f164257h = new tc90();

        /* JADX INFO: renamed from: j */
        public final AtomicInteger f164259j = new AtomicInteger();

        /* JADX INFO: renamed from: k */
        public final AtomicReference<Throwable> f164260k = new AtomicReference<>();

        public C19935d(z3g0<? super R> z3g0Var, w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i, int i2) {
            this.f164254e = z3g0Var;
            this.f164255f = w9jVar;
            this.f164256g = i2;
            this.f164258i = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new frf0<>(i);
            this.f164261l = new rie0();
            m217048e(i);
        }

        /* JADX INFO: renamed from: g */
        public void m183871g() {
            if (this.f164259j.getAndIncrement() != 0) {
                return;
            }
            int i = this.f164256g;
            while (!this.f164254e.isUnsubscribed()) {
                if (!this.f164263n) {
                    if (i == 1 && this.f164260k.get() != null) {
                        Throwable thTerminate = ExceptionsUtils.terminate(this.f164260k);
                        if (ExceptionsUtils.isTerminated(thTerminate)) {
                            return;
                        }
                        this.f164254e.onError(thTerminate);
                        return;
                    }
                    boolean z = this.f164262m;
                    Object objPoll = this.f164258i.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable thTerminate2 = ExceptionsUtils.terminate(this.f164260k);
                        if (thTerminate2 == null) {
                            this.f164254e.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(thTerminate2)) {
                                return;
                            }
                            this.f164254e.onError(thTerminate2);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            C22306c<? extends R> c22306cCall = this.f164255f.call((Object) NotificationLite.m221335f().m221340e(objPoll));
                            if (c22306cCall == null) {
                                m183872h(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (c22306cCall != C22306c.empty()) {
                                if (c22306cCall instanceof ScalarSynchronousObservable) {
                                    this.f164263n = true;
                                    this.f164257h.m187981c(new C19933b(((ScalarSynchronousObservable) c22306cCall).m221478c(), this));
                                } else {
                                    C19934c c19934c = new C19934c(this);
                                    this.f164261l.m179504b(c19934c);
                                    if (c19934c.isUnsubscribed()) {
                                        return;
                                    }
                                    this.f164263n = true;
                                    c22306cCall.unsafeSubscribe(c19934c);
                                }
                                m217048e(1L);
                            } else {
                                m217048e(1L);
                            }
                        } catch (Throwable th) {
                            f5f.m119491e(th);
                            m183872h(th);
                            return;
                        }
                    }
                }
                if (this.f164259j.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m183872h(Throwable th) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.f164260k, th)) {
                m183876l(th);
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f164260k);
            if (ExceptionsUtils.isTerminated(thTerminate)) {
                return;
            }
            this.f164254e.onError(thTerminate);
        }

        /* JADX INFO: renamed from: i */
        public void m183873i(long j) {
            if (j != 0) {
                this.f164257h.m187980b(j);
            }
            this.f164263n = false;
            m183871g();
        }

        /* JADX INFO: renamed from: j */
        public void m183874j(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.f164260k, th)) {
                m183876l(th);
                return;
            }
            if (this.f164256g == 0) {
                Throwable thTerminate = ExceptionsUtils.terminate(this.f164260k);
                if (!ExceptionsUtils.isTerminated(thTerminate)) {
                    this.f164254e.onError(thTerminate);
                }
                unsubscribe();
                return;
            }
            if (j != 0) {
                this.f164257h.m187980b(j);
            }
            this.f164263n = false;
            m183871g();
        }

        /* JADX INFO: renamed from: k */
        public void m183875k(R r) {
            this.f164254e.onNext(r);
        }

        /* JADX INFO: renamed from: l */
        public void m183876l(Throwable th) {
            ejd0.m116793j(th);
        }

        /* JADX INFO: renamed from: m */
        public void m183877m(long j) {
            if (j > 0) {
                this.f164257h.request(j);
            } else {
                if (j >= 0) {
                    return;
                }
                y3g0.m212802a("n >= 0 required but it was ", j);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f164262m = true;
            m183871g();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.f164260k, th)) {
                m183876l(th);
                return;
            }
            this.f164262m = true;
            if (this.f164256g != 0) {
                m183871g();
                return;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.f164260k);
            if (!ExceptionsUtils.isTerminated(thTerminate)) {
                this.f164254e.onError(thTerminate);
            }
            this.f164261l.unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f164258i.offer(NotificationLite.m221335f().m221344j(t))) {
                m183871g();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }
    }

    public sf50(C22306c<? extends T> c22306c, w9j<? super T, ? extends C22306c<? extends R>> w9jVar, int i, int i2) {
        this.f164243a = c22306c;
        this.f164244b = w9jVar;
        this.f164245c = i;
        this.f164246d = i2;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super R> z3g0Var) {
        C19935d c19935d = new C19935d(this.f164246d == 0 ? new vie0<>(z3g0Var) : z3g0Var, this.f164244b, this.f164245c, this.f164246d);
        z3g0Var.m217046b(c19935d);
        z3g0Var.m217046b(c19935d.f164261l);
        z3g0Var.mo106696f(new C19932a(c19935d));
        if (z3g0Var.isUnsubscribed()) {
            return;
        }
        this.f164243a.unsafeSubscribe(c19935d);
    }
}
