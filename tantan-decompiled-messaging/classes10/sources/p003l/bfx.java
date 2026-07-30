package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bfx {
    /* JADX INFO: renamed from: a */
    public static void m5716a(MbtiLayout mbtiLayout, View view) {
        mbtiLayout.a = (MbtiLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mbtiLayout.b = viewGroup.getChildAt(0);
        mbtiLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mbtiLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mbtiLayout.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mbtiLayout.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mbtiLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        mbtiLayout.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        mbtiLayout.i = viewGroup.getChildAt(2);
        mbtiLayout.j = viewGroup.getChildAt(3);
        mbtiLayout.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        mbtiLayout.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        mbtiLayout.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mbtiLayout.n = viewGroup.getChildAt(4);
        mbtiLayout.o = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
