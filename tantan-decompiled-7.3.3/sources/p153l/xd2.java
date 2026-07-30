package p153l;

import android.content.Intent;
import android.net.Uri;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes12.dex */
public class xd2 {

    /* JADX INFO: renamed from: a */
    public static final String f193510a;

    static {
        f193510a = (zwk.m221905e() ? "https://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/urban-drunkard-lover/index.html?speed=true&_bid=1004798&hideNavigationBar=1&hideNotch=1&useBarId=%s&from=%s/#/cardPage");
    }

    /* JADX INFO: renamed from: a */
    public static void m210442a(Act act, String str, String str2) {
        Intent intentM81422e2 = MkWebViewAct.m81422e2(act, "", String.format(f193510a, str, str2), true, true, true, null);
        intentM81422e2.putExtra("hideNotch", true);
        act.startActivity(intentM81422e2);
    }

    /* JADX INFO: renamed from: b */
    public static void m210443b(Act act) {
        nae0.m162083m(act, Uri.parse("tantanapp://moment/p_city_bar_map?uid=0&mid=0"));
    }
}
