package p153l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22419a;
import p137rx.C22421c;
import p137rx.exceptions.MissingBackpressureException;
import p137rx.internal.operators.NotificationLite;
import p137rx.internal.util.BackpressureDrainManager;

/* JADX INFO: loaded from: classes3.dex */
public class v360<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final Long f182156a;

    /* JADX INFO: renamed from: b */
    public final x20 f182157b;

    /* JADX INFO: renamed from: c */
    public final C22419a.d f182158c;

    /* JADX INFO: renamed from: l.v360$a */
    public static final class C20731a<T> extends gcg0<T> implements BackpressureDrainManager.InterfaceC22472a {

        /* JADX INFO: renamed from: f */
        public final AtomicLong f182160f;

        /* JADX INFO: renamed from: g */
        public final gcg0<? super T> f182161g;

        /* JADX INFO: renamed from: i */
        public final BackpressureDrainManager f182163i;

        /* JADX INFO: renamed from: k */
        public final x20 f182165k;

        /* JADX INFO: renamed from: l */
        public final C22419a.d f182166l;

        /* JADX INFO: renamed from: e */
        public final ConcurrentLinkedQueue<Object> f182159e = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: h */
        public final AtomicBoolean f182162h = new AtomicBoolean(false);

        /* JADX INFO: renamed from: j */
        public final NotificationLite<T> f182164j = NotificationLite.m222581f();

        public C20731a(gcg0<? super T> gcg0Var, Long l2, x20 x20Var, C22419a.d dVar) {
            this.f182161g = gcg0Var;
            this.f182160f = l2 != null ? new AtomicLong(l2.longValue()) : null;
            this.f182165k = x20Var;
            this.f182163i = new BackpressureDrainManager(this);
            this.f182166l = dVar;
        }

        @Override // p137rx.internal.util.BackpressureDrainManager.InterfaceC22472a
        /* JADX INFO: renamed from: a */
        public void mo199207a(Throwable th) {
            gcg0<? super T> gcg0Var = this.f182161g;
            if (th != null) {
                gcg0Var.onError(th);
            } else {
                gcg0Var.onCompleted();
            }
        }

        @Override // p137rx.internal.util.BackpressureDrainManager.InterfaceC22472a
        public boolean accept(Object obj) {
            return this.f182164j.m222582a(this.f182161g, obj);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m199208g() throws Throwable {
            long j;
            boolean z;
            if (this.f182160f == null) {
                return true;
            }
            do {
                j = this.f182160f.get();
                if (j <= 0) {
                    try {
                        z = this.f182166l.mo222547a() && poll() != null;
                    } catch (MissingBackpressureException e) {
                        if (this.f182162h.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f182161g.onError(e);
                        }
                    }
                    x20 x20Var = this.f182165k;
                    if (x20Var != null) {
                        try {
                            x20Var.call();
                        } catch (Throwable th) {
                            j6f.m143663e(th);
                            this.f182163i.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.f182160f.compareAndSet(j, j - 1));
            return true;
        }

        /* JADX INFO: renamed from: h */
        public vk90 m199209h() {
            return this.f182163i;
        }

        @Override // p153l.bb50
        public void onCompleted() throws Throwable {
            if (this.f182162h.get()) {
                return;
            }
            this.f182163i.terminateAndDrain();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) throws Throwable {
            if (this.f182162h.get()) {
                return;
            }
            this.f182163i.terminateAndDrain(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) throws Throwable {
            if (m199208g()) {
                this.f182159e.offer(this.f182164j.m222590j(t));
                this.f182163i.drain();
            }
        }

        @Override // p137rx.internal.util.BackpressureDrainManager.InterfaceC22472a
        public Object peek() {
            return this.f182159e.peek();
        }

        @Override // p137rx.internal.util.BackpressureDrainManager.InterfaceC22472a
        public Object poll() {
            Object objPoll = this.f182159e.poll();
            AtomicLong atomicLong = this.f182160f;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    /* JADX INFO: renamed from: l.v360$b */
    public static final class C20732b {
        static final v360<?> INSTANCE = new v360<>();
    }

    public v360(long j, x20 x20Var, C22419a.d dVar) {
        if (j <= 0) {
            wg3.m206174a("Buffer capacity must be > 0");
            throw null;
        }
        if (dVar == null) {
            mnd0.m159157a("The BackpressureOverflow strategy must not be null");
            throw null;
        }
        this.f182156a = Long.valueOf(j);
        this.f182157b = x20Var;
        this.f182158c = dVar;
    }

    /* JADX INFO: renamed from: b */
    public static <T> v360<T> m199205b() {
        return (v360<T>) C20732b.INSTANCE;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C20731a c20731a = new C20731a(gcg0Var, this.f182156a, this.f182157b, this.f182158c);
        gcg0Var.m129866b(c20731a);
        gcg0Var.mo95773f(c20731a.m199209h());
        return c20731a;
    }

    public v360(long j) {
        this(j, null, C22419a.f208020b);
    }

    public v360(long j, x20 x20Var) {
        this(j, x20Var, C22419a.f208020b);
    }

    public v360() {
        this.f182156a = null;
        this.f182157b = null;
        this.f182158c = C22419a.f208020b;
    }
}
