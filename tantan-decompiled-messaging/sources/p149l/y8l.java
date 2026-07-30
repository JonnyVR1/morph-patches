package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_FlipContainer;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y8l {
    /* JADX INFO: renamed from: a */
    public static void m213409a(HomeSayHiNewButton homeSayHiNewButton, View view) {
        homeSayHiNewButton.f23910a = (HomeSayHiNewButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeSayHiNewButton.f23911b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homeSayHiNewButton.f23912c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeSayHiNewButton.f23913d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeSayHiNewButton.f23914e = (FrameLayout) viewGroup.getChildAt(1);
        homeSayHiNewButton.f23915f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.f23916g = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.f23917h = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.f23918i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.f23919j = (CardOperationButton) viewGroup.getChildAt(2);
        homeSayHiNewButton.f23920k = (CardOperationButton) viewGroup.getChildAt(3);
        homeSayHiNewButton.f23921l = (ConstraintLayout) viewGroup.getChildAt(4);
        homeSayHiNewButton.f23922m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeSayHiNewButton.f23923n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
    }
}
