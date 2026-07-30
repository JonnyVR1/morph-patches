package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class q5h0 {
    /* JADX INFO: renamed from: a */
    public static void m175360a(SuperLikeExpGuideView superLikeExpGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeExpGuideView.f23408a = (SVGAnimationView) viewGroup.getChildAt(1);
        superLikeExpGuideView.f23409b = (SVGAnimationView) viewGroup.getChildAt(2);
        superLikeExpGuideView.f23410c = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        superLikeExpGuideView.f23411d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        superLikeExpGuideView.f23412e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
