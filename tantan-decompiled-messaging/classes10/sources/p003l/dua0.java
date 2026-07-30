package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cua0;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dua0 {
    /* JADX INFO: renamed from: a */
    public static void m6209a(cua0 cua0Var, View view) {
        cua0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cua0Var.v = viewGroup.getChildAt(0);
        cua0Var.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6210b(cua0 cua0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.oa, viewGroup, false);
        m6209a(cua0Var, viewInflate);
        return viewInflate;
    }
}
