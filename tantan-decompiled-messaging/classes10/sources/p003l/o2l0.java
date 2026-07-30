package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.n2l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o2l0 {
    /* JADX INFO: renamed from: a */
    public static void m8391a(n2l0 n2l0Var, View view) {
        n2l0Var.e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        n2l0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n2l0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        n2l0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        n2l0Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        n2l0Var.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        n2l0Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8392b(n2l0 n2l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.r9, viewGroup, false);
        m8391a(n2l0Var, viewInflate);
        return viewInflate;
    }
}
