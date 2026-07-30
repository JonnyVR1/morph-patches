package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qqa0 {
    /* JADX INFO: renamed from: a */
    public static void m175879a(pqa0 pqa0Var, View view) {
        pqa0Var.f150776u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pqa0Var.f150777v = (VText) viewGroup.getChildAt(0);
        pqa0Var.f150778w = (VText) viewGroup.getChildAt(1);
        pqa0Var.f150779x = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m175880b(pqa0 pqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95829ia, viewGroup, false);
        m175879a(pqa0Var, viewInflate);
        return viewInflate;
    }
}
