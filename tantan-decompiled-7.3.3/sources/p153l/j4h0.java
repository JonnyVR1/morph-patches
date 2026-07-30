package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBannerView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j4h0 {
    /* JADX INFO: renamed from: a */
    public static void m143425a(SuperLikeBannerView superLikeBannerView, View view) {
        superLikeBannerView.f24761d = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeBannerView.f24762e = (GradientBgButton) viewGroup.getChildAt(0);
        superLikeBannerView.f24763f = (VText) viewGroup.getChildAt(1);
    }
}
