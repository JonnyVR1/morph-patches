package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class n9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.isEmpty(abe0Var.m96743f().get(Oauth2AccessToken.KEY_UID))) {
            return null;
        }
        return xwa.m213313h(abe0Var.m96739b(), abe0Var.m96740c());
    }
}
