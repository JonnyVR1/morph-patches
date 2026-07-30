package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g96 {
    /* JADX INFO: renamed from: a */
    public static void m129514a(Act act, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?speed=true&_offline=1&_bid=1003816&matchcount=");
        sb.append(i);
        sb.append("#/");
        Intent intentM81421d2 = MkWebViewAct.m81421d2(act, "", sb.toString(), true, true, null);
        intentM81421d2.putExtra("hideNotch", true);
        act.startActivity(intentM81421d2);
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m129515b(List<E> list, int i) {
        if (jyb.m147479J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        return arrayList.size() < i ? arrayList : arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m129516c(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(activity, "", str);
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        activity.startActivity(intentM81411Y1);
    }
}
