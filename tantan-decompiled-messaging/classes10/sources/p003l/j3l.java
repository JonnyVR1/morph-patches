package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j3l {
    /* JADX INFO: renamed from: a */
    public static void m7333a(HomeCardBottomOptButtons homeCardBottomOptButtons, View view) {
        homeCardBottomOptButtons.a = (HomeCardBottomOptButtons) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardBottomOptButtons.b = viewGroup.getChildAt(0);
        homeCardBottomOptButtons.c = viewGroup.getChildAt(1);
        homeCardBottomOptButtons.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        homeCardBottomOptButtons.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        homeCardBottomOptButtons.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        homeCardBottomOptButtons.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        homeCardBottomOptButtons.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        homeCardBottomOptButtons.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        homeCardBottomOptButtons.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        homeCardBottomOptButtons.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        homeCardBottomOptButtons.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        homeCardBottomOptButtons.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        homeCardBottomOptButtons.p = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
