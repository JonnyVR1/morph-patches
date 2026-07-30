package p149l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public final class dg50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: f */
    public static final w9j<C22306c<? extends Notification<?>>, C22306c<?>> f86023f = new C16353a();

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f86024a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> f86025b;

    /* JADX INFO: renamed from: c */
    public final boolean f86026c;

    /* JADX INFO: renamed from: d */
    public final boolean f86027d;

    /* JADX INFO: renamed from: e */
    public final bud0 f86028e;

    /* JADX INFO: renamed from: l.dg50$a */
    public static class C16353a implements w9j<C22306c<? extends Notification<?>>, C22306c<?>> {

        /* JADX INFO: renamed from: l.dg50$a$a */
        public class a implements w9j<Notification<?>, Notification<?>> {
            public a() {
            }

            @Override // p149l.w9j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                return Notification.m221292c(null);
            }
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?> call(C22306c<? extends Notification<?>> c22306c) {
            return c22306c.map(new a());
        }
    }

    /* JADX INFO: renamed from: l.dg50$b */
    public class C16354b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f86030a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C22392a f86031b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tc90 f86032c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicLong f86033d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ rie0 f86034e;

        /* JADX INFO: renamed from: l.dg50$b$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public boolean f86036e;

            public a() {
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                C16354b.this.f86032c.m187981c(rc90Var);
            }

            /* JADX INFO: renamed from: g */
            public final void m111622g() {
                long j;
                do {
                    j = C16354b.this.f86033d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!C16354b.this.f86033d.compareAndSet(j, j - 1));
            }

            @Override // p149l.m250
            public void onCompleted() {
                if (this.f86036e) {
                    return;
                }
                this.f86036e = true;
                unsubscribe();
                C16354b.this.f86031b.onNext(Notification.m221290a());
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                if (this.f86036e) {
                    return;
                }
                this.f86036e = true;
                unsubscribe();
                C16354b.this.f86031b.onNext(Notification.m221291b(th));
            }

            @Override // p149l.m250
            public void onNext(T t) {
                if (this.f86036e) {
                    return;
                }
                C16354b.this.f86030a.onNext(t);
                m111622g();
                C16354b.this.f86032c.m187980b(1L);
            }
        }

        public C16354b(z3g0 z3g0Var, C22392a c22392a, tc90 tc90Var, AtomicLong atomicLong, rie0 rie0Var) {
            this.f86030a = z3g0Var;
            this.f86031b = c22392a;
            this.f86032c = tc90Var;
            this.f86033d = atomicLong;
            this.f86034e = rie0Var;
        }

        @Override // p149l.d30
        public void call() {
            if (this.f86030a.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f86034e.m179504b(aVar);
            dg50.this.f86024a.unsafeSubscribe(aVar);
        }
    }

    /* JADX INFO: renamed from: l.dg50$c */
    public class C16355c implements C22306c.c<Notification<?>, Notification<?>> {

        /* JADX INFO: renamed from: l.dg50$c$a */
        public class a extends z3g0<Notification<?>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f86039e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, z3g0 z3g0Var2) {
                super(z3g0Var);
                this.f86039e = z3g0Var2;
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                rc90Var.request(Long.MAX_VALUE);
            }

            @Override // p149l.m250
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Notification<?> notification) {
                if (notification.m221298i() && dg50.this.f86026c) {
                    this.f86039e.onCompleted();
                } else if (notification.m221299j() && dg50.this.f86027d) {
                    this.f86039e.onError(notification.m221294e());
                } else {
                    this.f86039e.onNext(notification);
                }
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f86039e.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f86039e.onError(th);
            }
        }

        public C16355c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z3g0<? super Notification<?>> call(z3g0<? super Notification<?>> z3g0Var) {
            return new a(z3g0Var, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: l.dg50$d */
    public class C16356d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C22306c f86041a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0 f86042b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicLong f86043c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bud0.AbstractC15976a f86044d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ d30 f86045e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicBoolean f86046f;

        /* JADX INFO: renamed from: l.dg50$d$a */
        public class a extends z3g0<Object> {
            public a(z3g0 z3g0Var) {
                super(z3g0Var);
            }

            @Override // p149l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo106696f(rc90 rc90Var) {
                rc90Var.request(Long.MAX_VALUE);
            }

            @Override // p149l.m250
            public void onCompleted() {
                C16356d.this.f86042b.onCompleted();
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                C16356d.this.f86042b.onError(th);
            }

            @Override // p149l.m250
            public void onNext(Object obj) {
                if (C16356d.this.f86042b.isUnsubscribed()) {
                    return;
                }
                long j = C16356d.this.f86043c.get();
                C16356d c16356d = C16356d.this;
                if (j > 0) {
                    c16356d.f86044d.mo99201b(c16356d.f86045e);
                } else {
                    c16356d.f86046f.compareAndSet(false, true);
                }
            }
        }

        public C16356d(C22306c c22306c, z3g0 z3g0Var, AtomicLong atomicLong, bud0.AbstractC15976a abstractC15976a, d30 d30Var, AtomicBoolean atomicBoolean) {
            this.f86041a = c22306c;
            this.f86042b = z3g0Var;
            this.f86043c = atomicLong;
            this.f86044d = abstractC15976a;
            this.f86045e = d30Var;
            this.f86046f = atomicBoolean;
        }

        @Override // p149l.d30
        public void call() {
            this.f86041a.unsafeSubscribe(new a(this.f86042b));
        }
    }

    /* JADX INFO: renamed from: l.dg50$e */
    public class C16357e implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f86049a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tc90 f86050b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicBoolean f86051c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bud0.AbstractC15976a f86052d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ d30 f86053e;

        public C16357e(AtomicLong atomicLong, tc90 tc90Var, AtomicBoolean atomicBoolean, bud0.AbstractC15976a abstractC15976a, d30 d30Var) {
            this.f86049a = atomicLong;
            this.f86050b = tc90Var;
            this.f86051c = atomicBoolean;
            this.f86052d = abstractC15976a;
            this.f86053e = d30Var;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j > 0) {
                kc2.m145336b(this.f86049a, j);
                this.f86050b.request(j);
                if (this.f86051c.compareAndSet(true, false)) {
                    this.f86052d.mo99201b(this.f86053e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dg50$f */
    public static final class C16358f implements w9j<C22306c<? extends Notification<?>>, C22306c<?>> {

        /* JADX INFO: renamed from: a */
        public final long f86055a;

        /* JADX INFO: renamed from: l.dg50$f$a */
        public class a implements w9j<Notification<?>, Notification<?>> {

            /* JADX INFO: renamed from: a */
            public int f86056a;

            public a() {
            }

            @Override // p149l.w9j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                long j = C16358f.this.f86055a;
                if (j != 0) {
                    int i = this.f86056a + 1;
                    this.f86056a = i;
                    if (i <= j) {
                        return Notification.m221292c(Integer.valueOf(i));
                    }
                }
                return notification;
            }
        }

        public C16358f(long j) {
            this.f86055a = j;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<?> call(C22306c<? extends Notification<?>> c22306c) {
            return c22306c.map(new a()).dematerialize();
        }
    }

    public dg50(C22306c<T> c22306c, w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> w9jVar, boolean z, boolean z2, bud0 bud0Var) {
        this.f86024a = c22306c;
        this.f86025b = w9jVar;
        this.f86026c = z;
        this.f86027d = z2;
        this.f86028e = bud0Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C22306c<T> m111609b(C22306c<T> c22306c) {
        return m111614g(c22306c, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c<T> m111610c(C22306c<T> c22306c, long j) {
        return m111611d(c22306c, j, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22306c<T> m111611d(C22306c<T> c22306c, long j, bud0 bud0Var) {
        if (j == 0) {
            return C22306c.empty();
        }
        if (j >= 0) {
            return m111613f(c22306c, new C16358f(j - 1), bud0Var);
        }
        ig3.m135964a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C22306c<T> m111612e(C22306c<T> c22306c, w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> w9jVar) {
        return C22306c.create(new dg50(c22306c, w9jVar, false, true, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22306c<T> m111613f(C22306c<T> c22306c, w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> w9jVar, bud0 bud0Var) {
        return C22306c.create(new dg50(c22306c, w9jVar, false, true, bud0Var));
    }

    /* JADX INFO: renamed from: g */
    public static <T> C22306c<T> m111614g(C22306c<T> c22306c, bud0 bud0Var) {
        return m111613f(c22306c, f86023f, bud0Var);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C22306c<T> m111615h(C22306c<T> c22306c) {
        return m111617j(c22306c, f86023f);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22306c<T> m111616i(C22306c<T> c22306c, long j) {
        if (j >= 0) {
            return j == 0 ? c22306c : m111617j(c22306c, new C16358f(j));
        }
        ig3.m135964a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static <T> C22306c<T> m111617j(C22306c<T> c22306c, w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> w9jVar) {
        return C22306c.create(new dg50(c22306c, w9jVar, true, false, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> C22306c<T> m111618k(C22306c<T> c22306c, w9j<? super C22306c<? extends Notification<?>>, ? extends C22306c<?>> w9jVar, bud0 bud0Var) {
        return C22306c.create(new dg50(c22306c, w9jVar, true, false, bud0Var));
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f86028e.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        rie0 rie0Var = new rie0();
        z3g0Var.m217046b(rie0Var);
        C22392a c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.subscribe((z3g0) a4g0.m94917a());
        tc90 tc90Var = new tc90();
        C16354b c16354b = new C16354b(z3g0Var, c22392aM221512b, tc90Var, atomicLong, rie0Var);
        abstractC15976aCreateWorker.mo99201b(new C16356d(this.f86025b.call(c22392aM221512b.lift(new C16355c())), z3g0Var, atomicLong, abstractC15976aCreateWorker, c16354b, atomicBoolean));
        z3g0Var.mo106696f(new C16357e(atomicLong, tc90Var, atomicBoolean, abstractC15976aCreateWorker, c16354b));
    }
}
