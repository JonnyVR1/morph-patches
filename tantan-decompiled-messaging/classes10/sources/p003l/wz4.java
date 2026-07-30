package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.uz4;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wz4 {
    /* JADX INFO: renamed from: a */
    public static void m10608a(uz4 uz4Var, View view) {
        uz4Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uz4Var.g = viewGroup.getChildAt(0);
        uz4Var.h = viewGroup.getChildAt(1);
        uz4Var.i = viewGroup.getChildAt(2);
        uz4Var.j = viewGroup.getChildAt(3);
        uz4Var.k = viewGroup.getChildAt(4);
        uz4Var.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        uz4Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        uz4Var.n = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        uz4Var.o = viewGroup.getChildAt(5);
        uz4Var.p = viewGroup.getChildAt(6);
        uz4Var.q = viewGroup.getChildAt(7);
        uz4Var.r = viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m10609b(uz4 uz4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.g1, viewGroup, false);
        m10608a(uz4Var, viewInflate);
        return viewInflate;
    }
}
