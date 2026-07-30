package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import l.f6c0;
import l.jh30;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kh30 {
    /* JADX INFO: renamed from: a */
    public static void m7596a(jh30 jh30Var, View view) {
        jh30Var.b = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jh30Var.c = viewGroup.getChildAt(0);
        jh30Var.d = (ScrollView) viewGroup.getChildAt(1);
        jh30Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        jh30Var.f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jh30Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        jh30Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jh30Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        jh30Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        jh30Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        jh30Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        jh30Var.m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3);
        jh30Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0);
        jh30Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(0);
        jh30Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        jh30Var.q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(2);
        jh30Var.r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(3)).getChildAt(0)).getChildAt(3);
        jh30Var.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4);
        jh30Var.t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
        jh30Var.u = (Space) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(6);
        jh30Var.v = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7);
        jh30Var.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(0);
        jh30Var.x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(1);
        jh30Var.y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(7)).getChildAt(2);
        jh30Var.z = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        jh30Var.A = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        jh30Var.B = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        jh30Var.C = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        jh30Var.D = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m7597b(jh30 jh30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.h8, viewGroup, false);
        m7596a(jh30Var, viewInflate);
        return viewInflate;
    }
}
