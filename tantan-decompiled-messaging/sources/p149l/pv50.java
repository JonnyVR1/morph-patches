package p149l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22304a;
import p133rx.C22306c;
import p133rx.exceptions.MissingBackpressureException;
import p133rx.internal.operators.NotificationLite;
import p133rx.internal.util.BackpressureDrainManager;

/* JADX INFO: loaded from: classes3.dex */
public class pv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final Long f151406a;

    /* JADX INFO: renamed from: b */
    public final d30 f151407b;

    /* JADX INFO: renamed from: c */
    public final C22304a.d f151408c;

    /* JADX INFO: renamed from: l.pv50$a */
    public static final class C19341a<T> extends z3g0<T> implements BackpressureDrainManager.InterfaceC22357a {

        /* JADX INFO: renamed from: f */
        public final AtomicLong f151410f;

        /* JADX INFO: renamed from: g */
        public final z3g0<? super T> f151411g;

        /* JADX INFO: renamed from: i */
        public final BackpressureDrainManager f151413i;

        /* JADX INFO: renamed from: k */
        public final d30 f151415k;

        /* JADX INFO: renamed from: l */
        public final C22304a.d f151416l;

        /* JADX INFO: renamed from: e */
        public final ConcurrentLinkedQueue<Object> f151409e = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: h */
        public final AtomicBoolean f151412h = new AtomicBoolean(false);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f151414j = NotificationLite.m221335f();

        public C19341a(z3g0<? super T> z3g0Var, Long l2, d30 d30Var, C22304a.d dVar) {
            this.f151411g = z3g0Var;
            this.f151410f = l2 != null ? new AtomicLong(l2.longValue()) : null;
            this.f151415k = d30Var;
            this.f151413i = new BackpressureDrainManager(this);
            this.f151416l = dVar;
        }

        @Override // p133rx.internal.util.BackpressureDrainManager.InterfaceC22357a
        /* JADX INFO: renamed from: a */
        public void mo171541a(Throwable th) {
            z3g0<? super T> z3g0Var = this.f151411g;
            if (th != null) {
                z3g0Var.onError(th);
            } else {
                z3g0Var.onCompleted();
            }
        }

        @Override // p133rx.internal.util.BackpressureDrainManager.InterfaceC22357a
        public boolean accept(Object obj) {
            return this.f151414j.m221336a(this.f151411g, obj);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: d */
        public void mo99382d() {
            m217048e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m171542g() throws Throwable {
            long j;
            boolean z;
            if (this.f151410f == null) {
                return true;
            }
            do {
                j = this.f151410f.get();
                if (j <= 0) {
                    try {
                        z = this.f151416l.mo221301a() && poll() != null;
                    } catch (MissingBackpressureException e) {
                        if (this.f151412h.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f151411g.onError(e);
                        }
                    }
                    d30 d30Var = this.f151415k;
                    if (d30Var != null) {
                        try {
                            d30Var.call();
                        } catch (Throwable th) {
                            f5f.m119491e(th);
                            this.f151413i.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.f151410f.compareAndSet(j, j - 1));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public rc90 m171543h() {
            return this.f151413i;
        }

        @Override // p149l.m250
        public void onCompleted() throws Throwable {
            if (this.f151412h.get()) {
                return;
            }
            this.f151413i.terminateAndDrain();
        }

        @Override // p149l.m250
        public void onError(Throwable th) throws Throwable {
            if (this.f151412h.get()) {
                return;
            }
            this.f151413i.terminateAndDrain(th);
        }

        @Override // p149l.m250
        public void onNext(T t) throws Throwable {
            if (m171542g()) {
                this.f151409e.offer(this.f151414j.m221344j(t));
                this.f151413i.drain();
            }
        }

        @Override // p133rx.internal.util.BackpressureDrainManager.InterfaceC22357a
        public Object peek() {
            return this.f151409e.peek();
        }

        @Override // p133rx.internal.util.BackpressureDrainManager.InterfaceC22357a
        public Object poll() {
            Object objPoll = this.f151409e.poll();
            AtomicLong atomicLong = this.f151410f;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    /* JADX INFO: renamed from: l.pv50$b */
    public static final class C19342b {
        static final pv50<?> INSTANCE = new pv50<>();
    }

    public pv50(long j, d30 d30Var, C22304a.d dVar) {
        if (j <= 0) {
            ig3.m135964a("Buffer capacity must be > 0");
            throw null;
        }
        if (dVar == null) {
            jfd0.m141176a("The BackpressureOverflow strategy must not be null");
            throw null;
        }
        this.f151406a = Long.valueOf(j);
        this.f151407b = d30Var;
        this.f151408c = dVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> pv50<T> m171539b() {
        return (pv50<T>) C19342b.INSTANCE;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C19341a c19341a = new C19341a(z3g0Var, this.f151406a, this.f151407b, this.f151408c);
        z3g0Var.m217046b(c19341a);
        z3g0Var.mo106696f(c19341a.m171543h());
        return c19341a;
    }

    public pv50(long j) {
        this(j, null, C22304a.f207098b);
    }

    public pv50(long j, d30 d30Var) {
        this(j, d30Var, C22304a.f207098b);
    }

    public pv50() {
        this.f151406a = null;
        this.f151407b = null;
        this.f151408c = C22304a.f207098b;
    }
}
