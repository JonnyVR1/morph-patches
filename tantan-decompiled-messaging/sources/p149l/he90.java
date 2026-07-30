package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class he90 {
    /* JADX INFO: renamed from: a */
    public static void m130623a(ge90 ge90Var, View view) {
        ge90Var.f102169u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ge90Var.f102170v = (VText) viewGroup.getChildAt(0);
        ge90Var.f102171w = (LinearLayout) viewGroup.getChildAt(1);
        ge90Var.f102172x = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ge90Var.f102173y = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m130624b(ge90 ge90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95500O9, viewGroup, false);
        m130623a(ge90Var, viewInflate);
        return viewInflate;
    }
}
