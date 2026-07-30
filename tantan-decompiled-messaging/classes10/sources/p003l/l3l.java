package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.operation.HomeCardDefaultButtons;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l3l {
    /* JADX INFO: renamed from: a */
    public static void m7663a(HomeCardDefaultButtons homeCardDefaultButtons, View view) {
        homeCardDefaultButtons.a = (HomeCardDefaultButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardDefaultButtons.b = viewGroup.getChildAt(0);
        homeCardDefaultButtons.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardDefaultButtons.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardDefaultButtons.e = viewGroup.getChildAt(1);
        homeCardDefaultButtons.f = viewGroup.getChildAt(2);
        homeCardDefaultButtons.g = (FrameLayout) viewGroup.getChildAt(3);
        homeCardDefaultButtons.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        homeCardDefaultButtons.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        homeCardDefaultButtons.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        homeCardDefaultButtons.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        homeCardDefaultButtons.l = viewGroup.getChildAt(4);
        homeCardDefaultButtons.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
