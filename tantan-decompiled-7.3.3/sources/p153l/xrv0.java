package p153l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class xrv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f195978a;

    public xrv0(xvw0 xvw0Var) {
        this.f195978a = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 24;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f195978a.mo155969R(new Callable() { // from class: l.wrv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", bxy0.m106933q().m120259b());
                return new yrv0(bundle);
            }
        });
    }
}
