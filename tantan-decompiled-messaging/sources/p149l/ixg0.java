package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.SuperLikeExpGuideView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class ixg0 {
    /* JADX INFO: renamed from: a */
    public static void m138848a(SuperLikeExpGuideView superLikeExpGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeExpGuideView.f22666a = (SVGAnimationView) viewGroup.getChildAt(1);
        superLikeExpGuideView.f22667b = (SVGAnimationView) viewGroup.getChildAt(2);
        superLikeExpGuideView.f22668c = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        superLikeExpGuideView.f22669d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        superLikeExpGuideView.f22670e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
