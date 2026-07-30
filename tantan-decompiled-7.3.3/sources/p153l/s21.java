package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;
import p137rx.internal.operators.BufferUntilSubscriber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s21<S, T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: l.s21$a */
    public class C19956a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gcg0 f165826e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C19958c f165827f;

        public C19956a(gcg0 gcg0Var, C19958c c19958c) {
            this.f165826e = gcg0Var;
            this.f165827f = c19958c;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f165827f.m184103f(vk90Var);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f165826e.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f165826e.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f165826e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.s21$b */
    public class C19957b implements qcj<C22421c<T>, C22421c<T>> {
        public C19957b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<T> call(C22421c<T> c22421c) {
            return c22421c.onBackpressureBuffer();
        }
    }

    /* JADX INFO: renamed from: l.s21$c */
    public static final class C19958c<S, T> implements vk90, kcg0, bb50<C22421c<? extends T>> {

        /* JADX INFO: renamed from: b */
        public final s21<S, T> f165831b;

        /* JADX INFO: renamed from: e */
        public boolean f165834e;

        /* JADX INFO: renamed from: f */
        public boolean f165835f;

        /* JADX INFO: renamed from: g */
        public S f165836g;

        /* JADX INFO: renamed from: h */
        public final C19959d<C22421c<T>> f165837h;

        /* JADX INFO: renamed from: i */
        public boolean f165838i;

        /* JADX INFO: renamed from: j */
        public List<Long> f165839j;

        /* JADX INFO: renamed from: k */
        public vk90 f165840k;

        /* JADX INFO: renamed from: l */
        public long f165841l;

        /* JADX INFO: renamed from: d */
        public final ft5 f165833d = new ft5();

        /* JADX INFO: renamed from: c */
        public final yqe0<C22421c<? extends T>> f165832c = new yqe0<>(this);

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f165830a = new AtomicBoolean();

        /* JADX INFO: renamed from: l.s21$c$a */
        public class a extends gcg0<T> {

            /* JADX INFO: renamed from: e */
            public long f165842e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ long f165843f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ BufferUntilSubscriber f165844g;

            public a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.f165843f = j;
                this.f165844g = bufferUntilSubscriber;
                this.f165842e = j;
            }

            @Override // p153l.bb50
            public void onCompleted() {
                this.f165844g.onCompleted();
                long j = this.f165842e;
                if (j > 0) {
                    C19958c.this.m184102e(j);
                }
            }

            @Override // p153l.bb50
            public void onError(Throwable th) {
                this.f165844g.onError(th);
            }

            @Override // p153l.bb50
            public void onNext(T t) {
                this.f165842e--;
                this.f165844g.onNext(t);
            }
        }

        /* JADX INFO: renamed from: l.s21$c$b */
        public class b implements x20 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ gcg0 f165846a;

            public b(gcg0 gcg0Var) {
                this.f165846a = gcg0Var;
            }

            @Override // p153l.x20
            public void call() {
                C19958c.this.f165833d.m127300d(this.f165846a);
            }
        }

        public C19958c(s21<S, T> s21Var, S s, C19959d<C22421c<T>> c19959d) {
            this.f165831b = s21Var;
            this.f165836g = s;
            this.f165837h = c19959d;
        }

        /* JADX INFO: renamed from: a */
        public void m184098a() {
            this.f165833d.unsubscribe();
            try {
                this.f165831b.m184096d(this.f165836g);
            } catch (Throwable th) {
                m184099b(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m184099b(Throwable th) {
            if (this.f165834e) {
                hrd0.m136792j(th);
                return;
            }
            this.f165834e = true;
            this.f165837h.onError(th);
            m184098a();
        }

        /* JADX INFO: renamed from: c */
        public void m184100c(long j) {
            this.f165836g = this.f165831b.m184095c(this.f165836g, j, this.f165832c);
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(C22421c<? extends T> c22421c) {
            if (this.f165835f) {
                wtq0.m207906a("onNext called multiple times!");
                return;
            }
            this.f165835f = true;
            if (this.f165834e) {
                return;
            }
            m184104g(c22421c);
        }

        /* JADX INFO: renamed from: e */
        public void m184102e(long j) {
            if (j == 0) {
                return;
            }
            if (j < 0) {
                qc2.m176107a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    if (this.f165838i) {
                        List arrayList = this.f165839j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f165839j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                        return;
                    }
                    this.f165838i = true;
                    if (m184105h(j)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            try {
                                List<Long> list = this.f165839j;
                                if (list == null) {
                                    this.f165838i = false;
                                    return;
                                }
                                this.f165839j = null;
                                Iterator<Long> it = list.iterator();
                                while (it.hasNext()) {
                                    if (m184105h(it.next().longValue())) {
                                        return;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m184103f(vk90 vk90Var) {
            if (this.f165840k == null) {
                this.f165840k = vk90Var;
            } else {
                wtq0.m207906a("setConcatProducer may be called at most once!");
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m184104g(C22421c<? extends T> c22421c) {
            BufferUntilSubscriber bufferUntilSubscriberM222572b = BufferUntilSubscriber.m222572b();
            a aVar = new a(this.f165841l, bufferUntilSubscriberM222572b);
            this.f165833d.m127297a(aVar);
            c22421c.doOnTerminate(new b(aVar)).subscribe((gcg0<? super Object>) aVar);
            this.f165837h.onNext(bufferUntilSubscriberM222572b);
        }

        /* JADX INFO: renamed from: h */
        public boolean m184105h(long j) {
            if (isUnsubscribed()) {
                m184098a();
                return true;
            }
            try {
                this.f165835f = false;
                this.f165841l = j;
                m184100c(j);
                if (!this.f165834e && !isUnsubscribed()) {
                    if (this.f165835f) {
                        return false;
                    }
                    m184099b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                m184098a();
                return true;
            } catch (Throwable th) {
                m184099b(th);
                return true;
            }
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f165830a.get();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f165834e) {
                wtq0.m207906a("Terminal event already emitted.");
            } else {
                this.f165834e = true;
                this.f165837h.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f165834e) {
                wtq0.m207906a("Terminal event already emitted.");
            } else {
                this.f165834e = true;
                this.f165837h.onError(th);
            }
        }

        @Override // p153l.vk90
        public void request(long j) {
            boolean z;
            if (j == 0) {
                return;
            }
            if (j < 0) {
                qc2.m176107a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    z = true;
                    if (this.f165838i) {
                        List arrayList = this.f165839j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f165839j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                    } else {
                        this.f165838i = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f165840k.request(j);
            if (z || m184105h(j)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    try {
                        List<Long> list = this.f165839j;
                        if (list == null) {
                            this.f165838i = false;
                            return;
                        }
                        this.f165839j = null;
                        Iterator<Long> it = list.iterator();
                        while (it.hasNext()) {
                            if (m184105h(it.next().longValue())) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (this.f165830a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (!this.f165838i) {
                            this.f165838i = true;
                            m184098a();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            this.f165839j = arrayList;
                            arrayList.add(0L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.s21$d */
    public static final class C19959d<T> extends C22421c<T> implements bb50<T> {

        /* JADX INFO: renamed from: a */
        public final a<T> f165848a;

        /* JADX INFO: renamed from: l.s21$d$a */
        public static final class a<T> implements C22421c.a<T> {

            /* JADX INFO: renamed from: a */
            public gcg0<? super T> f165849a;

            @Override // p153l.y20
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(gcg0<? super T> gcg0Var) {
                synchronized (this) {
                    try {
                        if (this.f165849a == null) {
                            this.f165849a = gcg0Var;
                        } else {
                            gcg0Var.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C19959d(a<T> aVar) {
            super(aVar);
            this.f165848a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public static <T> C19959d<T> m184106a() {
            return new C19959d<>(new a());
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f165848a.f165849a.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f165848a.f165849a.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f165848a.f165849a.onNext(t);
        }
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(gcg0<? super T> gcg0Var) {
        try {
            S sM184094b = m184094b();
            C19959d c19959dM184106a = C19959d.m184106a();
            C19958c c19958c = new C19958c(this, sM184094b, c19959dM184106a);
            C19956a c19956a = new C19956a(gcg0Var, c19958c);
            c19959dM184106a.onBackpressureBuffer().concatMap(new C19957b()).unsafeSubscribe(c19956a);
            gcg0Var.m129866b(c19956a);
            gcg0Var.m129866b(c19958c);
            gcg0Var.mo95773f(c19958c);
        } catch (Throwable th) {
            gcg0Var.onError(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract S m184094b();

    /* JADX INFO: renamed from: c */
    public abstract S m184095c(S s, long j, bb50<C22421c<? extends T>> bb50Var);

    /* JADX INFO: renamed from: d */
    public void m184096d(S s) {
    }
}
