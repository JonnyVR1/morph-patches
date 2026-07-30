package p003l;

import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.j2e0;
import l.juk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qd2 {

    /* JADX INFO: renamed from: a */
    public static final String f7005a;

    static {
        f7005a = (juk.e() ? "https://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/urban-drunkard-lover/index.html?speed=true&_bid=1004798&hideNavigationBar=1&hideNotch=1&useBarId=%s&from=%s/#/cardPage");
    }

    /* JADX INFO: renamed from: a */
    public static void m8955a(Act act, String str, String str2) {
        Intent intentD2 = MkWebViewAct.d2(act, "", String.format(f7005a, str, str2), true, true, true, (ResultReceiver) null);
        intentD2.putExtra("hideNotch", true);
        act.startActivity(intentD2);
    }

    /* JADX INFO: renamed from: b */
    public static void m8956b(Act act) {
        j2e0.m(act, Uri.parse("tantanapp://moment/p_city_bar_map?uid=0&mid=0"));
    }
}
