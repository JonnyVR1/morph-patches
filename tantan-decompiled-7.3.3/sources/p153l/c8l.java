package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c8l {
    /* JADX INFO: renamed from: a */
    public static void m108366a(HomeCardSuperLikeButtons homeCardSuperLikeButtons, View view) {
        homeCardSuperLikeButtons.f24610a = (HomeCardSuperLikeButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardSuperLikeButtons.f24611b = (VFrame) viewGroup.getChildAt(0);
        homeCardSuperLikeButtons.f24612c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardSuperLikeButtons.f24613d = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        homeCardSuperLikeButtons.f24614e = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        homeCardSuperLikeButtons.f24615f = (HomeCardExpandedOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardSuperLikeButtons.f24616g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardSuperLikeButtons.f24617h = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardSuperLikeButtons.f24618i = (HomeCardExpandedOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardSuperLikeButtons.f24619j = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardSuperLikeButtons.f24620k = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        homeCardSuperLikeButtons.f24621l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        homeCardSuperLikeButtons.f24622m = (VFrame) viewGroup.getChildAt(1);
        homeCardSuperLikeButtons.f24623n = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeCardSuperLikeButtons.f24624o = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardSuperLikeButtons.f24625p = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        homeCardSuperLikeButtons.f24626q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        homeCardSuperLikeButtons.f24627r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        homeCardSuperLikeButtons.f24628s = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardSuperLikeButtons.f24629t = (LetterRemainingSwitcherView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardSuperLikeButtons.f24630u = (VLinear) viewGroup.getChildAt(2);
        homeCardSuperLikeButtons.f24631v = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        homeCardSuperLikeButtons.f24632w = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        homeCardSuperLikeButtons.f24633x = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        homeCardSuperLikeButtons.f24634y = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
