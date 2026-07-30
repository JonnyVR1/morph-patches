package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lr90 {
    /* JADX INFO: renamed from: a */
    public static void m151140a(kr90 kr90Var, View view) {
        kr90Var.f124332u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kr90Var.f124333v = (VText) viewGroup.getChildAt(0);
        kr90Var.f124334w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m151141b(kr90 kr90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95549Ra, viewGroup, false);
        m151140a(kr90Var, viewInflate);
        return viewInflate;
    }
}
