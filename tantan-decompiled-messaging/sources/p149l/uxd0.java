package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class uxd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var == null || w2e0Var.m201094b() == null) {
            return;
        }
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get(Oauth2AccessToken.KEY_UID);
        String str2 = mapM201098f.get("autoSendMsg");
        String str3 = w2e0Var.m201098f().get("appendMsg");
        boolean z = Boolean.parseBoolean(w2e0Var.m201098f().get("showKeyboard"));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w2e0Var.m201094b().startActivity(lva.m151857m(w2e0Var.m201094b(), 1, str, z, str2, str3));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
