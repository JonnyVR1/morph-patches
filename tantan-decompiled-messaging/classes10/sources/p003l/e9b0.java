package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import l.d9b0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e9b0 {
    /* JADX INFO: renamed from: a */
    public static void m6255a(d9b0 d9b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d9b0Var.a = (Space) viewGroup.getChildAt(0);
        d9b0Var.b = (FrameLayout) viewGroup.getChildAt(1);
        d9b0Var.c = (FrameLayout) viewGroup.getChildAt(2);
        d9b0Var.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        d9b0Var.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        d9b0Var.f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        d9b0Var.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        d9b0Var.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        d9b0Var.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        d9b0Var.j = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        d9b0Var.k = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        d9b0Var.l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1);
        d9b0Var.m = (LinearLayout) viewGroup.getChildAt(3);
        d9b0Var.n = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        d9b0Var.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        d9b0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        d9b0Var.q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        d9b0Var.r = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6256b(d9b0 d9b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.H1, viewGroup, false);
        m6255a(d9b0Var, viewInflate);
        return viewInflate;
    }
}
