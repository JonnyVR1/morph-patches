package p153l;

import android.text.TextUtils;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class tyg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f176675a;

    public tyg0(wyg0 wyg0Var) {
        this.f176675a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        jug0 jug0Var;
        bfg0 bfg0Var = this.f176675a.f191652m;
        if (bfg0Var != null) {
            if (TextUtils.isEmpty(str4)) {
                jug0Var = null;
            } else {
                jug0Var = new jug0();
                try {
                    jug0Var.f122718a = new JSONObject(str4).getBoolean("isOpen");
                } catch (Exception e) {
                    e.printStackTrace();
                    jug0Var = null;
                }
            }
            if (jug0Var != null) {
                boolean z = jug0Var.f122718a;
                dhg0 dhg0Var = bfg0Var.f76491b;
                if (z) {
                    hkg0 hkg0Var = new hkg0(dhg0Var);
                    dhg0Var.f88500E = hkg0Var;
                    rog0 rog0Var = dhg0Var.f88497B;
                    if (rog0Var != null) {
                        rog0Var.f164208o = hkg0Var;
                    }
                } else {
                    dhg0Var.f88500E = null;
                    rog0 rog0Var2 = dhg0Var.f88497B;
                    if (rog0Var2 != null) {
                        rog0Var2.f164208o = null;
                    }
                }
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f176675a.f191642c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(gfg0Var, "mg_common_game_llm_asr", str4);
        }
    }
}
