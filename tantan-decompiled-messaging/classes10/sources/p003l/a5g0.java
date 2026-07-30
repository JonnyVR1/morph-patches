package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.z4g0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a5g0 {
    /* JADX INFO: renamed from: a */
    public static void m5275a(z4g0 z4g0Var, View view) {
        z4g0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z4g0Var.b = viewGroup.getChildAt(0);
        z4g0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z4g0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5276b(z4g0 z4g0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ye, viewGroup, false);
        m5275a(z4g0Var, viewInflate);
        return viewInflate;
    }
}
