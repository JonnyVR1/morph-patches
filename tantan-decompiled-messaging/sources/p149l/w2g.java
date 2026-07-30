package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashView;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class w2g {
    /* JADX INFO: renamed from: a */
    public static void m201112a(FakeSplashView fakeSplashView, View view) {
        fakeSplashView.f54681a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashView.f54682b = (VFrame_FixRatio) viewGroup.getChildAt(0);
        fakeSplashView.f54683c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashView.f54684d = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m201113b(FakeSplashView fakeSplashView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89541W, viewGroup, false);
        m201112a(fakeSplashView, viewInflate);
        return viewInflate;
    }
}
