package p149l;

import android.text.TextUtils;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class lqg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f129337a;

    public lqg0(oqg0 oqg0Var) {
        this.f129337a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        bmg0 bmg0Var;
        t6g0 t6g0Var = this.f129337a.f145150m;
        if (t6g0Var != null) {
            if (TextUtils.isEmpty(str4)) {
                bmg0Var = null;
            } else {
                bmg0Var = new bmg0();
                try {
                    bmg0Var.f76283a = new JSONObject(str4).getBoolean("isOpen");
                } catch (Exception e) {
                    e.printStackTrace();
                    bmg0Var = null;
                }
            }
            if (bmg0Var != null) {
                boolean z = bmg0Var.f76283a;
                v8g0 v8g0Var = t6g0Var.f168615b;
                if (z) {
                    zbg0 zbg0Var = new zbg0(v8g0Var);
                    v8g0Var.f180498E = zbg0Var;
                    jgg0 jgg0Var = v8g0Var.f180495B;
                    if (jgg0Var != null) {
                        jgg0Var.f117790o = zbg0Var;
                    }
                } else {
                    v8g0Var.f180498E = null;
                    jgg0 jgg0Var2 = v8g0Var.f180495B;
                    if (jgg0Var2 != null) {
                        jgg0Var2.f117790o = null;
                    }
                }
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f129337a.f145140c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, "mg_common_game_llm_asr", str4);
        }
    }
}
