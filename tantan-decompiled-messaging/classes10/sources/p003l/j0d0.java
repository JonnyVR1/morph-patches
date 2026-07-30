package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.i0d0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j0d0 {
    /* JADX INFO: renamed from: a */
    public static void m7315a(i0d0 i0d0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i0d0Var.j = viewGroup.getChildAt(0);
        i0d0Var.k = viewGroup.getChildAt(1);
        i0d0Var.l = viewGroup.getChildAt(2);
        i0d0Var.m = viewGroup.getChildAt(3);
        i0d0Var.n = viewGroup.getChildAt(4);
        i0d0Var.o = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7316b(i0d0 i0d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5528c, viewGroup, false);
        m7315a(i0d0Var, viewInflate);
        return viewInflate;
    }
}
