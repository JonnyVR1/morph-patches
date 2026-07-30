package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uqa0 {
    /* JADX INFO: renamed from: a */
    public static void m194985a(tqa0 tqa0Var, View view) {
        tqa0Var.f171559u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqa0Var.f171560v = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tqa0Var.f171561w = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tqa0Var.f171562x = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m194986b(tqa0 tqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95845ja, viewGroup, false);
        m194985a(tqa0Var, viewInflate);
        return viewInflate;
    }
}
