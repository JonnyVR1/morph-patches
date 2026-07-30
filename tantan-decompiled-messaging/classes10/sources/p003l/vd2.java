package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.ud2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vd2 {
    /* JADX INFO: renamed from: a */
    public static void m10214a(ud2 ud2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ud2Var.l = viewGroup.getChildAt(0);
        ud2Var.m = viewGroup.getChildAt(1);
        ud2Var.n = viewGroup.getChildAt(2);
        ud2Var.o = viewGroup.getChildAt(3);
        ud2Var.p = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10215b(ud2 ud2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.T, viewGroup, false);
        m10214a(ud2Var, viewInflate);
        return viewInflate;
    }
}
