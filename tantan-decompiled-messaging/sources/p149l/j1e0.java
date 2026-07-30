package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class j1e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.isEmpty(w2e0Var.m201098f().get(Oauth2AccessToken.KEY_UID))) {
            return null;
        }
        return lva.m151852h(w2e0Var.m201094b(), w2e0Var.m201095c());
    }
}
