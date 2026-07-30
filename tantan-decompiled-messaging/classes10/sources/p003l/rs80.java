package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.qs80;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rs80 {
    /* JADX INFO: renamed from: a */
    public static void m9182a(qs80 qs80Var, View view) {
        qs80Var.b = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qs80Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qs80Var.d = viewGroup.getChildAt(1);
        qs80Var.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9183b(qs80 qs80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5554i1, viewGroup, false);
        m9182a(qs80Var, viewInflate);
        return viewInflate;
    }
}
