package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import org.json.JSONObject;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class zdg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f202665a;

    public zdg0(oqg0 oqg0Var) {
        this.f202665a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        jgg0 jgg0Var;
        t6g0 t6g0Var = this.f202665a.f145150m;
        if (t6g0Var != null && (jgg0Var = t6g0Var.f168615b.f180495B) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                String strOptString = jSONObject.optString(Oauth2AccessToken.KEY_UID);
                String strOptString2 = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                jSONObject.optString("avatar");
                jgg0Var.f117779d = strOptString;
                jgg0Var.f117780e = strOptString2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f202665a.f145140c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, "mg_common_game_player_self_info", str4);
        }
    }
}
