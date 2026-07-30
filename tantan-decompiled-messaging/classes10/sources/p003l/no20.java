package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.mo20;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class no20 {
    /* JADX INFO: renamed from: a */
    public static void m8366a(mo20 mo20Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mo20Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mo20Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mo20Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mo20Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mo20Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mo20Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        mo20Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        mo20Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        mo20Var.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        mo20Var.j = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        mo20Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        mo20Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        mo20Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        mo20Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8367b(mo20 mo20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.m0, viewGroup, false);
        m8366a(mo20Var, viewInflate);
        return viewInflate;
    }
}
