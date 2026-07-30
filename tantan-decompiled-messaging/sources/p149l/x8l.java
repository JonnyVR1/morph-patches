package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.HomePlatinumButton;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x8l {
    /* JADX INFO: renamed from: a */
    public static void m207421a(HomePlatinumButton homePlatinumButton, View view) {
        homePlatinumButton.f23894a = (HomePlatinumButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homePlatinumButton.f23895b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homePlatinumButton.f23896c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homePlatinumButton.f23897d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homePlatinumButton.f23898e = (FrameLayout) viewGroup.getChildAt(1);
        homePlatinumButton.f23899f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homePlatinumButton.f23900g = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homePlatinumButton.f23901h = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homePlatinumButton.f23902i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homePlatinumButton.f23903j = (CardOperationButton) viewGroup.getChildAt(2);
        homePlatinumButton.f23904k = (CardOperationButton) viewGroup.getChildAt(3);
        homePlatinumButton.f23905l = (VLinear) viewGroup.getChildAt(4);
        homePlatinumButton.f23906m = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homePlatinumButton.f23907n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
