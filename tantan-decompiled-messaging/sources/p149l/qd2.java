package p149l;

import android.content.Intent;
import android.net.Uri;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes10.dex */
public class qd2 {

    /* JADX INFO: renamed from: a */
    public static final String f153861a;

    static {
        f153861a = (juk.m143323e() ? "https://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/urban-drunkard-lover/index.html?speed=true&_bid=1004798&hideNavigationBar=1&hideNotch=1&useBarId=%s&from=%s/#/cardPage");
    }

    /* JADX INFO: renamed from: a */
    public static void m173939a(Act act, String str, String str2) {
        Intent intentM80239d2 = MkWebViewAct.m80239d2(act, "", String.format(f153861a, str, str2), true, true, true, null);
        intentM80239d2.putExtra("hideNotch", true);
        act.startActivity(intentM80239d2);
    }

    /* JADX INFO: renamed from: b */
    public static void m173940b(Act act) {
        j2e0.m139446m(act, Uri.parse("tantanapp://moment/p_city_bar_map?uid=0&mid=0"));
    }
}
