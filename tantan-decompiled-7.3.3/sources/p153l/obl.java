package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class obl {
    /* JADX INFO: renamed from: a */
    public static void m167032a(HomeSayHiNewButton homeSayHiNewButton, View view) {
        homeSayHiNewButton.f24652a = (HomeSayHiNewButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeSayHiNewButton.f24653b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homeSayHiNewButton.f24654c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeSayHiNewButton.f24655d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeSayHiNewButton.f24656e = (FrameLayout) viewGroup.getChildAt(1);
        homeSayHiNewButton.f24657f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.f24658g = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.f24659h = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.f24660i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.f24661j = (CardOperationButton) viewGroup.getChildAt(2);
        homeSayHiNewButton.f24662k = (CardOperationButton) viewGroup.getChildAt(3);
        homeSayHiNewButton.f24663l = (ConstraintLayout) viewGroup.getChildAt(4);
        homeSayHiNewButton.f24664m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeSayHiNewButton.f24665n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
    }
}
