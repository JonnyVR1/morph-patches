package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class eqv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f95400a;

    /* JADX INFO: renamed from: b */
    public final muu0 f95401b;

    /* JADX INFO: renamed from: c */
    public final String f95402c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f95403d;

    public eqv0(xvw0 xvw0Var, muu0 muu0Var, o7w0 o7w0Var, String str) {
        this.f95400a = xvw0Var;
        this.f95401b = muu0Var;
        this.f95403d = o7w0Var;
        this.f95402c = str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fqv0 m122067a() throws Exception {
        o7w0 o7w0Var = this.f95403d;
        muu0 muu0Var = this.f95401b;
        return new fqv0(muu0Var.m160245b(o7w0Var.f145320f, this.f95402c), muu0Var.m160244a());
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 17;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f95400a.mo155969R(new Callable() { // from class: l.dqv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f90297a.m122067a();
            }
        });
    }
}
