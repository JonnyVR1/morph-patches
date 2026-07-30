package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VCheckBox;
import p147v.VDelegateLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VPagerWormIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class v2g {
    /* JADX INFO: renamed from: a */
    public static void m196784a(FakeSplashView fakeSplashView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashView.f54685e = (ConstraintLayout) viewGroup.getChildAt(0);
        fakeSplashView.f54686f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashView.f54687g = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeSplashView.f54688h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fakeSplashView.f54689i = (LinearLayout) viewGroup.getChildAt(1);
        fakeSplashView.f54690j = (VDelegateLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fakeSplashView.f54691k = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fakeSplashView.f54692l = (VPagerWormIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fakeSplashView.f54693m = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fakeSplashView.f54694n = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        fakeSplashView.f54695o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        fakeSplashView.f54696p = (ConstraintLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fakeSplashView.f54697q = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        fakeSplashView.f54698r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        fakeSplashView.f54699s = (VLinear) viewGroup.getChildAt(2);
        fakeSplashView.f54700t = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        fakeSplashView.f54701u = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
