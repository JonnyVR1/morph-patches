package p003l;

import android.text.TextUtils;
import l.bmg0;
import l.jgg0;
import l.njg0;
import l.t6g0;
import l.v8g0;
import l.y6g0;
import l.zbg0;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class lqg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f5385a;

    public lqg0(oqg0 oqg0Var) {
        this.f5385a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6140a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        bmg0 bmg0Var;
        t6g0 t6g0Var = this.f5385a.f6216m;
        if (t6g0Var != null) {
            if (TextUtils.isEmpty(str4)) {
                bmg0Var = null;
            } else {
                bmg0Var = new bmg0();
                try {
                    bmg0Var.a = new JSONObject(str4).getBoolean("isOpen");
                } catch (Exception e) {
                    e.printStackTrace();
                    bmg0Var = null;
                }
            }
            if (bmg0Var != null) {
                boolean z = bmg0Var.a;
                v8g0 v8g0Var = t6g0Var.b;
                if (z) {
                    zbg0 zbg0Var = new zbg0(v8g0Var);
                    v8g0Var.E = zbg0Var;
                    jgg0 jgg0Var = v8g0Var.B;
                    if (jgg0Var != null) {
                        jgg0Var.o = zbg0Var;
                    }
                } else {
                    v8g0Var.E = null;
                    jgg0 jgg0Var2 = v8g0Var.B;
                    if (jgg0Var2 != null) {
                        jgg0Var2.o = null;
                    }
                }
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f5385a.f6206c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, "mg_common_game_llm_asr", str4);
        }
    }
}
