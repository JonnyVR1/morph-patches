package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class mnv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f137738a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f137739b;

    /* JADX INFO: renamed from: c */
    public final c8w0 f137740c;

    public mnv0(xvw0 xvw0Var, o7w0 o7w0Var, c8w0 c8w0Var) {
        this.f137738a = xvw0Var;
        this.f137739b = o7w0Var;
        this.f137740c = c8w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nnv0 m159205a() throws Exception {
        String strM108383a = null;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168339i7)).booleanValue() && "requester_type_2".equals(qyv0.m178751b(this.f137739b.f145318d))) {
            strM108383a = c8w0.m108383a();
        }
        return new nnv0(strM108383a);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 5;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f137738a.mo155969R(new Callable() { // from class: l.lnv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f132843a.m159205a();
            }
        });
    }
}
