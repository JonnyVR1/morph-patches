package p153l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public final class jo50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: f */
    public static final qcj<C22421c<? extends Notification<?>>, C22421c<?>> f121939f = new C17988a();

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f121940a;

    /* JADX INFO: renamed from: b */
    public final qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> f121941b;

    /* JADX INFO: renamed from: c */
    public final boolean f121942c;

    /* JADX INFO: renamed from: d */
    public final boolean f121943d;

    /* JADX INFO: renamed from: e */
    public final f2e0 f121944e;

    /* JADX INFO: renamed from: l.jo50$a */
    public static class C17988a implements qcj<C22421c<? extends Notification<?>>, C22421c<?>> {

        /* JADX INFO: renamed from: l.jo50$a$a */
        public class a implements qcj<Notification<?>, Notification<?>> {
            public a() {
            }

            @Override // p153l.qcj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                return Notification.m222538c(null);
            }
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?> call(C22421c<? extends Notification<?>> c22421c) {
            return c22421c.map(new a());
        }
    }

    /* JADX INFO: renamed from: l.jo50$b */
    public class C17989b implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f121946a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C22507a f121947b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xk90 f121948c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicLong f121949d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ wqe0 f121950e;

        /* JADX INFO: renamed from: l.jo50$b$a */
        public class a extends gcg0<T> {

            /* JADX INFO: renamed from: e */
            public boolean f121952e;

            public a() {
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                C17989b.this.f121948c.m211356c(vk90Var);
            }

            /* JADX INFO: renamed from: g */
            public final void m146344g() {
                long j;
                do {
                    j = C17989b.this.f121949d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!C17989b.this.f121949d.compareAndSet(j, j - 1));
            }

            @Override // p153l.bb50
            public void onCompleted() {
                if (this.f121952e) {
                    return;
                }
                this.f121952e = true;
                unsubscribe();
                C17989b.this.f121947b.onNext(Notification.m222536a());
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                if (this.f121952e) {
                    return;
                }
                this.f121952e = true;
                unsubscribe();
                C17989b.this.f121947b.onNext(Notification.m222537b(th));
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                if (this.f121952e) {
                    return;
                }
                C17989b.this.f121946a.onNext(t);
                m146344g();
                C17989b.this.f121948c.m211355b(1L);
            }
        }

        public C17989b(gcg0 gcg0Var, C22507a c22507a, xk90 xk90Var, AtomicLong atomicLong, wqe0 wqe0Var) {
            this.f121946a = gcg0Var;
            this.f121947b = c22507a;
            this.f121948c = xk90Var;
            this.f121949d = atomicLong;
            this.f121950e = wqe0Var;
        }

        @Override // p153l.x20
        public void call() {
            if (this.f121946a.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f121950e.m207511b(aVar);
            jo50.this.f121940a.unsafeSubscribe(aVar);
        }
    }

    /* JADX INFO: renamed from: l.jo50$c */
    public class C17990c implements C22421c.c<Notification<?>, Notification<?>> {

        /* JADX INFO: renamed from: l.jo50$c$a */
        public class a extends gcg0<Notification<?>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gcg0 f121955e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gcg0 gcg0Var, gcg0 gcg0Var2) {
                super(gcg0Var);
                this.f121955e = gcg0Var2;
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                vk90Var.request(Long.MAX_VALUE);
            }

            @Override // p153l.bb50
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Notification<?> notification) {
                if (notification.m222544i() && jo50.this.f121942c) {
                    this.f121955e.onCompleted();
                } else if (notification.m222545j() && jo50.this.f121943d) {
                    this.f121955e.onError(notification.m222540e());
                } else {
                    this.f121955e.onNext(notification);
                }
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f121955e.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f121955e.onError(th);
            }
        }

        public C17990c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gcg0<? super Notification<?>> call(gcg0<? super Notification<?>> gcg0Var) {
            return new a(gcg0Var, gcg0Var);
        }
    }

    /* JADX INFO: renamed from: l.jo50$d */
    public class C17991d implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22421c f121957a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gcg0 f121958b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicLong f121959c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ f2e0.AbstractC16877a f121960d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ x20 f121961e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicBoolean f121962f;

        /* JADX INFO: renamed from: l.jo50$d$a */
        public class a extends gcg0<Object> {
            public a(gcg0 gcg0Var) {
                super(gcg0Var);
            }

            @Override // p153l.gcg0
            /* JADX INFO: renamed from: f */
            public void mo95773f(vk90 vk90Var) {
                vk90Var.request(Long.MAX_VALUE);
            }

            @Override // p153l.bb50
            public void onCompleted() {
                C17991d.this.f121958b.onCompleted();
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                C17991d.this.f121958b.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(Object obj) {
                if (C17991d.this.f121958b.isUnsubscribed()) {
                    return;
                }
                long j = C17991d.this.f121959c.get();
                C17991d c17991d = C17991d.this;
                if (j > 0) {
                    c17991d.f121960d.mo102836b(c17991d.f121961e);
                } else {
                    c17991d.f121962f.compareAndSet(false, true);
                }
            }
        }

        public C17991d(C22421c c22421c, gcg0 gcg0Var, AtomicLong atomicLong, f2e0.AbstractC16877a abstractC16877a, x20 x20Var, AtomicBoolean atomicBoolean) {
            this.f121957a = c22421c;
            this.f121958b = gcg0Var;
            this.f121959c = atomicLong;
            this.f121960d = abstractC16877a;
            this.f121961e = x20Var;
            this.f121962f = atomicBoolean;
        }

        @Override // p153l.x20
        public void call() {
            this.f121957a.unsafeSubscribe(new a(this.f121958b));
        }
    }

    /* JADX INFO: renamed from: l.jo50$e */
    public class C17992e implements vk90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f121965a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xk90 f121966b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicBoolean f121967c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ f2e0.AbstractC16877a f121968d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ x20 f121969e;

        public C17992e(AtomicLong atomicLong, xk90 xk90Var, AtomicBoolean atomicBoolean, f2e0.AbstractC16877a abstractC16877a, x20 x20Var) {
            this.f121965a = atomicLong;
            this.f121966b = xk90Var;
            this.f121967c = atomicBoolean;
            this.f121968d = abstractC16877a;
            this.f121969e = x20Var;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j > 0) {
                rc2.m180770b(this.f121965a, j);
                this.f121966b.request(j);
                if (this.f121967c.compareAndSet(true, false)) {
                    this.f121968d.mo102836b(this.f121969e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.jo50$f */
    public static final class C17993f implements qcj<C22421c<? extends Notification<?>>, C22421c<?>> {

        /* JADX INFO: renamed from: a */
        public final long f121971a;

        /* JADX INFO: renamed from: l.jo50$f$a */
        public class a implements qcj<Notification<?>, Notification<?>> {

            /* JADX INFO: renamed from: a */
            public int f121972a;

            public a() {
            }

            @Override // p153l.qcj
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                long j = C17993f.this.f121971a;
                if (j != 0) {
                    int i = this.f121972a + 1;
                    this.f121972a = i;
                    if (i <= j) {
                        return Notification.m222538c(Integer.valueOf(i));
                    }
                }
                return notification;
            }
        }

        public C17993f(long j) {
            this.f121971a = j;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<?> call(C22421c<? extends Notification<?>> c22421c) {
            return c22421c.map(new a()).dematerialize();
        }
    }

    public jo50(C22421c<T> c22421c, qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> qcjVar, boolean z, boolean z2, f2e0 f2e0Var) {
        this.f121940a = c22421c;
        this.f121941b = qcjVar;
        this.f121942c = z;
        this.f121943d = z2;
        this.f121944e = f2e0Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22421c<T> m146331b(C22421c<T> c22421c) {
        return m146336g(c22421c, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c<T> m146332c(C22421c<T> c22421c, long j) {
        return m146333d(c22421c, j, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22421c<T> m146333d(C22421c<T> c22421c, long j, f2e0 f2e0Var) {
        if (j == 0) {
            return C22421c.empty();
        }
        if (j >= 0) {
            return m146335f(c22421c, new C17993f(j - 1), f2e0Var);
        }
        wg3.m206174a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22421c<T> m146334e(C22421c<T> c22421c, qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> qcjVar) {
        return C22421c.create(new jo50(c22421c, qcjVar, false, true, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22421c<T> m146335f(C22421c<T> c22421c, qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> qcjVar, f2e0 f2e0Var) {
        return C22421c.create(new jo50(c22421c, qcjVar, false, true, f2e0Var));
    }

    /* JADX INFO: renamed from: g */
    public static <T> C22421c<T> m146336g(C22421c<T> c22421c, f2e0 f2e0Var) {
        return m146335f(c22421c, f121939f, f2e0Var);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C22421c<T> m146337h(C22421c<T> c22421c) {
        return m146339j(c22421c, f121939f);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22421c<T> m146338i(C22421c<T> c22421c, long j) {
        if (j >= 0) {
            return j == 0 ? c22421c : m146339j(c22421c, new C17993f(j));
        }
        wg3.m206174a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static <T> C22421c<T> m146339j(C22421c<T> c22421c, qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> qcjVar) {
        return C22421c.create(new jo50(c22421c, qcjVar, true, false, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> C22421c<T> m146340k(C22421c<T> c22421c, qcj<? super C22421c<? extends Notification<?>>, ? extends C22421c<?>> qcjVar, f2e0 f2e0Var) {
        return C22421c.create(new jo50(c22421c, qcjVar, true, false, f2e0Var));
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f121944e.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        wqe0 wqe0Var = new wqe0();
        gcg0Var.m129866b(wqe0Var);
        C22507a c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.subscribe((gcg0) icg0.m139434a());
        xk90 xk90Var = new xk90();
        C17989b c17989b = new C17989b(gcg0Var, c22507aM222758b, xk90Var, atomicLong, wqe0Var);
        abstractC16877aCreateWorker.mo102836b(new C17991d(this.f121941b.call(c22507aM222758b.lift(new C17990c())), gcg0Var, atomicLong, abstractC16877aCreateWorker, c17989b, atomicBoolean));
        gcg0Var.mo95773f(new C17992e(atomicLong, xk90Var, atomicBoolean, abstractC16877aCreateWorker, c17989b));
    }
}
