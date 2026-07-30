package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.w940;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x940 {
    /* JADX INFO: renamed from: a */
    public static void m10716a(w940 w940Var, View view) {
        w940Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w940Var.b = viewGroup.getChildAt(0);
        w940Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10717b(w940 w940Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6027m2, viewGroup, false);
        m10716a(w940Var, viewInflate);
        return viewInflate;
    }
}
