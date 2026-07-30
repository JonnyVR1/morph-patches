package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qe90 {
    /* JADX INFO: renamed from: a */
    public static void m174185a(pe90 pe90Var, View view) {
        pe90Var.f148407a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pe90Var.f148408b = (VText) viewGroup.getChildAt(0);
        pe90Var.f148409c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pe90Var.f148410d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pe90Var.f148411e = (VLinear) viewGroup.getChildAt(2);
        pe90Var.f148412f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pe90Var.f148413g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174186b(pe90 pe90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95895m9, viewGroup, false);
        m174185a(pe90Var, viewInflate);
        return viewInflate;
    }
}
