package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.views.SuperLikeBannerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bwg0 {
    /* JADX INFO: renamed from: a */
    public static void m5825a(SuperLikeBannerView superLikeBannerView, View view) {
        superLikeBannerView.d = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeBannerView.e = viewGroup.getChildAt(0);
        superLikeBannerView.f = viewGroup.getChildAt(1);
    }
}
