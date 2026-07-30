package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton;
import com.p051p1.mobile.putong.core.newui.home.card.operation.view.HomeButtonHookLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.view.UndoTestLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z5l {
    /* JADX INFO: renamed from: a */
    public static void m218708a(HomeCardBottomOptButtons homeCardBottomOptButtons, View view) {
        homeCardBottomOptButtons.f23443a = (HomeCardBottomOptButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardBottomOptButtons.f23444b = (VFrame) viewGroup.getChildAt(0);
        homeCardBottomOptButtons.f23445c = (HomeButtonHookLayout) viewGroup.getChildAt(1);
        homeCardBottomOptButtons.f23446d = (UndoTestLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.f23447e = (HomeCardExpandedOptButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        homeCardBottomOptButtons.f23448f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeCardBottomOptButtons.f23449g = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.f23450h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeCardBottomOptButtons.f23451i = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        homeCardBottomOptButtons.f23452j = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        homeCardBottomOptButtons.f23453k = (HomeCardExpandedOptButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.f23454l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.f23455m = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        homeCardBottomOptButtons.f23456n = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        homeCardBottomOptButtons.f23457o = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        homeCardBottomOptButtons.f23458p = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
