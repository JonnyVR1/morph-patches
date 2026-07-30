package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashView;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class k4g {
    /* JADX INFO: renamed from: a */
    public static void m148241a(FakeSplashView fakeSplashView, View view) {
        fakeSplashView.f55529a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashView.f55530b = (VFrame_FixRatio) viewGroup.getChildAt(0);
        fakeSplashView.f55531c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashView.f55532d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m148242b(FakeSplashView fakeSplashView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120454W, viewGroup, false);
        m148241a(fakeSplashView, viewInflate);
        return viewInflate;
    }
}
