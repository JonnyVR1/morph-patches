package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardIntlRedesignV1Buttons;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t7l {
    /* JADX INFO: renamed from: a */
    public static void m189623a(HomeCardIntlRedesignV1Buttons homeCardIntlRedesignV1Buttons, View view) {
        homeCardIntlRedesignV1Buttons.f23604a = (HomeCardIntlRedesignV1Buttons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardIntlRedesignV1Buttons.f23605b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homeCardIntlRedesignV1Buttons.f23606c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardIntlRedesignV1Buttons.f23607d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardIntlRedesignV1Buttons.f23608e = (CardOperationButton) viewGroup.getChildAt(2);
        homeCardIntlRedesignV1Buttons.f23609f = (FrameLayout) viewGroup.getChildAt(4);
        homeCardIntlRedesignV1Buttons.f23610g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeCardIntlRedesignV1Buttons.f23611h = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        homeCardIntlRedesignV1Buttons.f23612i = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
        homeCardIntlRedesignV1Buttons.f23613j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(1);
        homeCardIntlRedesignV1Buttons.f23614k = (CardOperationButton) viewGroup.getChildAt(6);
        homeCardIntlRedesignV1Buttons.f23615l = (VFrame_FlipContainer) viewGroup.getChildAt(8);
        homeCardIntlRedesignV1Buttons.f23616m = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        homeCardIntlRedesignV1Buttons.f23617n = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
    }
}
