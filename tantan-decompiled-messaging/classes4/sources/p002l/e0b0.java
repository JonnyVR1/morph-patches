package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.d0b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e0b0 {
    /* JADX INFO: renamed from: a */
    public static void m12094a(d0b0 d0b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d0b0Var.i = viewGroup.getChildAt(0);
        d0b0Var.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        d0b0Var.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        d0b0Var.l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        d0b0Var.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        d0b0Var.n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12095b(d0b0 d0b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19897k, viewGroup, false);
        m12094a(d0b0Var, viewInflate);
        return viewInflate;
    }
}
