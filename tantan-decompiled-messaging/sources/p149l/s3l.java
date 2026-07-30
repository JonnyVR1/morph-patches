package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_FlipContainer;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s3l {
    /* JADX INFO: renamed from: a */
    public static void m182165a(HomeCardExpandedNewUiButtons homeCardExpandedNewUiButtons, View view) {
        homeCardExpandedNewUiButtons.f22786a = (HomeCardExpandedNewUiButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedNewUiButtons.f22787b = (VRelative) viewGroup.getChildAt(0);
        homeCardExpandedNewUiButtons.f22788c = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedNewUiButtons.f22789d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedNewUiButtons.f22790e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.f22791f = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.f22792g = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.f22793h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.f22794i = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedNewUiButtons.f22795j = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedNewUiButtons.f22796k = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedNewUiButtons.f22797l = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedNewUiButtons.f22798m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedNewUiButtons.f22799n = (VLinear) viewGroup.getChildAt(1);
    }
}
