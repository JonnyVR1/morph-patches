package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dqa0 {
    /* JADX INFO: renamed from: a */
    public static void m112996a(cqa0 cqa0Var, View view) {
        cqa0Var.f82050u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cqa0Var.f82051v = (VText) viewGroup.getChildAt(0);
        cqa0Var.f82052w = (VSwitchButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m112997b(cqa0 cqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95812ha, viewGroup, false);
        m112996a(cqa0Var, viewInflate);
        return viewInflate;
    }
}
