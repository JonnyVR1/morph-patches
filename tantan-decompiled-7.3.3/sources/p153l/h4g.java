package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashViewOld;
import p151v.VButton_FakeShadow;
import p151v.VDelegateLayout;
import p151v.VPager;
import p151v.VPagerWormIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class h4g {
    /* JADX INFO: renamed from: a */
    public static void m133573a(FakeSplashViewOld fakeSplashViewOld, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.f55556a = (VDelegateLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f55557b = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f55558c = (VPagerWormIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.f55559d = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f55560e = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.f55561f = (VText) viewGroup.getChildAt(1);
    }
}
