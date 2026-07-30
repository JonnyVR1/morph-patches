package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.f6c0;
import l.kq90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lq90 {
    /* JADX INFO: renamed from: a */
    public static void m7765a(kq90 kq90Var, View view) {
        kq90Var.a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kq90Var.b = viewGroup.getChildAt(0);
        kq90Var.c = viewGroup.getChildAt(1);
        kq90Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kq90Var.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        kq90Var.f = viewGroup.getChildAt(2);
        kq90Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        kq90Var.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        kq90Var.i = viewGroup.getChildAt(3);
        kq90Var.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        kq90Var.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        kq90Var.l = viewGroup.getChildAt(4);
        kq90Var.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        kq90Var.n = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        kq90Var.o = viewGroup.getChildAt(5);
        kq90Var.p = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        kq90Var.q = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        kq90Var.r = viewGroup.getChildAt(6);
        kq90Var.s = ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        kq90Var.t = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        kq90Var.u = (LinearLayout) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m7766b(kq90 kq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ba, viewGroup, false);
        m7765a(kq90Var, viewInflate);
        return viewInflate;
    }
}
