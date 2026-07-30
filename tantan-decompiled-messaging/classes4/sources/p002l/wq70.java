package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.vq70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wq70 {
    /* JADX INFO: renamed from: a */
    public static void m25301a(vq70 vq70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vq70Var.i = viewGroup.getChildAt(0);
        vq70Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vq70Var.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        vq70Var.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        vq70Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        vq70Var.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vq70Var.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vq70Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        vq70Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        vq70Var.r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        vq70Var.s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m25302b(vq70 vq70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19724W4, viewGroup, false);
        m25301a(vq70Var, viewInflate);
        return viewInflate;
    }
}
