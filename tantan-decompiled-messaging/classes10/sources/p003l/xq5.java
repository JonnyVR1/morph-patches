package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.views.innerpush.ComplimentReceivedBannerLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xq5 {
    /* JADX INFO: renamed from: a */
    public static void m10945a(ComplimentReceivedBannerLayout complimentReceivedBannerLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        complimentReceivedBannerLayout.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        complimentReceivedBannerLayout.b = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        complimentReceivedBannerLayout.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        complimentReceivedBannerLayout.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
