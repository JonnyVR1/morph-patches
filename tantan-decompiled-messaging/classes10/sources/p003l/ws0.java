package p003l;

import android.os.ResultReceiver;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.juk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ws0 {

    /* JADX INFO: renamed from: a */
    public static final String f8232a;

    static {
        f8232a = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/anonymous-profile/index.html?speed=true&_bid=1002832&hideNavigationBar=1&webviewColor=ffffff");
    }

    /* JADX INFO: renamed from: a */
    public static void m10540a(Act act, String str) {
        if (act == null || TextUtils.isEmpty(str)) {
            return;
        }
        act.startActivity(MkWebViewAct.c2(act, "", f8232a + "&profile_user_id=" + str, true, true, (ResultReceiver) null));
    }
}
