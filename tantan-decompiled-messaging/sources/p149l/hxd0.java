package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.data.User;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hxd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m133342e(String str, Act act, roj0 roj0Var) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (NullChecker.m81303a(userM169524oa)) {
            C8456b.m47636o(act, userM169524oa, "p_pay_result,e_odiamond_sayhi,click", null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m133343f(Throwable th) {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", "");
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        if ("match".equals(strReplaceFirst)) {
            Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
            if (activityM208326D instanceof Act) {
                final String str = mapM201098f.get(Oauth2AccessToken.KEY_UID);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                final Act act = (Act) activityM208326D;
                act.duringCreated(CoreModule.f17545c.f19639e0.m169454W9(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.fxd0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hxd0.m133342e(str, act, (roj0) obj);
                    }
                }, new e30() { // from class: l.gxd0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hxd0.m133343f((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
