package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashViewOld;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u2g {
    /* JADX INFO: renamed from: a */
    public static void m191490a(FakeSplashViewOld fakeSplashViewOld, View view) {
        fakeSplashViewOld.f54714g = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.f54715h = (VFrame_FixRatio) viewGroup.getChildAt(0);
        fakeSplashViewOld.f54716i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.f54717j = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191491b(FakeSplashViewOld fakeSplashViewOld, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.f89541W, viewGroup, false);
        m191490a(fakeSplashViewOld, viewInflate);
        return viewInflate;
    }
}
