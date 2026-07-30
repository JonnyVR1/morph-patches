package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.ly90;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class my90 {
    /* JADX INFO: renamed from: a */
    public static void m8289a(ly90 ly90Var, View view) {
        ly90Var.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ly90Var.b = viewGroup.getChildAt(0);
        ly90Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ly90Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ly90Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ly90Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ly90Var.g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8290b(ly90 ly90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.T9, viewGroup, false);
        m8289a(ly90Var, viewInflate);
        return viewInflate;
    }
}
