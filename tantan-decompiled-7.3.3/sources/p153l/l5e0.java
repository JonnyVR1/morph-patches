package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.data.User;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class l5e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m152941e(String str, Act act, uxj0 uxj0Var) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (NullChecker.m82486a(userM116597oa)) {
            C8619b.m48819o(act, userM116597oa, "p_pay_result,e_odiamond_sayhi,click", null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m152942f(Throwable th) {
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", "");
        Map<String, String> mapM96743f = abe0Var.m96743f();
        if ("match".equals(strReplaceFirst)) {
            Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
            if (activityM105506D instanceof Act) {
                final String str = mapM96743f.get(Oauth2AccessToken.KEY_UID);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                final Act act = (Act) activityM105506D;
                act.duringCreated(CoreModule.f18264c.f20381e0.m116527W9(str)).subscribe(psd0.m173597H(new y20() { // from class: l.j5e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        l5e0.m152941e(str, act, (uxj0) obj);
                    }
                }, new y20() { // from class: l.k5e0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        l5e0.m152942f((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
