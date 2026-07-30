package p003l;

import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class qw50<T> implements C1099c.c<nqi0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f6715a;

    /* JADX INFO: renamed from: l.qw50$a */
    public class C0495a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public long f6716e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f6717f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0495a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f6717f = z3g0Var2;
            this.f6716e = qw50.this.f6715a.now();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f6717f.onCompleted();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f6717f.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            long jNow = qw50.this.f6715a.now();
            this.f6717f.onNext(new nqi0(jNow - this.f6716e, t));
            this.f6716e = jNow;
        }
    }

    public qw50(bud0 bud0Var) {
        this.f6715a = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super nqi0<T>> z3g0Var) {
        return new C0495a(z3g0Var, z3g0Var);
    }
}
