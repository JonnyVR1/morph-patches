package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y8l {
    /* JADX INFO: renamed from: a */
    public static void m11162a(HomeSayHiNewButton homeSayHiNewButton, View view) {
        homeSayHiNewButton.a = (HomeSayHiNewButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeSayHiNewButton.b = viewGroup.getChildAt(0);
        homeSayHiNewButton.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeSayHiNewButton.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeSayHiNewButton.e = (FrameLayout) viewGroup.getChildAt(1);
        homeSayHiNewButton.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeSayHiNewButton.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeSayHiNewButton.j = viewGroup.getChildAt(2);
        homeSayHiNewButton.k = viewGroup.getChildAt(3);
        homeSayHiNewButton.l = viewGroup.getChildAt(4);
        homeSayHiNewButton.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        homeSayHiNewButton.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(0);
    }
}
