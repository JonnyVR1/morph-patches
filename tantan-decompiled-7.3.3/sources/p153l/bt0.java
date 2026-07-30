package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes12.dex */
public class bt0 {

    /* JADX INFO: renamed from: a */
    public static final String f78319a;

    static {
        f78319a = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/anonymous-profile/index.html?speed=true&_bid=1002832&hideNavigationBar=1&webviewColor=ffffff");
    }

    /* JADX INFO: renamed from: a */
    public static void m106318a(Act act, String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(MkWebViewAct.m81421d2(act, "", f78319a + "&profile_user_id=" + str, true, true, null));
    }
}
