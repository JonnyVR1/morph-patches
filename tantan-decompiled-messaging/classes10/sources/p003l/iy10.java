package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.f6c0;
import l.hy10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iy10 {
    /* JADX INFO: renamed from: a */
    public static void m7307a(hy10 hy10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hy10Var.a = (LinearLayout) viewGroup.getChildAt(0);
        hy10Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hy10Var.c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hy10Var.d = viewGroup.getChildAt(1);
        hy10Var.e = viewGroup.getChildAt(2);
        hy10Var.f = viewGroup.getChildAt(3);
        hy10Var.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        hy10Var.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7308b(hy10 hy10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H7, viewGroup, false);
        m7307a(hy10Var, viewInflate);
        return viewInflate;
    }
}
