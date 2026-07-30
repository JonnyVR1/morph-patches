package p003l;

import l.jgg0;
import l.njg0;
import l.t6g0;
import l.y6g0;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class zdg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f9319a;

    public zdg0(oqg0 oqg0Var) {
        this.f9319a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m9407a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        jgg0 jgg0Var;
        t6g0 t6g0Var = this.f9319a.f6216m;
        if (t6g0Var != null && (jgg0Var = t6g0Var.b.B) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                String strOptString = jSONObject.optString("uid");
                String strOptString2 = jSONObject.optString("name");
                jSONObject.optString("avatar");
                jgg0Var.d = strOptString;
                jgg0Var.e = strOptString2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f9319a.f6206c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, "mg_common_game_player_self_info", str4);
        }
    }
}
