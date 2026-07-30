package p149l;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;
import p133rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes3.dex */
public final class jw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f120046a;

    /* JADX INFO: renamed from: l.jw50$a */
    public class C17879a implements rc90 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C17880b f120047a;

        public C17879a(C17880b c17880b) {
            this.f120047a = c17880b;
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f120047a.m143649g(j);
        }
    }

    /* JADX INFO: renamed from: l.jw50$b */
    public static final class C17880b<T> extends z3g0<T> implements w9j<Object, T> {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f120049e;

        /* JADX INFO: renamed from: h */
        public final int f120052h;

        /* JADX INFO: renamed from: f */
        public final AtomicLong f120050f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        public final ArrayDeque<Object> f120051g = new ArrayDeque<>();

        /* JADX INFO: renamed from: i */
        public final NotificationLite<T> f120053i = NotificationLite.m221335f();

        public C17880b(z3g0<? super T> z3g0Var, int i) {
            this.f120049e = z3g0Var;
            this.f120052h = i;
        }

        @Override // p149l.w9j
        public T call(Object obj) {
            return this.f120053i.m221340e(obj);
        }

        /* JADX INFO: renamed from: g */
        public void m143649g(long j) {
            if (j > 0) {
                kc2.m145342h(this.f120050f, j, this.f120051g, this.f120049e, this);
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
            kc2.m145339e(this.f120050f, this.f120051g, this.f120049e, this);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f120051g.clear();
            this.f120049e.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f120051g.size() == this.f120052h) {
                this.f120051g.poll();
            }
            this.f120051g.offer(this.f120053i.m221344j(t));
        }
    }

    public jw50(int i) {
        if (i >= 0) {
            this.f120046a = i;
        } else {
            jwm.m143661a("count cannot be negative");
            throw null;
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C17880b c17880b = new C17880b(z3g0Var, this.f120046a);
        z3g0Var.m217046b(c17880b);
        z3g0Var.mo106696f(new C17879a(c17880b));
        return c17880b;
    }
}
