package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardDefaultButtons;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l3l {
    /* JADX INFO: renamed from: a */
    public static void m148402a(HomeCardDefaultButtons homeCardDefaultButtons, View view) {
        homeCardDefaultButtons.f22741a = (HomeCardDefaultButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardDefaultButtons.f22742b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homeCardDefaultButtons.f22743c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardDefaultButtons.f22744d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardDefaultButtons.f22745e = (CardOperationButton) viewGroup.getChildAt(1);
        homeCardDefaultButtons.f22746f = (CardOperationButton) viewGroup.getChildAt(2);
        homeCardDefaultButtons.f22747g = (FrameLayout) viewGroup.getChildAt(3);
        homeCardDefaultButtons.f22748h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeCardDefaultButtons.f22749i = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        homeCardDefaultButtons.f22750j = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        homeCardDefaultButtons.f22751k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        homeCardDefaultButtons.f22752l = (VFrame) viewGroup.getChildAt(4);
        homeCardDefaultButtons.f22753m = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
