package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.tan0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uan0 {
    /* JADX INFO: renamed from: a */
    public static void m23413a(tan0 tan0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tan0Var.a = viewGroup.getChildAt(0);
        tan0Var.b = (FrameLayout) viewGroup.getChildAt(1);
        tan0Var.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tan0Var.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tan0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        tan0Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        tan0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        tan0Var.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        tan0Var.i = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        tan0Var.j = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        tan0Var.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        tan0Var.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        tan0Var.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        tan0Var.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        tan0Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(4);
        tan0Var.p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(5);
        tan0Var.q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        tan0Var.r = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m23414b(tan0 tan0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19644P8, viewGroup, false);
        m23413a(tan0Var, viewInflate);
        return viewInflate;
    }
}
