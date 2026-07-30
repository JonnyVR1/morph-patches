package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class y5e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (abe0Var == null || abe0Var.m96739b() == null) {
            return;
        }
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get(Oauth2AccessToken.KEY_UID);
        String str2 = mapM96743f.get("autoSendMsg");
        String str3 = abe0Var.m96743f().get("appendMsg");
        boolean z = Boolean.parseBoolean(abe0Var.m96743f().get("showKeyboard"));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        abe0Var.m96739b().startActivity(xwa.m213318m(abe0Var.m96739b(), 1, str, z, str2, str3));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
