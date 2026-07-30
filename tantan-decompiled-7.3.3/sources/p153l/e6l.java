package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e6l {
    /* JADX INFO: renamed from: a */
    public static void m119603a(HomeCardExpandedButtons homeCardExpandedButtons, View view) {
        homeCardExpandedButtons.f23501a = (HomeCardExpandedButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedButtons.f23502b = (VRelative) viewGroup.getChildAt(0);
        homeCardExpandedButtons.f23503c = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedButtons.f23504d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedButtons.f23505e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.f23506f = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.f23507g = (HomeCardExpandedOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.f23508h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.f23509i = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedButtons.f23510j = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedButtons.f23511k = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedButtons.f23512l = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedButtons.f23513m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedButtons.f23514n = (VLinear) viewGroup.getChildAt(1);
    }
}
