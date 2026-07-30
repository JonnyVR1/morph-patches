package p153l;

import android.view.View;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.SudGIP;

/* JADX INFO: loaded from: classes3.dex */
public final class jfg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f120587a;

    public jfg0(wyg0 wyg0Var) {
        this.f120587a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        bfg0 bfg0Var = this.f120587a.f191652m;
        if (bfg0Var == null || "true".equals(SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.BLOCK_COMMON_GAME_RELOAD))) {
            this.f120587a.m208616a(str, str2, str3, str4, gfg0Var);
            return;
        }
        dhg0 dhg0Var = bfg0Var.f76491b;
        lug0 lug0Var = dhg0Var.f88513m;
        mzg0 mzg0Var = lug0Var instanceof mzg0 ? (mzg0) lug0Var : null;
        if (mzg0Var == null) {
            return;
        }
        dhg0Var.m115799a();
        dhg0Var.f88510j = false;
        dhg0Var.f88509i = false;
        bgg0 bgg0Var = new bgg0(dhg0Var.f88502b);
        dhg0Var.f88516p = bgg0Var;
        View view = bgg0Var.f76624f;
        dhg0Var.f88517q = view;
        bgg0Var.f189794a = dhg0Var.f88519s;
        dhg0Var.f88514n.addView(view);
        dhg0Var.f88516p.m104167f(dhg0Var.f88507g.bigLoadingPic);
        dhg0Var.f88516p.m104163b(3, null);
        mzg0Var.mo155928c(dhg0Var.f88524x, dhg0Var.f88525y);
    }
}
