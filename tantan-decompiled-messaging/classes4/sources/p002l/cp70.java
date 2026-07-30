package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.do70;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cp70 {
    /* JADX INFO: renamed from: a */
    public static void m11270a(do70 do70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        do70Var.i = viewGroup.getChildAt(0);
        do70Var.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        do70Var.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        do70Var.l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11271b(do70 do70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19688T4, viewGroup, false);
        m11270a(do70Var, viewInflate);
        return viewInflate;
    }
}
