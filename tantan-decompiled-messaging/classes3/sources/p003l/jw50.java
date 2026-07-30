package p003l;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import l.jwm;
import p014rx.C1099c;
import p014rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f4746a;

    /* JADX INFO: renamed from: l.jw50$a */
    public class C0357a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0358b f4747a;

        public C0357a(C0358b c0358b) {
            this.f4747a = c0358b;
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f4747a.m5448g(j);
        }
    }

    /* JADX INFO: renamed from: l.jw50$b */
    public static final class C0358b<T> extends z3g0<T> implements w9j<Object, T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f4749e;

        /* JADX INFO: renamed from: h */
        public final int f4752h;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f4750f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final ArrayDeque<Object> f4751g = new ArrayDeque<>();

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f4753i = NotificationLite.m9792f();

        public C0358b(z3g0<? super T> z3g0Var, int i) {
            this.f4749e = z3g0Var;
            this.f4752h = i;
        }

        @Override // p003l.w9j
        public T call(Object obj) {
            return this.f4753i.m9797e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m5448g(long j) {
            if (j > 0) {
                kc2.m5646h(this.f4750f, j, this.f4751g, this.f4749e, this);
            }
        }

        @Override // p003l.m250
        public void onCompleted() {
            kc2.m5643e(this.f4750f, this.f4751g, this.f4749e, this);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f4751g.clear();
            this.f4749e.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f4751g.size() == this.f4752h) {
                this.f4751g.poll();
            }
            this.f4751g.offer(this.f4753i.m9801j(t));
        }
    }

    public jw50(int i) {
        if (i >= 0) {
            this.f4746a = i;
        } else {
            jwm.a("count cannot be negative");
            throw null;
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0358b c0358b = new C0358b(z3g0Var, this.f4746a);
        z3g0Var.m9240b(c0358b);
        z3g0Var.mo3257f(new C0357a(c0358b));
        return c0358b;
    }
}
