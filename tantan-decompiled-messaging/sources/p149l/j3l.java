package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton;
import com.p046p1.mobile.putong.core.newui.home.card.operation.view.HomeButtonHookLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.view.UndoTestLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j3l {
    /* JADX INFO: renamed from: a */
    public static void m139578a(HomeCardBottomOptButtons homeCardBottomOptButtons, View view) {
        homeCardBottomOptButtons.f22701a = (HomeCardBottomOptButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardBottomOptButtons.f22702b = (VFrame) viewGroup.getChildAt(0);
        homeCardBottomOptButtons.f22703c = (HomeButtonHookLayout) viewGroup.getChildAt(1);
        homeCardBottomOptButtons.f22704d = (UndoTestLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.f22705e = (HomeCardExpandedOptButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        homeCardBottomOptButtons.f22706f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeCardBottomOptButtons.f22707g = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.f22708h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeCardBottomOptButtons.f22709i = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        homeCardBottomOptButtons.f22710j = (VFrame_FlipContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        homeCardBottomOptButtons.f22711k = (HomeCardExpandedOptButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.f22712l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.f22713m = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        homeCardBottomOptButtons.f22714n = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        homeCardBottomOptButtons.f22715o = (HomeCardExpandedOptButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        homeCardBottomOptButtons.f22716p = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
