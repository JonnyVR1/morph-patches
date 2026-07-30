package p149l;

import java.util.concurrent.atomic.AtomicLong;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class iw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f115225a;

    /* JADX INFO: renamed from: l.iw50$a */
    public class C17634a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f115226e;

        /* JADX INFO: renamed from: f */
        public boolean f115227f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f115228g;

        /* JADX INFO: renamed from: l.iw50$a$a */
        public class a implements rc90 {

            /* JADX INFO: renamed from: a */
            public final AtomicLong f115230a = new AtomicLong(0);

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rc90 f115231b;

            public a(rc90 rc90Var) {
                this.f115231b = rc90Var;
            }

            @Override // p149l.rc90
            public void request(long j) {
                long j2;
                long jMin;
                if (j <= 0 || C17634a.this.f115227f) {
                    return;
                }
                do {
                    j2 = this.f115230a.get();
                    jMin = Math.min(j, ((long) iw50.this.f115225a) - j2);
                    if (jMin == 0) {
                        return;
                    }
                } while (!this.f115230a.compareAndSet(j2, j2 + jMin));
                this.f115231b.request(jMin);
            }
        }

        public C17634a(z3g0 z3g0Var) {
            this.f115228g = z3g0Var;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f115228g.mo106696f(new a(rc90Var));
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f115227f) {
                return;
            }
            this.f115227f = true;
            this.f115228g.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            if (this.f115227f) {
                return;
            }
            this.f115227f = true;
            try {
                this.f115228g.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.f115226e;
            int i2 = i + 1;
            this.f115226e = i2;
            int i3 = iw50.this.f115225a;
            if (i < i3) {
                boolean z = i2 == i3;
                this.f115228g.onNext(t);
                if (!z || this.f115227f) {
                    return;
                }
                this.f115227f = true;
                try {
                    this.f115228g.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public iw50(int i) {
        if (i >= 0) {
            this.f115225a = i;
        } else {
            k250.m144273a("limit >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C17634a c17634a = new C17634a(z3g0Var);
        if (this.f115225a == 0) {
            z3g0Var.onCompleted();
            c17634a.unsubscribe();
        }
        z3g0Var.m217046b(c17634a);
        return c17634a;
    }
}
