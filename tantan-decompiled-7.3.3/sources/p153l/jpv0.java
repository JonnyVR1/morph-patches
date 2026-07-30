package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class jpv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f122142a;

    public jpv0(xvw0 xvw0Var) {
        this.f122142a = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 54;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f122142a.mo155969R(new Callable() { // from class: l.ipv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kpv0.m150797b();
            }
        });
    }
}
