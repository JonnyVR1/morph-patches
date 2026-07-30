package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes10.dex */
public class ws0 {

    /* JADX INFO: renamed from: a */
    public static final String f187853a;

    static {
        f187853a = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/anonymous-profile/index.html?speed=true&_bid=1002832&hideNavigationBar=1&webviewColor=ffffff");
    }

    /* JADX INFO: renamed from: a */
    public static void m205335a(Act act, String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(MkWebViewAct.m80238c2(act, "", f187853a + "&profile_user_id=" + str, true, true, null));
    }
}
