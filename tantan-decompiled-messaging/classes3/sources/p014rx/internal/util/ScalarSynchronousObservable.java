package p014rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p003l.a4g0;
import p003l.bud0;
import p003l.c4g0;
import p003l.d30;
import p003l.ejd0;
import p003l.f5f;
import p003l.jc2;
import p003l.rc90;
import p003l.v3f;
import p003l.w9j;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;
import p014rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ScalarSynchronousObservable<T> extends C1099c<T> {

    /* JADX INFO: renamed from: b */
    public static final boolean f11048b = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* JADX INFO: renamed from: a */
    public final T f11049a;

    public static final class ScalarAsyncProducer<T> extends AtomicBoolean implements rc90, d30 {
        private static final long serialVersionUID = -2466317989629281651L;
        final z3g0<? super T> actual;
        final w9j<d30, c4g0> onSchedule;
        final T value;

        public ScalarAsyncProducer(z3g0<? super T> z3g0Var, T t, w9j<d30, c4g0> w9jVar) {
            this.actual = z3g0Var;
            this.value = t;
            this.onSchedule = w9jVar;
        }

        @Override // p003l.d30
        public void call() {
            z3g0<? super T> z3g0Var = this.actual;
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            T t = this.value;
            try {
                z3g0Var.onNext(t);
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onCompleted();
            } catch (Throwable th) {
                f5f.m3966g(th, z3g0Var, t);
            }
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
            } else {
                if (j == 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.m9240b(this.onSchedule.call(this));
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$a */
    public class C1170a implements w9j<d30, c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v3f f11050a;

        public C1170a(v3f v3fVar) {
            this.f11050a = v3fVar;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 call(d30 d30Var) {
            return this.f11050a.m8295a(d30Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b */
    public class C1171b implements w9j<d30, c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bud0 f11052a;

        /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f11054a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bud0.AbstractC0185a f11055b;

            public a(d30 d30Var, bud0.AbstractC0185a abstractC0185a) {
                this.f11054a = d30Var;
                this.f11055b = abstractC0185a;
            }

            @Override // p003l.d30
            public void call() {
                try {
                    this.f11054a.call();
                } finally {
                    this.f11055b.unsubscribe();
                }
            }
        }

        public C1171b(bud0 bud0Var) {
            this.f11052a = bud0Var;
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 call(d30 d30Var) {
            bud0.AbstractC0185a abstractC0185aCreateWorker = this.f11052a.createWorker();
            abstractC0185aCreateWorker.mo2914b(new a(d30Var, abstractC0185aCreateWorker));
            return abstractC0185aCreateWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$c */
    public class C1172c<R> implements C1099c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f11057a;

        public C1172c(w9j w9jVar) {
            this.f11057a = w9jVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            C1099c c1099c = (C1099c) this.f11057a.call(ScalarSynchronousObservable.this.f11049a);
            if (c1099c instanceof ScalarSynchronousObservable) {
                z3g0Var.mo3257f(ScalarSynchronousObservable.m9934b(z3g0Var, ((ScalarSynchronousObservable) c1099c).f11049a));
            } else {
                c1099c.unsafeSubscribe(a4g0.m2743c(z3g0Var));
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$d */
    public static final class C1173d<T> implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f11059a;

        public C1173d(T t) {
            this.f11059a = t;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.mo3257f(ScalarSynchronousObservable.m9934b(z3g0Var, this.f11059a));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$e */
    public static final class C1174e<T> implements C1099c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f11060a;

        /* JADX INFO: renamed from: b */
        public final w9j<d30, c4g0> f11061b;

        public C1174e(T t, w9j<d30, c4g0> w9jVar) {
            this.f11060a = t;
            this.f11061b = w9jVar;
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.mo3257f(new ScalarAsyncProducer(z3g0Var, this.f11060a, this.f11061b));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$f */
    public static final class C1175f<T> implements rc90 {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super T> f11062a;

        /* JADX INFO: renamed from: b */
        public final T f11063b;

        /* JADX INFO: renamed from: c */
        public boolean f11064c;

        public C1175f(z3g0<? super T> z3g0Var, T t) {
            this.f11062a = z3g0Var;
            this.f11063b = t;
        }

        @Override // p003l.rc90
        public void request(long j) {
            if (this.f11064c) {
                return;
            }
            if (j < 0) {
                jc2.m5313a("n >= required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            this.f11064c = true;
            z3g0<? super T> z3g0Var = this.f11062a;
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            T t = this.f11063b;
            try {
                z3g0Var.onNext(t);
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onCompleted();
            } catch (Throwable th) {
                f5f.m3966g(th, z3g0Var, t);
            }
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(ejd0.m3862h(new C1173d(t)));
        this.f11049a = t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> ScalarSynchronousObservable<T> m9933a(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    /* JADX INFO: renamed from: b */
    public static <T> rc90 m9934b(z3g0<? super T> z3g0Var, T t) {
        return f11048b ? new SingleProducer(z3g0Var, t) : new C1175f(z3g0Var, t);
    }

    /* JADX INFO: renamed from: c */
    public T m9935c() {
        return this.f11049a;
    }

    /* JADX INFO: renamed from: d */
    public <R> C1099c<R> m9936d(w9j<? super T, ? extends C1099c<? extends R>> w9jVar) {
        return C1099c.create(new C1172c(w9jVar));
    }

    /* JADX INFO: renamed from: e */
    public C1099c<T> m9937e(bud0 bud0Var) {
        return C1099c.create(new C1174e(this.f11049a, bud0Var instanceof v3f ? new C1170a((v3f) bud0Var) : new C1171b(bud0Var)));
    }
}
