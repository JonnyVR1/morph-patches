package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class b86 {
    /* JADX INFO: renamed from: a */
    public static void m100756a(Act act, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com");
        sb.append("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/address-book/index.html?speed=true&_offline=1&_bid=1003816&matchcount=");
        sb.append(i);
        sb.append("#/");
        Intent intentM80238c2 = MkWebViewAct.m80238c2(act, "", sb.toString(), true, true, null);
        intentM80238c2.putExtra("hideNotch", true);
        act.startActivity(intentM80238c2);
    }

    /* JADX INFO: renamed from: b */
    public static <E> List<E> m100757b(List<E> list, int i) {
        if (vwb.m200296J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        return arrayList.size() < i ? arrayList : arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m100758c(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(activity, "", str);
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        activity.startActivity(intentM80228X1);
    }
}
