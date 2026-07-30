package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.uym0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vym0 {
    /* JADX INFO: renamed from: a */
    public static void m24231a(uym0 uym0Var, View view) {
        uym0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uym0Var.b = viewGroup.getChildAt(0);
        uym0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        uym0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        uym0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        uym0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        uym0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        uym0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        uym0Var.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        uym0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        uym0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m24232b(uym0 uym0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19919l8, viewGroup, false);
        m24231a(uym0Var, viewInflate);
        return viewInflate;
    }
}
