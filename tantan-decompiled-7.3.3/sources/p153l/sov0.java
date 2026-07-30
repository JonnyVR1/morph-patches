package p153l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class sov0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Executor f169925a;

    /* JADX INFO: renamed from: b */
    public final ebt0 f169926b;

    public sov0(Executor executor, ebt0 ebt0Var) {
        this.f169925a = executor;
        this.f169926b = ebt0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 10;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167930B2)).booleanValue()) {
            return pvw0.m173981h(null);
        }
        ebt0 ebt0Var = this.f169926b;
        return pvw0.m173986m(ebt0Var.m120265k(), new eow0() { // from class: l.rov0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new vuv0() { // from class: l.qov0
                    @Override // p153l.vuv0
                    /* JADX INFO: renamed from: a */
                    public final void mo99378a(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f169925a);
    }
}
