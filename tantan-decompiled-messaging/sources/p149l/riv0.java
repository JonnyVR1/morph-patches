package p149l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class riv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f159608a;

    public riv0(rmw0 rmw0Var) {
        this.f159608a = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 24;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f159608a.mo122102R(new Callable() { // from class: l.qiv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", vny0.m199079q().m212274b());
                return new siv0(bundle);
            }
        });
    }
}
