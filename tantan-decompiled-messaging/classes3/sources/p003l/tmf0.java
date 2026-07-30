package p003l;

import android.os.ResultReceiver;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.juk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tmf0 {

    /* JADX INFO: renamed from: a */
    public static final String f7557a;

    static {
        f7557a = juk.e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/sparkChatRounds/index.html?speed=true&_bid=1005459&hideNavigationBar=1&hideNotch=1&current_session_id=%s#/";
    }

    /* JADX INFO: renamed from: a */
    public static void m7819a(Act act, String str) {
        act.startActivity(MkWebViewAct.e2(act, "", String.format(f7557a, str), true, true, true, true, (ResultReceiver) null));
    }
}
