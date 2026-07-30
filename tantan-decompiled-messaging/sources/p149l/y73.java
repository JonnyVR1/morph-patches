package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y73 {
    /* JADX INFO: renamed from: a */
    public static void m213283a(BoostGuideCardView boostGuideCardView, View view) {
        boostGuideCardView.f21279a = (BoostGuideCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostGuideCardView.f21280b = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostGuideCardView.f21281c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostGuideCardView.f21282d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        boostGuideCardView.f21283e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        boostGuideCardView.f21284f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
