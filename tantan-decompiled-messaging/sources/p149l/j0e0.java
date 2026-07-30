package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class j0e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (w2e0Var == null || w2e0Var.m201094b() == null || !(w2e0Var.m201094b() instanceof Act)) {
            return;
        }
        Act act = (Act) w2e0Var.m201094b();
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        tz00.m191130l(act, mapM201098f.get(Oauth2AccessToken.KEY_UID), mapM201098f.get("msg"), false, null);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
