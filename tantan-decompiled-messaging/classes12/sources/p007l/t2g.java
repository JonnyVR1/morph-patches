package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.ui.splash.FakeSplashViewOld;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t2g {
    /* JADX INFO: renamed from: a */
    public static void m14420a(FakeSplashViewOld fakeSplashViewOld, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeSplashViewOld.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.d = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        fakeSplashViewOld.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        fakeSplashViewOld.f = viewGroup.getChildAt(1);
    }
}
