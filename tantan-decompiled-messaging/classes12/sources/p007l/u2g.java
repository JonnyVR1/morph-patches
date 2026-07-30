package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.ui.splash.FakeSplashViewOld;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u2g {
    /* JADX INFO: renamed from: a */
    public static void m14714a(FakeSplashViewOld fakeSplashViewOld, View view) {
        fakeSplashViewOld.g = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.h = viewGroup.getChildAt(0);
        fakeSplashViewOld.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.j = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14715b(FakeSplashViewOld fakeSplashViewOld, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.W, viewGroup, false);
        m14714a(fakeSplashViewOld, viewInflate);
        return viewInflate;
    }
}
