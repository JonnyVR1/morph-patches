package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes3.dex */
public class tmf0 {

    /* JADX INFO: renamed from: a */
    public static final String f171148a;

    static {
        f171148a = juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/";
    }

    /* JADX INFO: renamed from: a */
    public static void m189689a(Act act, String str) {
        act.startActivity(MkWebViewAct.m80240e2(act, "", String.format(f171148a, str), true, true, true, true, null));
    }
}
