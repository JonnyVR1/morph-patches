package p153l;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class aku0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f72043a;

    public /* synthetic */ aku0(dku0 dku0Var, zju0 zju0Var) {
        this.f72043a = new WeakReference(dku0Var);
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        dku0 dku0Var = (dku0) this.f72043a.get();
        if (dku0Var == null) {
            return;
        }
        dku0Var.f89453h.onAdClicked();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
            dku0Var.f89454i.zzs();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            dku0Var.f89454i.zzbo();
        }
    }
}
