package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VCheckBox;
import p151v.VDelegateLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VPagerWormIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class j4g {
    /* JADX INFO: renamed from: a */
    public static void m143414a(FakeSplashView fakeSplashView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashView.f55533e = (ConstraintLayout) viewGroup.getChildAt(0);
        fakeSplashView.f55534f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashView.f55535g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeSplashView.f55536h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fakeSplashView.f55537i = (LinearLayout) viewGroup.getChildAt(1);
        fakeSplashView.f55538j = (VDelegateLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fakeSplashView.f55539k = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fakeSplashView.f55540l = (VPagerWormIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fakeSplashView.f55541m = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fakeSplashView.f55542n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        fakeSplashView.f55543o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        fakeSplashView.f55544p = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fakeSplashView.f55545q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        fakeSplashView.f55546r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        fakeSplashView.f55547s = (VLinear) viewGroup.getChildAt(2);
        fakeSplashView.f55548t = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        fakeSplashView.f55549u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
