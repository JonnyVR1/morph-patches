package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashViewOld;
import p147v.VButton_FakeShadow;
import p147v.VDelegateLayout;
import p147v.VPager;
import p147v.VPagerWormIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class t2g {
    /* JADX INFO: renamed from: a */
    public static void m186969a(FakeSplashViewOld fakeSplashViewOld, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.f54708a = (VDelegateLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f54709b = (VPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f54710c = (VPagerWormIndicator) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.f54711d = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f54712e = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.f54713f = (VText) viewGroup.getChildAt(1);
    }
}
