package p003l;

import android.view.View;
import l.erg0;
import l.njg0;
import l.oeg0;
import l.t6g0;
import l.t7g0;
import l.v8g0;
import l.y6g0;
import org.json.JSONObject;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.SudGIP;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class b7g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f2347a;

    public b7g0(oqg0 oqg0Var) {
        this.f2347a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2933a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f2347a.f6216m;
        if (t6g0Var == null || "true".equals(SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.BLOCK_COMMON_GAME_RELOAD))) {
            this.f2347a.m6726a(str, str2, str3, str4, y6g0Var);
            return;
        }
        v8g0 v8g0Var = t6g0Var.b;
        erg0 erg0Var = v8g0Var.m;
        erg0 erg0Var2 = erg0Var instanceof erg0 ? erg0Var : null;
        if (erg0Var2 == null) {
            return;
        }
        v8g0Var.a();
        v8g0Var.j = false;
        v8g0Var.i = false;
        t7g0 t7g0Var = new t7g0(v8g0Var.b);
        v8g0Var.p = t7g0Var;
        View view = t7g0Var.f;
        v8g0Var.q = view;
        ((oeg0) t7g0Var).a = v8g0Var.s;
        v8g0Var.n.addView(view);
        v8g0Var.p.f(v8g0Var.g.bigLoadingPic);
        v8g0Var.p.b(3, (JSONObject) null);
        erg0Var2.c(v8g0Var.x, v8g0Var.y);
    }
}
