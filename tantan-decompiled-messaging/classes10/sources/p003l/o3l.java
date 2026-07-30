package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o3l {
    /* JADX INFO: renamed from: a */
    public static void m8394a(HomeCardExpandedButtons homeCardExpandedButtons, View view) {
        homeCardExpandedButtons.a = (HomeCardExpandedButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardExpandedButtons.b = viewGroup.getChildAt(0);
        homeCardExpandedButtons.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardExpandedButtons.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardExpandedButtons.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        homeCardExpandedButtons.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        homeCardExpandedButtons.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardExpandedButtons.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        homeCardExpandedButtons.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        homeCardExpandedButtons.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        homeCardExpandedButtons.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        homeCardExpandedButtons.n = viewGroup.getChildAt(1);
    }
}
