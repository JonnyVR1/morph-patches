package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class brv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f78060a;

    public brv0(xvw0 xvw0Var) {
        this.f78060a = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 20;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f78060a.mo155969R(new Callable() { // from class: l.arv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new crv0(bxy0.m106937u().m114533b(), bxy0.m106937u().m114544m());
            }
        });
    }
}
