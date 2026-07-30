package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yy2 {
    /* JADX INFO: renamed from: a */
    public static void m11318a(xy2 xy2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xy2Var.f8594a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xy2Var.f8595b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        xy2Var.f8596c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        xy2Var.f8597d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        xy2Var.f8598e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        xy2Var.f8599f = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        xy2Var.f8600g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        xy2Var.f8601h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        xy2Var.f8602i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        xy2Var.f8603j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        xy2Var.f8604k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m11319b(xy2 xy2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.r4, viewGroup, false);
        m11318a(xy2Var, viewInflate);
        return viewInflate;
    }
}
