package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.boost.BoostGuideCardView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n83 {
    /* JADX INFO: renamed from: a */
    public static void m161891a(BoostGuideCardView boostGuideCardView, View view) {
        boostGuideCardView.f22021a = (BoostGuideCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostGuideCardView.f22022b = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostGuideCardView.f22023c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostGuideCardView.f22024d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        boostGuideCardView.f22025e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        boostGuideCardView.f22026f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
