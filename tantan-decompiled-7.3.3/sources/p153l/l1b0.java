package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l1b0 {
    /* JADX INFO: renamed from: a */
    public static void m152467a(k1b0 k1b0Var, View view) {
        k1b0Var.f123470u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k1b0Var.f123471v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        k1b0Var.f123472w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m152468b(k1b0 k1b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126035ra, viewGroup, false);
        m152467a(k1b0Var, viewInflate);
        return viewInflate;
    }
}
