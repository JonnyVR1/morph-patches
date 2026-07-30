package p153l;

import java.util.concurrent.atomic.AtomicLong;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class o460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f144939a;

    /* JADX INFO: renamed from: l.o460$a */
    public class C19031a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public int f144940e;

        /* JADX INFO: renamed from: f */
        public boolean f144941f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f144942g;

        /* JADX INFO: renamed from: l.o460$a$a */
        public class a implements vk90 {

            /* JADX INFO: renamed from: a */
            public final AtomicLong f144944a = new AtomicLong(0);

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vk90 f144945b;

            public a(vk90 vk90Var) {
                this.f144945b = vk90Var;
            }

            @Override // p153l.vk90
            public void request(long j) {
                long j2;
                long jMin;
                if (j <= 0 || C19031a.this.f144941f) {
                    return;
                }
                do {
                    j2 = this.f144944a.get();
                    jMin = Math.min(j, ((long) o460.this.f144939a) - j2);
                    if (jMin == 0) {
                        return;
                    }
                } while (!this.f144944a.compareAndSet(j2, j2 + jMin));
                this.f144945b.request(jMin);
            }
        }

        public C19031a(gcg0 gcg0Var) {
            this.f144942g = gcg0Var;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            this.f144942g.mo95773f(new a(vk90Var));
        }

        @Override // p153l.bb50
        public void onCompleted() {
            if (this.f144941f) {
                return;
            }
            this.f144941f = true;
            this.f144942g.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            if (this.f144941f) {
                return;
            }
            this.f144941f = true;
            try {
                this.f144942g.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.f144940e;
            int i2 = i + 1;
            this.f144940e = i2;
            int i3 = o460.this.f144939a;
            if (i < i3) {
                boolean z = i2 == i3;
                this.f144942g.onNext(t);
                if (!z || this.f144941f) {
                    return;
                }
                this.f144941f = true;
                try {
                    this.f144942g.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public o460(int i) {
        if (i >= 0) {
            this.f144939a = i;
        } else {
            za50.m219101a("limit >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        C19031a c19031a = new C19031a(gcg0Var);
        if (this.f144939a == 0) {
            gcg0Var.onCompleted();
            c19031a.unsubscribe();
        }
        gcg0Var.m129866b(c19031a);
        return c19031a;
    }
}
