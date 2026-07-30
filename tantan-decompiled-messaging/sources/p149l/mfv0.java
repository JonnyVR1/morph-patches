package p149l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class mfv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Executor f133626a;

    /* JADX INFO: renamed from: b */
    public final y1t0 f133627b;

    public mfv0(Executor executor, y1t0 y1t0Var) {
        this.f133626a = executor;
        this.f133627b = y1t0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 10;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131859B2)).booleanValue()) {
            return jmw0.m142235h(null);
        }
        y1t0 y1t0Var = this.f133627b;
        return jmw0.m142240m(y1t0Var.m212280k(), new yew0() { // from class: l.lfv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new plv0() { // from class: l.kfv0
                    @Override // p149l.plv0
                    /* JADX INFO: renamed from: a */
                    public final void mo96132a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f133626a);
    }
}
