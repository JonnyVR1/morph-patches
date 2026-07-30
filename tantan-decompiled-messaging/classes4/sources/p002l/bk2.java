package p002l;

import com.google.protobuf.q;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class bk2<P extends q, T> extends vp2<P> {

    /* JADX INFO: renamed from: f */
    public T f8193f;

    /* JADX INFO: renamed from: g */
    public p3g0<T, T> f8194g;

    public bk2(p3g0<T, T> p3g0Var, und undVar) {
        super(undVar);
        this.f8194g = p3g0Var;
        this.f21259c = undVar;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public bk2 mo10390y(String str, q qVar, String str2) {
        super.mo10390y(str, qVar, str2);
        if (this.f21258b.booleanValue()) {
            this.f8193f = mo9251z(str, qVar);
        }
        return this;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: v */
    public void mo10389v() {
        T t;
        p3g0<T, T> p3g0Var;
        super.mo10389v();
        if (this.f21258b.booleanValue() && (t = this.f8193f) != null && (p3g0Var = this.f8194g) != null) {
            p3g0Var.onNext(t);
        }
        this.f8193f = null;
    }

    /* JADX INFO: renamed from: z */
    public abstract T mo9251z(String str, P p);
}
