package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes3.dex */
public class cvf0 {

    /* JADX INFO: renamed from: a */
    public static final String f84003a;

    static {
        f84003a = zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/";
    }

    /* JADX INFO: renamed from: a */
    public static void m112809a(Act act, String str) {
        act.startActivity(MkWebViewAct.m81423g2(act, "", String.format(f84003a, str), true, true, true, true, null));
    }
}
