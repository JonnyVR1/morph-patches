package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.HomePlatinumButton;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nbl {
    /* JADX INFO: renamed from: a */
    public static void m162171a(HomePlatinumButton homePlatinumButton, View view) {
        homePlatinumButton.f24636a = (HomePlatinumButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homePlatinumButton.f24637b = (VFrame_FlipContainer) viewGroup.getChildAt(0);
        homePlatinumButton.f24638c = (CardOperationButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homePlatinumButton.f24639d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homePlatinumButton.f24640e = (FrameLayout) viewGroup.getChildAt(1);
        homePlatinumButton.f24641f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homePlatinumButton.f24642g = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homePlatinumButton.f24643h = (CardOperationButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homePlatinumButton.f24644i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homePlatinumButton.f24645j = (CardOperationButton) viewGroup.getChildAt(2);
        homePlatinumButton.f24646k = (CardOperationButton) viewGroup.getChildAt(3);
        homePlatinumButton.f24647l = (VLinear) viewGroup.getChildAt(4);
        homePlatinumButton.f24648m = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homePlatinumButton.f24649n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
