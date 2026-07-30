package p003l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l.ig3;
import p014rx.C1099c;
import p014rx.Notification;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class dg50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: f */
    public static final w9j<C1099c<? extends Notification<?>>, C1099c<?>> f2959f = new C0223a();

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f2960a;

    /* JADX INFO: renamed from: b */
    public final w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> f2961b;

    /* JADX INFO: renamed from: c */
    public final boolean f2962c;

    /* JADX INFO: renamed from: d */
    public final boolean f2963d;

    /* JADX INFO: renamed from: e */
    public final bud0 f2964e;

    /* JADX INFO: renamed from: l.dg50$a */
    public static class C0223a implements w9j<C1099c<? extends Notification<?>>, C1099c<?>> {

        /* JADX INFO: renamed from: l.dg50$a$a */
        public class a implements w9j<Notification<?>, Notification<?>> {
            public a() {
            }

            @Override // p003l.w9j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                return Notification.m9749c(null);
            }
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<?> call(C1099c<? extends Notification<?>> c1099c) {
            return c1099c.map(new a());
        }
    }

    /* JADX INFO: renamed from: l.dg50$b */
    public class C0224b implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f2966a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1185a f2967b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tc90 f2968c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicLong f2969d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ rie0 f2970e;

        /* JADX INFO: renamed from: l.dg50$b$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public boolean f2972e;

            public a() {
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                C0224b.this.f2968c.m7738c(rc90Var);
            }

            /* JADX INFO: renamed from: g */
            public final void m3569g() {
                long j;
                do {
                    j = C0224b.this.f2969d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!C0224b.this.f2969d.compareAndSet(j, j - 1));
            }

            @Override // p003l.m250
            public void onCompleted() {
                if (this.f2972e) {
                    return;
                }
                this.f2972e = true;
                unsubscribe();
                C0224b.this.f2967b.onNext(Notification.m9747a());
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                if (this.f2972e) {
                    return;
                }
                this.f2972e = true;
                unsubscribe();
                C0224b.this.f2967b.onNext(Notification.m9748b(th));
            }

            @Override // p003l.m250
            public void onNext(T t) {
                if (this.f2972e) {
                    return;
                }
                C0224b.this.f2966a.onNext(t);
                m3569g();
                C0224b.this.f2968c.m7737b(1L);
            }
        }

        public C0224b(z3g0 z3g0Var, C1185a c1185a, tc90 tc90Var, AtomicLong atomicLong, rie0 rie0Var) {
            this.f2966a = z3g0Var;
            this.f2967b = c1185a;
            this.f2968c = tc90Var;
            this.f2969d = atomicLong;
            this.f2970e = rie0Var;
        }

        @Override // p003l.d30
        public void call() {
            if (this.f2966a.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f2970e.m7260b(aVar);
            dg50.this.f2960a.unsafeSubscribe(aVar);
        }
    }

    /* JADX INFO: renamed from: l.dg50$c */
    public class C0225c implements C1099c.c<Notification<?>, Notification<?>> {

        /* JADX INFO: renamed from: l.dg50$c$a */
        public class a extends z3g0<Notification<?>> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ z3g0 f2975e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3g0 z3g0Var, z3g0 z3g0Var2) {
                super(z3g0Var);
                this.f2975e = z3g0Var2;
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                rc90Var.request(Long.MAX_VALUE);
            }

            @Override // p003l.m250
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void onNext(Notification<?> notification) {
                if (notification.m9755i() && dg50.this.f2962c) {
                    this.f2975e.onCompleted();
                } else if (notification.m9756j() && dg50.this.f2963d) {
                    this.f2975e.onError(notification.m9751e());
                } else {
                    this.f2975e.onNext(notification);
                }
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f2975e.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f2975e.onError(th);
            }
        }

        public C0225c() {
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z3g0<? super Notification<?>> call(z3g0<? super Notification<?>> z3g0Var) {
            return new a(z3g0Var, z3g0Var);
        }
    }

    /* JADX INFO: renamed from: l.dg50$d */
    public class C0226d implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1099c f2977a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0 f2978b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicLong f2979c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bud0.AbstractC0185a f2980d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ d30 f2981e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicBoolean f2982f;

        /* JADX INFO: renamed from: l.dg50$d$a */
        public class a extends z3g0<Object> {
            public a(z3g0 z3g0Var) {
                super(z3g0Var);
            }

            @Override // p003l.z3g0
            /* JADX INFO: renamed from: f */
            public void mo3257f(rc90 rc90Var) {
                rc90Var.request(Long.MAX_VALUE);
            }

            @Override // p003l.m250
            public void onCompleted() {
                C0226d.this.f2978b.onCompleted();
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                C0226d.this.f2978b.onError(th);
            }

            @Override // p003l.m250
            public void onNext(Object obj) {
                if (C0226d.this.f2978b.isUnsubscribed()) {
                    return;
                }
                long j = C0226d.this.f2979c.get();
                C0226d c0226d = C0226d.this;
                if (j > 0) {
                    c0226d.f2980d.mo2914b(c0226d.f2981e);
                } else {
                    c0226d.f2982f.compareAndSet(false, true);
                }
            }
        }

        public C0226d(C1099c c1099c, z3g0 z3g0Var, AtomicLong atomicLong, bud0.AbstractC0185a abstractC0185a, d30 d30Var, AtomicBoolean atomicBoolean) {
            this.f2977a = c1099c;
            this.f2978b = z3g0Var;
            this.f2979c = atomicLong;
            this.f2980d = abstractC0185a;
            this.f2981e = d30Var;
            this.f2982f = atomicBoolean;
        }

        @Override // p003l.d30
        public void call() {
            this.f2977a.unsafeSubscribe(new a(this.f2978b));
        }
    }

    /* JADX INFO: renamed from: l.dg50$e */
    public class C0227e implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicLong f2985a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tc90 f2986b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicBoolean f2987c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ bud0.AbstractC0185a f2988d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ d30 f2989e;

        public C0227e(AtomicLong atomicLong, tc90 tc90Var, AtomicBoolean atomicBoolean, bud0.AbstractC0185a abstractC0185a, d30 d30Var) {
            this.f2985a = atomicLong;
            this.f2986b = tc90Var;
            this.f2987c = atomicBoolean;
            this.f2988d = abstractC0185a;
            this.f2989e = d30Var;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j > 0) {
                kc2.m5640b(this.f2985a, j);
                this.f2986b.request(j);
                if (this.f2987c.compareAndSet(true, false)) {
                    this.f2988d.mo2914b(this.f2989e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dg50$f */
    public static final class C0228f implements w9j<C1099c<? extends Notification<?>>, C1099c<?>> {

        /* JADX INFO: renamed from: a */
        public final long f2991a;

        /* JADX INFO: renamed from: l.dg50$f$a */
        public class a implements w9j<Notification<?>, Notification<?>> {

            /* JADX INFO: renamed from: a */
            public int f2992a;

            public a() {
            }

            @Override // p003l.w9j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                long j = C0228f.this.f2991a;
                if (j != 0) {
                    int i = this.f2992a + 1;
                    this.f2992a = i;
                    if (i <= j) {
                        return Notification.m9749c(Integer.valueOf(i));
                    }
                }
                return notification;
            }
        }

        public C0228f(long j) {
            this.f2991a = j;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<?> call(C1099c<? extends Notification<?>> c1099c) {
            return c1099c.map(new a()).dematerialize();
        }
    }

    public dg50(C1099c<T> c1099c, w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> w9jVar, boolean z, boolean z2, bud0 bud0Var) {
        this.f2960a = c1099c;
        this.f2961b = w9jVar;
        this.f2962c = z;
        this.f2963d = z2;
        this.f2964e = bud0Var;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C1099c<T> m3556b(C1099c<T> c1099c) {
        return m3561g(c1099c, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C1099c<T> m3557c(C1099c<T> c1099c, long j) {
        return m3558d(c1099c, j, Schedulers.trampoline());
    }

    /* JADX INFO: renamed from: d */
    public static <T> C1099c<T> m3558d(C1099c<T> c1099c, long j, bud0 bud0Var) {
        if (j == 0) {
            return C1099c.empty();
        }
        if (j >= 0) {
            return m3560f(c1099c, new C0228f(j - 1), bud0Var);
        }
        ig3.a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static <T> C1099c<T> m3559e(C1099c<T> c1099c, w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> w9jVar) {
        return C1099c.create(new dg50(c1099c, w9jVar, false, true, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> C1099c<T> m3560f(C1099c<T> c1099c, w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> w9jVar, bud0 bud0Var) {
        return C1099c.create(new dg50(c1099c, w9jVar, false, true, bud0Var));
    }

    /* JADX INFO: renamed from: g */
    public static <T> C1099c<T> m3561g(C1099c<T> c1099c, bud0 bud0Var) {
        return m3560f(c1099c, f2959f, bud0Var);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C1099c<T> m3562h(C1099c<T> c1099c) {
        return m3564j(c1099c, f2959f);
    }

    /* JADX INFO: renamed from: i */
    public static <T> C1099c<T> m3563i(C1099c<T> c1099c, long j) {
        if (j >= 0) {
            return j == 0 ? c1099c : m3564j(c1099c, new C0228f(j));
        }
        ig3.a("count >= 0 expected");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static <T> C1099c<T> m3564j(C1099c<T> c1099c, w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> w9jVar) {
        return C1099c.create(new dg50(c1099c, w9jVar, true, false, Schedulers.trampoline()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> C1099c<T> m3565k(C1099c<T> c1099c, w9j<? super C1099c<? extends Notification<?>>, ? extends C1099c<?>> w9jVar, bud0 bud0Var) {
        return C1099c.create(new dg50(c1099c, w9jVar, true, false, bud0Var));
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f2964e.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        rie0 rie0Var = new rie0();
        z3g0Var.m9240b(rie0Var);
        C1185a c1185aM9969b = C1185a.m9969b();
        c1185aM9969b.subscribe((z3g0) a4g0.m2741a());
        tc90 tc90Var = new tc90();
        C0224b c0224b = new C0224b(z3g0Var, c1185aM9969b, tc90Var, atomicLong, rie0Var);
        abstractC0185aCreateWorker.mo2914b(new C0226d(this.f2961b.call(c1185aM9969b.lift(new C0225c())), z3g0Var, atomicLong, abstractC0185aCreateWorker, c0224b, atomicBoolean));
        z3g0Var.mo3257f(new C0227e(atomicLong, tc90Var, atomicBoolean, abstractC0185aCreateWorker, c0224b));
    }
}
