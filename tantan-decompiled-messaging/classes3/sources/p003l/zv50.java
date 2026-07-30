package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class zv50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f9449a;

    /* JADX INFO: renamed from: l.zv50$a */
    public class C0680a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f9450e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f9451f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0680a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f9451f = z3g0Var2;
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            this.f9451f.mo3257f(rc90Var);
            rc90Var.request(zv50.this.f9449a);
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f9451f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f9451f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            int i = this.f9450e;
            if (i >= zv50.this.f9449a) {
                this.f9451f.onNext(t);
            } else {
                this.f9450e = i + 1;
            }
        }
    }

    public zv50(int i) {
        if (i >= 0) {
            this.f9449a = i;
        } else {
            k250.m5546a("n >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C0680a(z3g0Var, z3g0Var);
    }
}
