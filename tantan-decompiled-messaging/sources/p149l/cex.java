package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.messages.MatcheItemView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cex {
    /* JADX INFO: renamed from: a */
    public static void m106354a(MatcheItemView matcheItemView, View view) {
        matcheItemView.f25252a = (MatcheItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matcheItemView.f25253b = (RelativeLayout) viewGroup.getChildAt(0);
        matcheItemView.f25254c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        matcheItemView.f25255d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matcheItemView.f25256e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matcheItemView.f25257f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        matcheItemView.f25258g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        matcheItemView.f25259h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        matcheItemView.f25260i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        matcheItemView.f25261j = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        matcheItemView.f25262k = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        matcheItemView.f25263l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
