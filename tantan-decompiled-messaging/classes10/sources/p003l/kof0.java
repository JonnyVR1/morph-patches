package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.jof0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kof0 {
    /* JADX INFO: renamed from: a */
    public static void m7625a(jof0 jof0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jof0Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jof0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jof0Var.c = viewGroup.getChildAt(1);
        jof0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jof0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        jof0Var.f = viewGroup.getChildAt(2);
        jof0Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        jof0Var.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        jof0Var.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        jof0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        jof0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        jof0Var.l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        jof0Var.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7626b(jof0 jof0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ab, viewGroup, false);
        m7625a(jof0Var, viewInflate);
        return viewInflate;
    }
}
