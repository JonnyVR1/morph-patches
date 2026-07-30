package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class bsv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final p6w0 f78194a;

    public bsv0(p6w0 p6w0Var) {
        this.f78194a = p6w0Var;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f78194a != null) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168408nb)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", this.f78194a.m171083d());
            bundle.putBoolean("disable_ml", this.f78194a.m171082c());
        }
    }
}
