package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hya0 {
    /* JADX INFO: renamed from: a */
    public static void m137714a(gya0 gya0Var, View view) {
        gya0Var.f107036u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gya0Var.f107037v = (VText) viewGroup.getChildAt(0);
        gya0Var.f107038w = (VSwitchButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m137715b(gya0 gya0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125984oa, viewGroup, false);
        m137714a(gya0Var, viewInflate);
        return viewInflate;
    }
}
