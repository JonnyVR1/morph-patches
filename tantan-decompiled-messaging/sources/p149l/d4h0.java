package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class d4h0 {
    /* JADX INFO: renamed from: a */
    public static void m109986a(y3h0 y3h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y3h0Var.f195801f = viewGroup.getChildAt(0);
        y3h0Var.f195802g = (LinearLayout) viewGroup.getChildAt(1);
        y3h0Var.f195803h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        y3h0Var.f195804i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109987b(y3h0 y3h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95881lc, viewGroup, false);
        m109986a(y3h0Var, viewInflate);
        return viewInflate;
    }
}
