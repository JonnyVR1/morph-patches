package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.i6c0;
import l.qsh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rsh0 {
    /* JADX INFO: renamed from: a */
    public static void m9184a(qsh0 qsh0Var, View view) {
        qsh0Var.a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qsh0Var.b = viewGroup.getChildAt(0);
        qsh0Var.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qsh0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qsh0Var.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        qsh0Var.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        qsh0Var.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        qsh0Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        qsh0Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        qsh0Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        qsh0Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        qsh0Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        qsh0Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        qsh0Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        qsh0Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        qsh0Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        qsh0Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        qsh0Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(2)).getChildAt(2);
        qsh0Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2);
        qsh0Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(0);
        qsh0Var.u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(1);
        qsh0Var.v = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        qsh0Var.w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3);
        qsh0Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        qsh0Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(1);
        qsh0Var.z = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(3)).getChildAt(2);
        qsh0Var.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        qsh0Var.B = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m9185b(qsh0 qsh0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.b, viewGroup, false);
        m9184a(qsh0Var, viewInflate);
        return viewInflate;
    }
}
