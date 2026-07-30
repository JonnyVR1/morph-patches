package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class hmg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f110625a;

    public hmg0(wyg0 wyg0Var) {
        this.f110625a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        rog0 rog0Var;
        bfg0 bfg0Var = this.f110625a.f191652m;
        if (bfg0Var != null && (rog0Var = bfg0Var.f76491b.f88497B) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                String strOptString = jSONObject.optString(Oauth2AccessToken.KEY_UID);
                String strOptString2 = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                jSONObject.optString("avatar");
                rog0Var.f164197d = strOptString;
                rog0Var.f164198e = strOptString2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f110625a.f191642c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(gfg0Var, "mg_common_game_player_self_info", str4);
        }
    }
}
