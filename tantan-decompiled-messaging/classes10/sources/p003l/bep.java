package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bep {
    /* JADX INFO: renamed from: a */
    public static void m5713a(IntlTribeGroupBanner intlTribeGroupBanner, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeGroupBanner.a = viewGroup.getChildAt(0);
        intlTribeGroupBanner.b = viewGroup.getChildAt(1);
        intlTribeGroupBanner.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlTribeGroupBanner.d = viewGroup.getChildAt(2);
        intlTribeGroupBanner.e = viewGroup.getChildAt(3);
    }
}
