package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class qw50<T> implements C22306c.c<nqi0<T>, T> {

    /* JADX INFO: renamed from: a */
    public final bud0 f156656a;

    /* JADX INFO: renamed from: l.qw50$a */
    public class C19596a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public long f156657e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f156658f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19596a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f156658f = z3g0Var2;
            this.f156657e = qw50.this.f156656a.now();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f156658f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f156658f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            long jNow = qw50.this.f156656a.now();
            this.f156658f.onNext(new nqi0(jNow - this.f156657e, t));
            this.f156657e = jNow;
        }
    }

    public qw50(bud0 bud0Var) {
        this.f156656a = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super nqi0<T>> z3g0Var) {
        return new C19596a(z3g0Var, z3g0Var);
    }
}
