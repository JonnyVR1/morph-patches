package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.cym0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dym0 {
    /* JADX INFO: renamed from: a */
    public static void m12089a(cym0 cym0Var, View view) {
        cym0Var.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cym0Var.b = viewGroup.getChildAt(0);
        cym0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cym0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cym0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cym0Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        cym0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        cym0Var.h = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        cym0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cym0Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        cym0Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        cym0Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        cym0Var.m = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        cym0Var.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m12090b(cym0 cym0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19880i8, viewGroup, false);
        m12089a(cym0Var, viewInflate);
        return viewInflate;
    }
}
