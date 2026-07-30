package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.VipIntroPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class phl0 {
    /* JADX INFO: renamed from: a */
    public static void m8752a(VipIntroPage vipIntroPage, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipIntroPage.a = viewGroup.getChildAt(0);
        vipIntroPage.b = (TextView) viewGroup.getChildAt(1);
        vipIntroPage.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vipIntroPage.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        vipIntroPage.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        vipIntroPage.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        vipIntroPage.g = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        vipIntroPage.h = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vipIntroPage.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        vipIntroPage.j = viewGroup.getChildAt(3);
        vipIntroPage.k = viewGroup.getChildAt(4);
    }
}
