package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class viv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final jxv0 f181644a;

    public viv0(jxv0 jxv0Var) {
        this.f181644a = jxv0Var;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f181644a != null) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132337nb)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", this.f181644a.m143829d());
            bundle.putBoolean("disable_ml", this.f181644a.m143828c());
        }
    }
}
