package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.views.HomePlatinumButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x8l {
    /* JADX INFO: renamed from: a */
    public static void m10699a(HomePlatinumButton homePlatinumButton, View view) {
        homePlatinumButton.a = (HomePlatinumButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homePlatinumButton.b = viewGroup.getChildAt(0);
        homePlatinumButton.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homePlatinumButton.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homePlatinumButton.e = (FrameLayout) viewGroup.getChildAt(1);
        homePlatinumButton.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homePlatinumButton.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homePlatinumButton.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homePlatinumButton.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homePlatinumButton.j = viewGroup.getChildAt(2);
        homePlatinumButton.k = viewGroup.getChildAt(3);
        homePlatinumButton.l = viewGroup.getChildAt(4);
        homePlatinumButton.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homePlatinumButton.n = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
