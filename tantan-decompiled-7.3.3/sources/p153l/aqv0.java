package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class aqv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f72883a;

    public aqv0(xvw0 xvw0Var) {
        this.f72883a = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 55;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f72883a.mo155969R(new Callable() { // from class: l.zpv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new bqv0(bxy0.m106918b().currentTimeMillis() - bxy0.m106933q().m120264i().zzh().m214923a());
            }
        });
    }
}
