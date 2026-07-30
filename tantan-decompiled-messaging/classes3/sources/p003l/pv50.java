package p003l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import l.jfd0;
import p014rx.C1097a;
import p014rx.C1099c;
import p014rx.exceptions.MissingBackpressureException;
import p014rx.internal.operators.NotificationLite;
import p014rx.internal.util.BackpressureDrainManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final Long f6521a;

    /* JADX INFO: renamed from: b */
    public final d30 f6522b;

    /* JADX INFO: renamed from: c */
    public final C1097a.d f6523c;

    /* JADX INFO: renamed from: l.pv50$a */
    public static final class C0479a<T> extends z3g0<T> implements BackpressureDrainManager.InterfaceC1150a {

        /* JADX INFO: renamed from: f */
        public final AtomicLong f6525f;

        /* JADX INFO: renamed from: g */
        public final z3g0<? super T> f6526g;

        /* JADX INFO: renamed from: i */
        public final BackpressureDrainManager f6528i;

        /* JADX INFO: renamed from: k */
        public final d30 f6530k;

        /* JADX INFO: renamed from: l */
        public final C1097a.d f6531l;

        /* JADX INFO: renamed from: e */
        public final ConcurrentLinkedQueue<Object> f6524e = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: h */
        public final AtomicBoolean f6527h = new AtomicBoolean(false);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f6529j = NotificationLite.m9792f();

        public C0479a(z3g0<? super T> z3g0Var, Long l2, d30 d30Var, C1097a.d dVar) {
            this.f6526g = z3g0Var;
            this.f6525f = l2 != null ? new AtomicLong(l2.longValue()) : null;
            this.f6530k = d30Var;
            this.f6528i = new BackpressureDrainManager(this);
            this.f6531l = dVar;
        }

        @Override // p014rx.internal.util.BackpressureDrainManager.InterfaceC1150a
        /* JADX INFO: renamed from: a */
        public void mo6925a(Throwable th) {
            z3g0<? super T> z3g0Var = this.f6526g;
            if (th != null) {
                z3g0Var.onError(th);
            } else {
                z3g0Var.onCompleted();
            }
        }

        @Override // p014rx.internal.util.BackpressureDrainManager.InterfaceC1150a
        public boolean accept(Object obj) {
            return this.f6529j.m9793a(this.f6526g, obj);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo2918d() {
            m9242e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m6926g() throws Throwable {
            long j;
            boolean z;
            if (this.f6525f == null) {
                return true;
            }
            do {
                j = this.f6525f.get();
                if (j <= 0) {
                    try {
                        z = this.f6531l.mo9758a() && poll() != null;
                    } catch (MissingBackpressureException e) {
                        if (this.f6527h.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f6526g.onError(e);
                        }
                    }
                    d30 d30Var = this.f6530k;
                    if (d30Var != null) {
                        try {
                            d30Var.call();
                        } catch (Throwable th) {
                            f5f.m3964e(th);
                            this.f6528i.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.f6525f.compareAndSet(j, j - 1));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public rc90 m6927h() {
            return this.f6528i;
        }

        @Override // p003l.m250
        public void onCompleted() throws Throwable {
            if (this.f6527h.get()) {
                return;
            }
            this.f6528i.terminateAndDrain();
        }

        @Override // p003l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f6527h.get()) {
                return;
            }
            this.f6528i.terminateAndDrain(th);
        }

        @Override // p003l.m250
        public void onNext(T t) throws Throwable {
            if (m6926g()) {
                this.f6524e.offer(this.f6529j.m9801j(t));
                this.f6528i.drain();
            }
        }

        @Override // p014rx.internal.util.BackpressureDrainManager.InterfaceC1150a
        public Object peek() {
            return this.f6524e.peek();
        }

        @Override // p014rx.internal.util.BackpressureDrainManager.InterfaceC1150a
        public Object poll() {
            Object objPoll = this.f6524e.poll();
            AtomicLong atomicLong = this.f6525f;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    /* JADX INFO: renamed from: l.pv50$b */
    public static final class C0480b {
        static final pv50<?> INSTANCE = new pv50<>();
    }

    public pv50(long j, d30 d30Var, C1097a.d dVar) {
        if (j <= 0) {
            ig3.a("Buffer capacity must be > 0");
            throw null;
        }
        if (dVar == null) {
            jfd0.a("The BackpressureOverflow strategy must not be null");
            throw null;
        }
        this.f6521a = Long.valueOf(j);
        this.f6522b = d30Var;
        this.f6523c = dVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> pv50<T> m6923b() {
        return (pv50<T>) C0480b.INSTANCE;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0479a c0479a = new C0479a(z3g0Var, this.f6521a, this.f6522b, this.f6523c);
        z3g0Var.m9240b(c0479a);
        z3g0Var.mo3257f(c0479a.m6927h());
        return c0479a;
    }

    public pv50(long j) {
        this(j, null, C1097a.f10723b);
    }

    public pv50(long j, d30 d30Var) {
        this(j, d30Var, C1097a.f10723b);
    }

    public pv50() {
        this.f6521a = null;
        this.f6522b = null;
        this.f6523c = C1097a.f10723b;
    }
}
