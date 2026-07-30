package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.o34;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p34 {
    /* JADX INFO: renamed from: a */
    public static void m20016a(o34 o34Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o34Var.a = viewGroup.getChildAt(0);
        o34Var.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        o34Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        o34Var.d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        o34Var.e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        o34Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        o34Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        o34Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        o34Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        o34Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        o34Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        o34Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m20017b(o34 o34Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19575K, viewGroup, false);
        m20016a(o34Var, viewInflate);
        return viewInflate;
    }
}
