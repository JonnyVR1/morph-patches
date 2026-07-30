package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class jpi0 {
    /* JADX INFO: renamed from: a */
    public static void m146502a(ipi0 ipi0Var, View view) {
        ipi0Var.f116274a = (VNavigationBar) ((ViewGroup) view).getChildAt(0);
        ipi0Var.f116275b = (VList) view.findViewById(adc0.f70301d7);
        ViewGroup viewGroup = (ViewGroup) view;
        ipi0Var.f116276c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ipi0Var.f116277d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ipi0Var.f116278e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146503b(ipi0 ipi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125477Jc, viewGroup, false);
        m146502a(ipi0Var, viewInflate);
        return viewInflate;
    }
}
