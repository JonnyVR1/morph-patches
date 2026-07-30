package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.home.views.SuperLikeBannerView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bwg0 {
    /* JADX INFO: renamed from: a */
    public static void m104156a(SuperLikeBannerView superLikeBannerView, View view) {
        superLikeBannerView.f24019d = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeBannerView.f24020e = (GradientBgButton) viewGroup.getChildAt(0);
        superLikeBannerView.f24021f = (VText) viewGroup.getChildAt(1);
    }
}
