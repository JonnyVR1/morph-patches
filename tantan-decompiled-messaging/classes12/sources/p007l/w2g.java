package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.ui.splash.FakeSplashView;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w2g {
    /* JADX INFO: renamed from: a */
    public static void m15678a(FakeSplashView fakeSplashView, View view) {
        fakeSplashView.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashView.b = viewGroup.getChildAt(0);
        fakeSplashView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashView.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15679b(FakeSplashView fakeSplashView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.W, viewGroup, false);
        m15678a(fakeSplashView, viewInflate);
        return viewInflate;
    }
}
