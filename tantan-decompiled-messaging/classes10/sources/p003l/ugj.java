package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.GPVipIntroPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ugj {
    /* JADX INFO: renamed from: a */
    public static void m9721a(GPVipIntroPage gPVipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPVipIntroPage.a = viewGroup.getChildAt(0);
        gPVipIntroPage.b = (TextView) viewGroup.getChildAt(1);
        gPVipIntroPage.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gPVipIntroPage.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPVipIntroPage.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        gPVipIntroPage.g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        gPVipIntroPage.h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gPVipIntroPage.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gPVipIntroPage.j = viewGroup.getChildAt(3);
        gPVipIntroPage.k = viewGroup.getChildAt(4);
    }
}
