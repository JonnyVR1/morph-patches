package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class dua0 {
    /* JADX INFO: renamed from: a */
    public static void m113676a(cua0 cua0Var, View view) {
        cua0Var.f82544u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cua0Var.f82545v = (VText) viewGroup.getChildAt(0);
        cua0Var.f82546w = (VText_Tags) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113677b(cua0 cua0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95930oa, viewGroup, false);
        m113676a(cua0Var, viewInflate);
        return viewInflate;
    }
}
