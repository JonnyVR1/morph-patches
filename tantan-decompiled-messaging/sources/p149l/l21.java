package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;
import p133rx.internal.operators.BufferUntilSubscriber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l21<S, T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: l.l21$a */
    public class C18134a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ z3g0 f125703e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C18136c f125704f;

        public C18134a(z3g0 z3g0Var, C18136c c18136c) {
            this.f125703e = z3g0Var;
            this.f125704f = c18136c;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f125704f.m148264f(rc90Var);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f125703e.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f125703e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f125703e.onNext(t);
        }
    }

    /* JADX INFO: renamed from: l.l21$b */
    public class C18135b implements w9j<C22306c<T>, C22306c<T>> {
        public C18135b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<T> call(C22306c<T> c22306c) {
            return c22306c.onBackpressureBuffer();
        }
    }

    /* JADX INFO: renamed from: l.l21$c */
    public static final class C18136c<S, T> implements rc90, c4g0, m250<C22306c<? extends T>> {

        /* JADX INFO: renamed from: b */
        public final l21<S, T> f125708b;

        /* JADX INFO: renamed from: e */
        public boolean f125711e;

        /* JADX INFO: renamed from: f */
        public boolean f125712f;

        /* JADX INFO: renamed from: g */
        public S f125713g;

        /* JADX INFO: renamed from: h */
        public final C18137d<C22306c<T>> f125714h;

        /* JADX INFO: renamed from: i */
        public boolean f125715i;

        /* JADX INFO: renamed from: j */
        public List<Long> f125716j;

        /* JADX INFO: renamed from: k */
        public rc90 f125717k;

        /* JADX INFO: renamed from: l */
        public long f125718l;

        /* JADX INFO: renamed from: d */
        public final bs5 f125710d = new bs5();

        /* JADX INFO: renamed from: c */
        public final tie0<C22306c<? extends T>> f125709c = new tie0<>(this);

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f125707a = new AtomicBoolean();

        /* JADX INFO: renamed from: l.l21$c$a */
        public class a extends z3g0<T> {

            /* JADX INFO: renamed from: e */
            public long f125719e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ long f125720f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ BufferUntilSubscriber f125721g;

            public a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.f125720f = j;
                this.f125721g = bufferUntilSubscriber;
                this.f125719e = j;
            }

            @Override // p149l.m250
            public void onCompleted() {
                this.f125721g.onCompleted();
                long j = this.f125719e;
                if (j > 0) {
                    C18136c.this.m148263e(j);
                }
            }

            @Override // p149l.m250
            public void onError(Throwable th) {
                this.f125721g.onError(th);
            }

            @Override // p149l.m250
            public void onNext(T t) {
                this.f125719e--;
                this.f125721g.onNext(t);
            }
        }

        /* JADX INFO: renamed from: l.l21$c$b */
        public class b implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z3g0 f125723a;

            public b(z3g0 z3g0Var) {
                this.f125723a = z3g0Var;
            }

            @Override // p149l.d30
            public void call() {
                C18136c.this.f125710d.m103658d(this.f125723a);
            }
        }

        public C18136c(l21<S, T> l21Var, S s, C18137d<C22306c<T>> c18137d) {
            this.f125708b = l21Var;
            this.f125713g = s;
            this.f125714h = c18137d;
        }

        /* JADX INFO: renamed from: a */
        public void m148259a() {
            this.f125710d.unsubscribe();
            try {
                this.f125708b.m148257d(this.f125713g);
            } catch (Throwable th) {
                m148260b(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m148260b(Throwable th) {
            if (this.f125711e) {
                ejd0.m116793j(th);
                return;
            }
            this.f125711e = true;
            this.f125714h.onError(th);
            m148259a();
        }

        /* JADX INFO: renamed from: c */
        public void m148261c(long j) {
            this.f125713g = this.f125708b.m148256c(this.f125713g, j, this.f125709c);
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(C22306c<? extends T> c22306c) {
            if (this.f125712f) {
                qkq0.m175383a("onNext called multiple times!");
                return;
            }
            this.f125712f = true;
            if (this.f125711e) {
                return;
            }
            m148265g(c22306c);
        }

        /* JADX INFO: renamed from: e */
        public void m148263e(long j) {
            if (j == 0) {
                return;
            }
            if (j < 0) {
                jc2.m140849a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    if (this.f125715i) {
                        List arrayList = this.f125716j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f125716j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                        return;
                    }
                    this.f125715i = true;
                    if (m148266h(j)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            try {
                                List<Long> list = this.f125716j;
                                if (list == null) {
                                    this.f125715i = false;
                                    return;
                                }
                                this.f125716j = null;
                                Iterator<Long> it = list.iterator();
                                while (it.hasNext()) {
                                    if (m148266h(it.next().longValue())) {
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
        public void m148264f(rc90 rc90Var) {
            if (this.f125717k == null) {
                this.f125717k = rc90Var;
            } else {
                qkq0.m175383a("setConcatProducer may be called at most once!");
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m148265g(C22306c<? extends T> c22306c) {
            BufferUntilSubscriber bufferUntilSubscriberM221326b = BufferUntilSubscriber.m221326b();
            a aVar = new a(this.f125718l, bufferUntilSubscriberM221326b);
            this.f125710d.m103655a(aVar);
            c22306c.doOnTerminate(new b(aVar)).subscribe((z3g0<? super Object>) aVar);
            this.f125714h.onNext(bufferUntilSubscriberM221326b);
        }

        /* JADX INFO: renamed from: h */
        public boolean m148266h(long j) {
            if (isUnsubscribed()) {
                m148259a();
                return true;
            }
            try {
                this.f125712f = false;
                this.f125718l = j;
                m148261c(j);
                if (!this.f125711e && !isUnsubscribed()) {
                    if (this.f125712f) {
                        return false;
                    }
                    m148260b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                m148259a();
                return true;
            } catch (Throwable th) {
                m148260b(th);
                return true;
            }
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f125707a.get();
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f125711e) {
                qkq0.m175383a("Terminal event already emitted.");
            } else {
                this.f125711e = true;
                this.f125714h.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f125711e) {
                qkq0.m175383a("Terminal event already emitted.");
            } else {
                this.f125711e = true;
                this.f125714h.onError(th);
            }
        }

        @Override // p149l.rc90
        public void request(long j) {
            boolean z;
            if (j == 0) {
                return;
            }
            if (j < 0) {
                jc2.m140849a("Request can't be negative! ", j);
                return;
            }
            synchronized (this) {
                try {
                    z = true;
                    if (this.f125715i) {
                        List arrayList = this.f125716j;
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            this.f125716j = arrayList;
                        }
                        arrayList.add(Long.valueOf(j));
                    } else {
                        this.f125715i = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f125717k.request(j);
            if (z || m148266h(j)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    try {
                        List<Long> list = this.f125716j;
                        if (list == null) {
                            this.f125715i = false;
                            return;
                        }
                        this.f125716j = null;
                        Iterator<Long> it = list.iterator();
                        while (it.hasNext()) {
                            if (m148266h(it.next().longValue())) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (this.f125707a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (!this.f125715i) {
                            this.f125715i = true;
                            m148259a();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            this.f125716j = arrayList;
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
    public static final class C18137d<T> extends C22306c<T> implements m250<T> {

        /* JADX INFO: renamed from: a */
        public final a<T> f125725a;

        /* JADX INFO: renamed from: l.l21$d$a */
        public static final class a<T> implements C22306c.a<T> {

            /* JADX INFO: renamed from: a */
            public z3g0<? super T> f125726a;

            @Override // p149l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(z3g0<? super T> z3g0Var) {
                synchronized (this) {
                    try {
                        if (this.f125726a == null) {
                            this.f125726a = z3g0Var;
                        } else {
                            z3g0Var.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C18137d(a<T> aVar) {
            super(aVar);
            this.f125725a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public static <T> C18137d<T> m148267a() {
            return new C18137d<>(new a());
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f125725a.f125726a.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f125725a.f125726a.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f125725a.f125726a.onNext(t);
        }
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(z3g0<? super T> z3g0Var) {
        try {
            S sM148255b = m148255b();
            C18137d c18137dM148267a = C18137d.m148267a();
            C18136c c18136c = new C18136c(this, sM148255b, c18137dM148267a);
            C18134a c18134a = new C18134a(z3g0Var, c18136c);
            c18137dM148267a.onBackpressureBuffer().concatMap(new C18135b()).unsafeSubscribe(c18134a);
            z3g0Var.m217046b(c18134a);
            z3g0Var.m217046b(c18136c);
            z3g0Var.mo106696f(c18136c);
        } catch (Throwable th) {
            z3g0Var.onError(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract S m148255b();

    /* JADX INFO: renamed from: c */
    public abstract S m148256c(S s, long j, m250<C22306c<? extends T>> m250Var);

    /* JADX INFO: renamed from: d */
    public void m148257d(S s) {
    }
}
