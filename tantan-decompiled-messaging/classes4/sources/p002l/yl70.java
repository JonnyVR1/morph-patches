package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.xl70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yl70 {
    /* JADX INFO: renamed from: a */
    public static void m26798a(xl70 xl70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xl70Var.i = viewGroup.getChildAt(0);
        xl70Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        xl70Var.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        xl70Var.l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        xl70Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m26799b(xl70 xl70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19664R4, viewGroup, false);
        m26798a(xl70Var, viewInflate);
        return viewInflate;
    }
}
