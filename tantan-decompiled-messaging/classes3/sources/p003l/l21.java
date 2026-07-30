package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.qkq0;
import p014rx.C1099c;
import p014rx.internal.operators.BufferUntilSubscriber;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class l21<S, T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: l.l21$a */
    public class C0399a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f5170e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0401c f5171f;

        public C0399a(z3g0 z3g0Var, C0401c c0401c) {
            this.f5170e = z3g0Var;
            this.f5171f = c0401c;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f5171f.m5965f(rc90Var);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5170e.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5170e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5170e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.l21$b */
    public class C0400b implements w9j<C1099c<T>, C1099c<T>> {
        public C0400b() {
        }

        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1099c<T> call(C1099c<T> c1099c) {
            return c1099c.onBackpressureBuffer();
        }
    }

    /* JADX INFO: renamed from: l.l21$c */
    public static final class C0401c<S, T> implements rc90, c4g0, m250<C1099c<? extends T>> {

        /* JADX INFO: renamed from: b */
        public final l21<S, T> f5175b;

        /* JADX INFO: renamed from: e */
        public boolean f5178e;

        /* JADX INFO: renamed from: f */
        public boolean f5179f;

        /* JADX INFO: renamed from: g */
        public S f5180g;

        /* JADX INFO: renamed from: h */
        public final C0402d<C1099c<T>> f5181h;

        /* JADX INFO: renamed from: i */
        public boolean f5182i;

        /* JADX INFO: renamed from: j */
        public List<Long> f5183j;

        /* JADX INFO: renamed from: k */
        public rc90 f5184k;

        /* JADX INFO: renamed from: l */
        public long f5185l;

        /* JADX INFO: renamed from: d */
        public final bs5 f5177d = new bs5();

        /* JADX INFO: renamed from: c */
        public final tie0<C1099c<? extends T>> f5176c = new tie0<>(this);

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f5174a = new AtomicBoolean();

        /* JADX INFO: renamed from: l.l21$c$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public long f5186e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ long f5187f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ BufferUntilSubscriber f5188g;

            public a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.f5187f = j;
                this.f5188g = bufferUntilSubscriber;
                this.f5186e = j;
            }

            @Override // p003l.m250
            public void onCompleted() {
                this.f5188g.onCompleted();
                long j = this.f5186e;
                if (j > 0) {
                    C0401c.this.m5964e(j);
                }
            }

            @Override // p003l.m250
            public void onError(Throwable th) {
                this.f5188g.onError(th);
            }

            @Override // p003l.m250
            public void onNext(T t) {
                this.f5186e--;
                this.f5188g.onNext(t);
            }
        }

        /* JADX INFO: renamed from: l.l21$c$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f5190a;

            public b(z3g0 z3g0Var) {
                this.f5190a = z3g0Var;
            }

            @Override // p003l.d30
            public void call() {
                C0401c.this.f5177d.m3167d(this.f5190a);
            }
        }

        public C0401c(l21<S, T> l21Var, S s, C0402d<C1099c<T>> c0402d) {
            this.f5175b = l21Var;
            this.f5180g = s;
            this.f5181h = c0402d;
        }

        /* JADX INFO: renamed from: a */
        public void m5960a() {
            this.f5177d.unsubscribe();
            try {
                this.f5175b.m5958d(this.f5180g);
            } catch (Throwable th) {
                m5961b(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m5961b(Throwable th) {
            if (this.f5178e) {
                ejd0.m3864j(th);
                return;
            }
            this.f5178e = true;
            this.f5181h.onError(th);
            m5960a();
        }

        /* JADX INFO: renamed from: c */
        public void m5962c(long j) {
            this.f5180g = this.f5175b.m5957c(this.f5180g, j, this.f5176c);
        }

        @Override // p003l.m250
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(C1099c<? extends T> c1099c) {
            if (this.f5179f) {
                qkq0.a("onNext called multiple times!");
                return;
            }
            this.f5179f = true;
            if (this.f5178e) {
                return;
            }
            m5966g(c1099c);
        }

        /* JADX INFO: renamed from: e */
        public void m5964e(long j) {
            if (j == 0) {
                return;
            }
            if (j < 0) {
                jc2.m5313a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    if (this.f5182i) {
                        List arrayList = this.f5183j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f5183j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                        return;
                    }
                    this.f5182i = true;
                    if (m5967h(j)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            try {
                                List<Long> list = this.f5183j;
                                if (list == null) {
                                    this.f5182i = false;
                                    return;
                                }
                                this.f5183j = null;
                                Iterator<Long> it = list.iterator();
                                while (it.hasNext()) {
                                    if (m5967h(it.next().longValue())) {
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
        public void m5965f(rc90 rc90Var) {
            if (this.f5184k == null) {
                this.f5184k = rc90Var;
            } else {
                qkq0.a("setConcatProducer may be called at most once!");
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m5966g(C1099c<? extends T> c1099c) {
            BufferUntilSubscriber bufferUntilSubscriberM9783b = BufferUntilSubscriber.m9783b();
            a aVar = new a(this.f5185l, bufferUntilSubscriberM9783b);
            this.f5177d.m3164a(aVar);
            c1099c.doOnTerminate(new b(aVar)).subscribe((z3g0<? super Object>) aVar);
            this.f5181h.onNext(bufferUntilSubscriberM9783b);
        }

        /* JADX INFO: renamed from: h */
        public boolean m5967h(long j) {
            if (isUnsubscribed()) {
                m5960a();
                return true;
            }
            try {
                this.f5179f = false;
                this.f5185l = j;
                m5962c(j);
                if (!this.f5178e && !isUnsubscribed()) {
                    if (this.f5179f) {
                        return false;
                    }
                    m5961b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                m5960a();
                return true;
            } catch (Throwable th) {
                m5961b(th);
                return true;
            }
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f5174a.get();
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f5178e) {
                qkq0.a("Terminal event already emitted.");
            } else {
                this.f5178e = true;
                this.f5181h.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f5178e) {
                qkq0.a("Terminal event already emitted.");
            } else {
                this.f5178e = true;
                this.f5181h.onError(th);
            }
        }

        @Override // p003l.rc90
        public void request(long j) {
            boolean z;
            if (j == 0) {
                return;
            }
            if (j < 0) {
                jc2.m5313a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    z = true;
                    if (this.f5182i) {
                        List arrayList = this.f5183j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f5183j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                    } else {
                        this.f5182i = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5184k.request(j);
            if (z || m5967h(j)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    try {
                        List<Long> list = this.f5183j;
                        if (list == null) {
                            this.f5182i = false;
                            return;
                        }
                        this.f5183j = null;
                        Iterator<Long> it = list.iterator();
                        while (it.hasNext()) {
                            if (m5967h(it.next().longValue())) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (this.f5174a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (!this.f5182i) {
                            this.f5182i = true;
                            m5960a();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            this.f5183j = arrayList;
                            arrayList.add(0L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.l21$d */
    public static final class C0402d<T> extends C1099c<T> implements m250<T> {

        /* JADX INFO: renamed from: a */
        public final a<T> f5192a;

        /* JADX INFO: renamed from: l.l21$d$a */
        public static final class a<T> implements C1099c.a<T> {

            /* JADX INFO: renamed from: a */
            public z3g0<? super T> f5193a;

            @Override // p003l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(z3g0<? super T> z3g0Var) {
                synchronized (this) {
                    try {
                        if (this.f5193a == null) {
                            this.f5193a = z3g0Var;
                        } else {
                            z3g0Var.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C0402d(a<T> aVar) {
            super(aVar);
            this.f5192a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public static <T> C0402d<T> m5968a() {
            return new C0402d<>(new a());
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5192a.f5193a.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5192a.f5193a.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5192a.f5193a.onNext(t);
        }
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(z3g0<? super T> z3g0Var) {
        try {
            S sM5956b = m5956b();
            C0402d c0402dM5968a = C0402d.m5968a();
            C0401c c0401c = new C0401c(this, sM5956b, c0402dM5968a);
            C0399a c0399a = new C0399a(z3g0Var, c0401c);
            c0402dM5968a.onBackpressureBuffer().concatMap(new C0400b()).unsafeSubscribe(c0399a);
            z3g0Var.m9240b(c0399a);
            z3g0Var.m9240b(c0401c);
            z3g0Var.mo3257f(c0401c);
        } catch (Throwable th) {
            z3g0Var.onError(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract S m5956b();

    /* JADX INFO: renamed from: c */
    public abstract S m5957c(S s, long j, m250<C1099c<? extends T>> m250Var);

    /* JADX INFO: renamed from: d */
    public void m5958d(S s) {
    }
}
