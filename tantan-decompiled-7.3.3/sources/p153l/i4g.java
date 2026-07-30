package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashViewOld;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class i4g {
    /* JADX INFO: renamed from: a */
    public static void m138490a(FakeSplashViewOld fakeSplashViewOld, View view) {
        fakeSplashViewOld.f55562g = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.f55563h = (VFrame_FixRatio) viewGroup.getChildAt(0);
        fakeSplashViewOld.f55564i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f55565j = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m138491b(FakeSplashViewOld fakeSplashViewOld, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(jec0.f120454W, viewGroup, false);
        m138490a(fakeSplashViewOld, viewInflate);
        return viewInflate;
    }
}
