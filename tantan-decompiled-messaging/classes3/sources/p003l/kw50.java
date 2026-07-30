package p003l;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import l.jwm;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class kw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f5089a;

    /* JADX INFO: renamed from: b */
    public final bud0 f5090b;

    /* JADX INFO: renamed from: c */
    public final int f5091c;

    /* JADX INFO: renamed from: l.kw50$a */
    public class C0390a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0391b f5092a;

        public C0390a(C0391b c0391b) {
            this.f5092a = c0391b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f5092a.m5865h(j);
        }
    }

    /* JADX INFO: renamed from: l.kw50$b */
    public static final class C0391b<T> extends z3g0<T> implements w9j<Object, T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f5094e;

        /* JADX INFO: renamed from: f */
        public final long f5095f;

        /* JADX INFO: renamed from: g */
        public final bud0 f5096g;

        /* JADX INFO: renamed from: h */
        public final int f5097h;

        /* JADX INFO: renamed from: i */
        public final AtomicLong f5098i = new AtomicLong();

        /* JADX INFO: renamed from: j */
        public final ArrayDeque<Object> f5099j = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public final ArrayDeque<Long> f5100k = new ArrayDeque<>();

        /* JADX INFO: renamed from: l */
        public final NotificationLite<T> f5101l = NotificationLite.m9792f();

        public C0391b(z3g0<? super T> z3g0Var, int i, long j, bud0 bud0Var) {
            this.f5094e = z3g0Var;
            this.f5097h = i;
            this.f5095f = j;
            this.f5096g = bud0Var;
        }

        @Override // p003l.w9j
        public T call(Object obj) {
            return this.f5101l.m9797e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m5864g(long j) {
            long j2 = j - this.f5095f;
            while (true) {
                Long lPeek = this.f5100k.peek();
                if (lPeek == null || lPeek.longValue() >= j2) {
                    return;
                }
                this.f5099j.poll();
                this.f5100k.poll();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m5865h(long j) {
            kc2.m5646h(this.f5098i, j, this.f5099j, this.f5094e, this);
        }

        @Override // p003l.m250
        public void onCompleted() {
            m5864g(this.f5096g.now());
            this.f5100k.clear();
            kc2.m5643e(this.f5098i, this.f5099j, this.f5094e, this);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5099j.clear();
            this.f5100k.clear();
            this.f5094e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f5097h != 0) {
                long jNow = this.f5096g.now();
                if (this.f5099j.size() == this.f5097h) {
                    this.f5099j.poll();
                    this.f5100k.poll();
                }
                m5864g(jNow);
                this.f5099j.offer(this.f5101l.m9801j(t));
                this.f5100k.offer(Long.valueOf(jNow));
            }
        }
    }

    public kw50(int i, long j, TimeUnit timeUnit, bud0 bud0Var) {
        if (i < 0) {
            jwm.a("count could not be negative");
            throw null;
        }
        this.f5089a = timeUnit.toMillis(j);
        this.f5090b = bud0Var;
        this.f5091c = i;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0391b c0391b = new C0391b(z3g0Var, this.f5091c, this.f5089a, this.f5090b);
        z3g0Var.m9240b(c0391b);
        z3g0Var.mo3257f(new C0390a(c0391b));
        return c0391b;
    }

    public kw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f5089a = timeUnit.toMillis(j);
        this.f5090b = bud0Var;
        this.f5091c = -1;
    }
}
