package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardDefaultButtons;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b6l {
    /* JADX INFO: renamed from: a */
    public static void m102769a(HomeCardDefaultButtons homeCardDefaultButtons, View view) {
        homeCardDefaultButtons.f23483a = (HomeCardDefaultButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardDefaultButtons.f23484b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homeCardDefaultButtons.f23485c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardDefaultButtons.f23486d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardDefaultButtons.f23487e = (CardOperationButton) viewGroup.getChildAt(1);
        homeCardDefaultButtons.f23488f = (CardOperationButton) viewGroup.getChildAt(2);
        homeCardDefaultButtons.f23489g = (FrameLayout) viewGroup.getChildAt(3);
        homeCardDefaultButtons.f23490h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeCardDefaultButtons.f23491i = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        homeCardDefaultButtons.f23492j = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        homeCardDefaultButtons.f23493k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        homeCardDefaultButtons.f23494l = (VFrame) viewGroup.getChildAt(4);
        homeCardDefaultButtons.f23495m = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
