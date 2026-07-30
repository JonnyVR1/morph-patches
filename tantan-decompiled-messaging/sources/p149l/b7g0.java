package p149l;

import android.view.View;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.SudGIP;

/* JADX INFO: loaded from: classes3.dex */
public final class b7g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f73971a;

    public b7g0(oqg0 oqg0Var) {
        this.f73971a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f73971a.f145150m;
        if (t6g0Var == null || "true".equals(SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.BLOCK_COMMON_GAME_RELOAD))) {
            this.f73971a.m165427a(str, str2, str3, str4, y6g0Var);
            return;
        }
        v8g0 v8g0Var = t6g0Var.f168615b;
        dmg0 dmg0Var = v8g0Var.f180511m;
        erg0 erg0Var = dmg0Var instanceof erg0 ? (erg0) dmg0Var : null;
        if (erg0Var == null) {
            return;
        }
        v8g0Var.m197440a();
        v8g0Var.f180508j = false;
        v8g0Var.f180507i = false;
        t7g0 t7g0Var = new t7g0(v8g0Var.f180500b);
        v8g0Var.f180514p = t7g0Var;
        View view = t7g0Var.f168720f;
        v8g0Var.f180515q = view;
        t7g0Var.f143311a = v8g0Var.f180517s;
        v8g0Var.f180512n.addView(view);
        v8g0Var.f180514p.m187461f(v8g0Var.f180505g.bigLoadingPic);
        v8g0Var.f180514p.m187457b(3, null);
        erg0Var.mo112476c(v8g0Var.f180522x, v8g0Var.f180523y);
    }
}
