package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.messages.MatcheItemView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bhx {
    /* JADX INFO: renamed from: a */
    public static void m104378a(MatcheItemView matcheItemView, View view) {
        matcheItemView.f25994a = (MatcheItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matcheItemView.f25995b = (RelativeLayout) viewGroup.getChildAt(0);
        matcheItemView.f25996c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        matcheItemView.f25997d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matcheItemView.f25998e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matcheItemView.f25999f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        matcheItemView.f26000g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        matcheItemView.f26001h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        matcheItemView.f26002i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        matcheItemView.f26003j = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        matcheItemView.f26004k = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        matcheItemView.f26005l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
