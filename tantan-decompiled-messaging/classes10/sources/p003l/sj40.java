package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.rj40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sj40 {
    /* JADX INFO: renamed from: a */
    public static void m9353a(rj40 rj40Var, View view) {
        rj40Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rj40Var.b = viewGroup.getChildAt(0);
        rj40Var.c = viewGroup.getChildAt(1);
        rj40Var.d = (ImageView) viewGroup.getChildAt(2);
        rj40Var.e = (TextView) viewGroup.getChildAt(3);
        rj40Var.f = viewGroup.getChildAt(4);
        rj40Var.g = viewGroup.getChildAt(5);
        rj40Var.h = viewGroup.getChildAt(6);
        rj40Var.i = viewGroup.getChildAt(7);
        rj40Var.j = viewGroup.getChildAt(9);
        rj40Var.k = viewGroup.getChildAt(10);
        rj40Var.l = viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m9354b(rj40 rj40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.i8, viewGroup, false);
        m9353a(rj40Var, viewInflate);
        return viewInflate;
    }
}
