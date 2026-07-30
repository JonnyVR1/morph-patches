package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class n8e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (abe0Var == null || abe0Var.m96739b() == null || !(abe0Var.m96739b() instanceof Act)) {
            return;
        }
        Act act = (Act) abe0Var.m96739b();
        Map<String, String> mapM96743f = abe0Var.m96743f();
        d810.m114779l(act, mapM96743f.get(Oauth2AccessToken.KEY_UID), mapM96743f.get("msg"), false, null);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
