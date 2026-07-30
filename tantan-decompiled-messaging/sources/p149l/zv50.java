package p149l;

import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class zv50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final int f204965a;

    /* JADX INFO: renamed from: l.zv50$a */
    public class C21783a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public int f204966e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f204967f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21783a(z3g0 z3g0Var, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f204967f = z3g0Var2;
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            this.f204967f.mo106696f(rc90Var);
            rc90Var.request(zv50.this.f204965a);
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f204967f.onCompleted();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f204967f.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            int i = this.f204966e;
            if (i >= zv50.this.f204965a) {
                this.f204967f.onNext(t);
            } else {
                this.f204966e = i + 1;
            }
        }
    }

    public zv50(int i) {
        if (i >= 0) {
            this.f204965a = i;
        } else {
            k250.m144273a("n >= 0 required but it was ", i);
            throw null;
        }
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        return new C21783a(z3g0Var, z3g0Var);
    }
}
