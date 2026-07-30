package p003l;

import java.util.concurrent.atomic.AtomicLong;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class iw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f4509a;

    /* JADX INFO: renamed from: l.iw50$a */
    public class C0349a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f4510e;

        /* JADX INFO: renamed from: f */
        public boolean f4511f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f4512g;

        /* JADX INFO: renamed from: l.iw50$a$a */
        public class a implements rc90 {

            /* JADX INFO: renamed from: a */
            public final AtomicLong f4514a = new AtomicLong(0);

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rc90 f4515b;

            public a(rc90 rc90Var) {
                this.f4515b = rc90Var;
            }

            @Override // p003l.rc90
            public void request(long j) {
                long j2;
                long jMin;
                if (j <= 0 || C0349a.this.f4511f) {
                    return;
                }
                do {
                    j2 = this.f4514a.get();
                    jMin = Math.min(j, ((long) iw50.this.f4509a) - j2);
                    if (jMin == 0) {
                        return;
                    }
                } while (!this.f4514a.compareAndSet(j2, j2 + jMin));
                this.f4515b.request(jMin);
            }
        }

        public C0349a(z3g0 z3g0Var) {
            this.f4512g = z3g0Var;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f4512g.mo3257f(new a(rc90Var));
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f4511f) {
                return;
            }
            this.f4511f = true;
            this.f4512g.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            if (this.f4511f) {
                return;
            }
            this.f4511f = true;
            try {
                this.f4512g.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.f4510e;
            int i2 = i + 1;
            this.f4510e = i2;
            int i3 = iw50.this.f4509a;
            if (i < i3) {
                boolean z = i2 == i3;
                this.f4512g.onNext(t);
                if (!z || this.f4511f) {
                    return;
                }
                this.f4511f = true;
                try {
                    this.f4512g.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public iw50(int i) {
        if (i >= 0) {
            this.f4509a = i;
        } else {
            k250.m5546a("limit >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        C0349a c0349a = new C0349a(z3g0Var);
        if (this.f4509a == 0) {
            z3g0Var.onCompleted();
            c0349a.unsubscribe();
        }
        z3g0Var.m9240b(c0349a);
        return c0349a;
    }
}
