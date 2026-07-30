package p133rx.internal.util;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p133rx.internal.producers.SingleProducer;
import p149l.a4g0;
import p149l.bud0;
import p149l.c4g0;
import p149l.d30;
import p149l.ejd0;
import p149l.f5f;
import p149l.jc2;
import p149l.rc90;
import p149l.v3f;
import p149l.w9j;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class ScalarSynchronousObservable<T> extends C22306c<T> {

    /* JADX INFO: renamed from: b */
    public static final boolean f207423b = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* JADX INFO: renamed from: a */
    public final T f207424a;

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

        @Override // p149l.d30
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
                f5f.m119493g(th, z3g0Var, t);
            }
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
            } else {
                if (j == 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.m217046b(this.onSchedule.call(this));
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$a */
    public class C22377a implements w9j<d30, c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v3f f207425a;

        public C22377a(v3f v3fVar) {
            this.f207425a = v3fVar;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 call(d30 d30Var) {
            return this.f207425a.m196849a(d30Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b */
    public class C22378b implements w9j<d30, c4g0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bud0 f207427a;

        /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d30 f207429a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bud0.AbstractC15976a f207430b;

            public a(d30 d30Var, bud0.AbstractC15976a abstractC15976a) {
                this.f207429a = d30Var;
                this.f207430b = abstractC15976a;
            }

            @Override // p149l.d30
            public void call() {
                try {
                    this.f207429a.call();
                } finally {
                    this.f207430b.unsubscribe();
                }
            }
        }

        public C22378b(bud0 bud0Var) {
            this.f207427a = bud0Var;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c4g0 call(d30 d30Var) {
            bud0.AbstractC15976a abstractC15976aCreateWorker = this.f207427a.createWorker();
            abstractC15976aCreateWorker.mo99201b(new a(d30Var, abstractC15976aCreateWorker));
            return abstractC15976aCreateWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$c */
    public class C22379c<R> implements C22306c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f207432a;

        public C22379c(w9j w9jVar) {
            this.f207432a = w9jVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super R> z3g0Var) {
            C22306c c22306c = (C22306c) this.f207432a.call(ScalarSynchronousObservable.this.f207424a);
            if (c22306c instanceof ScalarSynchronousObservable) {
                z3g0Var.mo106696f(ScalarSynchronousObservable.m221477b(z3g0Var, ((ScalarSynchronousObservable) c22306c).f207424a));
            } else {
                c22306c.unsafeSubscribe(a4g0.m94919c(z3g0Var));
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$d */
    public static final class C22380d<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f207434a;

        public C22380d(T t) {
            this.f207434a = t;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.mo106696f(ScalarSynchronousObservable.m221477b(z3g0Var, this.f207434a));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$e */
    public static final class C22381e<T> implements C22306c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f207435a;

        /* JADX INFO: renamed from: b */
        public final w9j<d30, c4g0> f207436b;

        public C22381e(T t, w9j<d30, c4g0> w9jVar) {
            this.f207435a = t;
            this.f207436b = w9jVar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super T> z3g0Var) {
            z3g0Var.mo106696f(new ScalarAsyncProducer(z3g0Var, this.f207435a, this.f207436b));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$f */
    public static final class C22382f<T> implements rc90 {

        /* JADX INFO: renamed from: a */
        public final z3g0<? super T> f207437a;

        /* JADX INFO: renamed from: b */
        public final T f207438b;

        /* JADX INFO: renamed from: c */
        public boolean f207439c;

        public C22382f(z3g0<? super T> z3g0Var, T t) {
            this.f207437a = z3g0Var;
            this.f207438b = t;
        }

        @Override // p149l.rc90
        public void request(long j) {
            if (this.f207439c) {
                return;
            }
            if (j < 0) {
                jc2.m140849a("n >= required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            this.f207439c = true;
            z3g0<? super T> z3g0Var = this.f207437a;
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            T t = this.f207438b;
            try {
                z3g0Var.onNext(t);
                if (z3g0Var.isUnsubscribed()) {
                    return;
                }
                z3g0Var.onCompleted();
            } catch (Throwable th) {
                f5f.m119493g(th, z3g0Var, t);
            }
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(ejd0.m116791h(new C22380d(t)));
        this.f207424a = t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> ScalarSynchronousObservable<T> m221476a(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    /* JADX INFO: renamed from: b */
    public static <T> rc90 m221477b(z3g0<? super T> z3g0Var, T t) {
        return f207423b ? new SingleProducer(z3g0Var, t) : new C22382f(z3g0Var, t);
    }

    /* JADX INFO: renamed from: c */
    public T m221478c() {
        return this.f207424a;
    }

    /* JADX INFO: renamed from: d */
    public <R> C22306c<R> m221479d(w9j<? super T, ? extends C22306c<? extends R>> w9jVar) {
        return C22306c.create(new C22379c(w9jVar));
    }

    /* JADX INFO: renamed from: e */
    public C22306c<T> m221480e(bud0 bud0Var) {
        return C22306c.create(new C22381e(this.f207424a, bud0Var instanceof v3f ? new C22377a((v3f) bud0Var) : new C22378b(bud0Var)));
    }
}
