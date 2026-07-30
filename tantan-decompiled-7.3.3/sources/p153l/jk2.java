package p153l;

import com.google.protobuf.InterfaceC3442q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jk2<P extends InterfaceC3442q, T> extends mq2<P> {

    /* JADX INFO: renamed from: f */
    public T f121260f;

    /* JADX INFO: renamed from: g */
    public wbg0<T, T> f121261g;

    public jk2(wbg0<T, T> wbg0Var, zod zodVar) {
        super(zodVar);
        this.f121261g = wbg0Var;
        this.f137993c = zodVar;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public jk2 mo145146y(String str, InterfaceC3442q interfaceC3442q, String str2) {
        super.mo145146y(str, interfaceC3442q, str2);
        if (this.f137992b.booleanValue()) {
            this.f121260f = mo95993z(str, interfaceC3442q);
        }
        return this;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: v */
    public void mo145145v() {
        T t;
        wbg0<T, T> wbg0Var;
        super.mo145145v();
        if (this.f137992b.booleanValue() && (t = this.f121260f) != null && (wbg0Var = this.f121261g) != null) {
            wbg0Var.onNext(t);
        }
        this.f121260f = null;
    }

    /* JADX INFO: renamed from: z */
    public abstract T mo95993z(String str, P p);
}
