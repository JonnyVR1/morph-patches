package p149l;

import com.google.protobuf.InterfaceC3419q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bk2<P extends InterfaceC3419q, T> extends vp2<P> {

    /* JADX INFO: renamed from: f */
    public T f75961f;

    /* JADX INFO: renamed from: g */
    public p3g0<T, T> f75962g;

    public bk2(p3g0<T, T> p3g0Var, und undVar) {
        super(undVar);
        this.f75962g = p3g0Var;
        this.f182445c = undVar;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public bk2 mo102260y(String str, InterfaceC3419q interfaceC3419q, String str2) {
        super.mo102260y(str, interfaceC3419q, str2);
        if (this.f182444b.booleanValue()) {
            this.f75961f = mo94461z(str, interfaceC3419q);
        }
        return this;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: v */
    public void mo102259v() {
        T t;
        p3g0<T, T> p3g0Var;
        super.mo102259v();
        if (this.f182444b.booleanValue() && (t = this.f75961f) != null && (p3g0Var = this.f75962g) != null) {
            p3g0Var.onNext(t);
        }
        this.f75961f = null;
    }

    /* JADX INFO: renamed from: z */
    public abstract T mo94461z(String str, P p);
}
