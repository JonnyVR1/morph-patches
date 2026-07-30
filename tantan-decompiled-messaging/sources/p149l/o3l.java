package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_FlipContainer;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o3l {
    /* JADX INFO: renamed from: a */
    public static void m162438a(HomeCardExpandedButtons homeCardExpandedButtons, View view) {
        homeCardExpandedButtons.f22759a = (HomeCardExpandedButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedButtons.f22760b = (VRelative) viewGroup.getChildAt(0);
        homeCardExpandedButtons.f22761c = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedButtons.f22762d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedButtons.f22763e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.f22764f = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.f22765g = (HomeCardExpandedOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.f22766h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.f22767i = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedButtons.f22768j = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedButtons.f22769k = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedButtons.f22770l = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedButtons.f22771m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedButtons.f22772n = (VLinear) viewGroup.getChildAt(1);
    }
}
