package p137rx.internal.util;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p137rx.internal.producers.SingleProducer;
import p153l.f2e0;
import p153l.fcg0;
import p153l.gcg0;
import p153l.hrd0;
import p153l.icg0;
import p153l.j6f;
import p153l.kcg0;
import p153l.qc2;
import p153l.qcj;
import p153l.vk90;
import p153l.x20;
import p153l.z4f;

/* JADX INFO: loaded from: classes3.dex */
public final class ScalarSynchronousObservable<T> extends C22421c<T> {

    /* JADX INFO: renamed from: b */
    public static final boolean f208345b = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* JADX INFO: renamed from: a */
    public final T f208346a;

    public static final class ScalarAsyncProducer<T> extends AtomicBoolean implements vk90, x20 {
        private static final long serialVersionUID = -2466317989629281651L;
        final gcg0<? super T> actual;
        final qcj<x20, kcg0> onSchedule;
        final T value;

        public ScalarAsyncProducer(gcg0<? super T> gcg0Var, T t, qcj<x20, kcg0> qcjVar) {
            this.actual = gcg0Var;
            this.value = t;
            this.onSchedule = qcjVar;
        }

        @Override // p153l.x20
        public void call() {
            gcg0<? super T> gcg0Var = this.actual;
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            T t = this.value;
            try {
                gcg0Var.onNext(t);
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                gcg0Var.onCompleted();
            } catch (Throwable th) {
                j6f.m143665g(th, gcg0Var, t);
            }
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
            } else {
                if (j == 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.actual.m129866b(this.onSchedule.call(this));
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$a */
    public class C22492a implements qcj<x20, kcg0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z4f f208347a;

        public C22492a(z4f z4fVar) {
            this.f208347a = z4fVar;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kcg0 call(x20 x20Var) {
            return this.f208347a.m218580a(x20Var);
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b */
    public class C22493b implements qcj<x20, kcg0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f2e0 f208349a;

        /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$b$a */
        public class a implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x20 f208351a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ f2e0.AbstractC16877a f208352b;

            public a(x20 x20Var, f2e0.AbstractC16877a abstractC16877a) {
                this.f208351a = x20Var;
                this.f208352b = abstractC16877a;
            }

            @Override // p153l.x20
            public void call() {
                try {
                    this.f208351a.call();
                } finally {
                    this.f208352b.unsubscribe();
                }
            }
        }

        public C22493b(f2e0 f2e0Var) {
            this.f208349a = f2e0Var;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public kcg0 call(x20 x20Var) {
            f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f208349a.createWorker();
            abstractC16877aCreateWorker.mo102836b(new a(x20Var, abstractC16877aCreateWorker));
            return abstractC16877aCreateWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$c */
    public class C22494c<R> implements C22421c.a<R> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f208354a;

        public C22494c(qcj qcjVar) {
            this.f208354a = qcjVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super R> gcg0Var) {
            C22421c c22421c = (C22421c) this.f208354a.call(ScalarSynchronousObservable.this.f208346a);
            if (c22421c instanceof ScalarSynchronousObservable) {
                gcg0Var.mo95773f(ScalarSynchronousObservable.m222723b(gcg0Var, ((ScalarSynchronousObservable) c22421c).f208346a));
            } else {
                c22421c.unsafeSubscribe(icg0.m139436c(gcg0Var));
            }
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$d */
    public static final class C22495d<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f208356a;

        public C22495d(T t) {
            this.f208356a = t;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            gcg0Var.mo95773f(ScalarSynchronousObservable.m222723b(gcg0Var, this.f208356a));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$e */
    public static final class C22496e<T> implements C22421c.a<T> {

        /* JADX INFO: renamed from: a */
        public final T f208357a;

        /* JADX INFO: renamed from: b */
        public final qcj<x20, kcg0> f208358b;

        public C22496e(T t, qcj<x20, kcg0> qcjVar) {
            this.f208357a = t;
            this.f208358b = qcjVar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super T> gcg0Var) {
            gcg0Var.mo95773f(new ScalarAsyncProducer(gcg0Var, this.f208357a, this.f208358b));
        }
    }

    /* JADX INFO: renamed from: rx.internal.util.ScalarSynchronousObservable$f */
    public static final class C22497f<T> implements vk90 {

        /* JADX INFO: renamed from: a */
        public final gcg0<? super T> f208359a;

        /* JADX INFO: renamed from: b */
        public final T f208360b;

        /* JADX INFO: renamed from: c */
        public boolean f208361c;

        public C22497f(gcg0<? super T> gcg0Var, T t) {
            this.f208359a = gcg0Var;
            this.f208360b = t;
        }

        @Override // p153l.vk90
        public void request(long j) {
            if (this.f208361c) {
                return;
            }
            if (j < 0) {
                qc2.m176107a("n >= required but it was ", j);
                return;
            }
            if (j == 0) {
                return;
            }
            this.f208361c = true;
            gcg0<? super T> gcg0Var = this.f208359a;
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            T t = this.f208360b;
            try {
                gcg0Var.onNext(t);
                if (gcg0Var.isUnsubscribed()) {
                    return;
                }
                gcg0Var.onCompleted();
            } catch (Throwable th) {
                j6f.m143665g(th, gcg0Var, t);
            }
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(hrd0.m136790h(new C22495d(t)));
        this.f208346a = t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> ScalarSynchronousObservable<T> m222722a(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    /* JADX INFO: renamed from: b */
    public static <T> vk90 m222723b(gcg0<? super T> gcg0Var, T t) {
        return f208345b ? new SingleProducer(gcg0Var, t) : new C22497f(gcg0Var, t);
    }

    /* JADX INFO: renamed from: c */
    public T m222724c() {
        return this.f208346a;
    }

    /* JADX INFO: renamed from: d */
    public <R> C22421c<R> m222725d(qcj<? super T, ? extends C22421c<? extends R>> qcjVar) {
        return C22421c.create(new C22494c(qcjVar));
    }

    /* JADX INFO: renamed from: e */
    public C22421c<T> m222726e(f2e0 f2e0Var) {
        return C22421c.create(new C22496e(this.f208346a, f2e0Var instanceof z4f ? new C22492a((z4f) f2e0Var) : new C22493b(f2e0Var)));
    }
}
