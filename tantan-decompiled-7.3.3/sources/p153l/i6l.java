package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i6l {
    /* JADX INFO: renamed from: a */
    public static void m138827a(HomeCardExpandedNewUiButtons homeCardExpandedNewUiButtons, View view) {
        homeCardExpandedNewUiButtons.f23528a = (HomeCardExpandedNewUiButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedNewUiButtons.f23529b = (VRelative) viewGroup.getChildAt(0);
        homeCardExpandedNewUiButtons.f23530c = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedNewUiButtons.f23531d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedNewUiButtons.f23532e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.f23533f = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.f23534g = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedNewUiButtons.f23535h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedNewUiButtons.f23536i = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedNewUiButtons.f23537j = (HomeCardExpandedOperationNewUiButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedNewUiButtons.f23538k = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedNewUiButtons.f23539l = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedNewUiButtons.f23540m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedNewUiButtons.f23541n = (VLinear) viewGroup.getChildAt(1);
    }
}
