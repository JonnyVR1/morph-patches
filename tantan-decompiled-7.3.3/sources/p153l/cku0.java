package p153l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cku0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f82315a;

    public /* synthetic */ cku0(dku0 dku0Var, bku0 bku0Var) {
        this.f82315a = new WeakReference(dku0Var);
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        dku0 dku0Var = (dku0) this.f82315a.get();
        if (dku0Var == null) {
            return;
        }
        dku0Var.f89452g.zza();
    }
}
