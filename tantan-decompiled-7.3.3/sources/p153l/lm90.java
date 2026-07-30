package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lm90 {
    /* JADX INFO: renamed from: a */
    public static void m154849a(km90 km90Var, View view) {
        km90Var.f127452u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        km90Var.f127453v = (VText) viewGroup.getChildAt(0);
        km90Var.f127454w = (LinearLayout) viewGroup.getChildAt(1);
        km90Var.f127455x = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        km90Var.f127456y = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m154850b(km90 km90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125666V9, viewGroup, false);
        m154849a(km90Var, viewInflate);
        return viewInflate;
    }
}
