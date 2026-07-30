package p009l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkDlgWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b86 {
    /* JADX INFO: renamed from: a */
    public static void m11914a(Act act, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?speed=true&_offline=1&_bid=1003816&matchcount=");
        sb.append(i);
        sb.append("#/");
        Intent intentM10585c2 = MkWebViewAct.m10585c2(act, "", sb.toString(), true, true, null);
        intentM10585c2.putExtra("hideNotch", true);
        act.startActivity(intentM10585c2);
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m11915b(List<E> list, int i) {
        if (vwb.J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        return arrayList.size() < i ? arrayList : arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m11916c(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM10570X1 = MkDlgWebViewAct.m10570X1(activity, "", str);
        intentM10570X1.putExtra("hideNavigationBar", true);
        intentM10570X1.putExtra("skipLoading", true);
        intentM10570X1.putExtra("transparent_status_bar", true);
        intentM10570X1.putExtra("webviewColor", "transparent");
        intentM10570X1.putExtra("hideNotch", true);
        activity.startActivity(intentM10570X1);
    }
}
