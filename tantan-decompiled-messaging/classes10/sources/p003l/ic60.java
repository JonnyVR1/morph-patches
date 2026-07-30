package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.hc60;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ic60 {
    /* JADX INFO: renamed from: a */
    public static void m7149a(hc60 hc60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hc60Var.b = viewGroup.getChildAt(0);
        hc60Var.c = viewGroup.getChildAt(3);
        hc60Var.d = viewGroup.getChildAt(4);
        hc60Var.e = viewGroup.getChildAt(5);
        hc60Var.f = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        hc60Var.g = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        hc60Var.h = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        hc60Var.i = viewGroup.getChildAt(6);
        hc60Var.j = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        hc60Var.k = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        hc60Var.l = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        hc60Var.m = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        hc60Var.n = viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m7150b(hc60 hc60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.y, viewGroup, false);
        m7149a(hc60Var, viewInflate);
        return viewInflate;
    }
}
