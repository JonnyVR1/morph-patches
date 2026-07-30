package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ey90 {
    /* JADX INFO: renamed from: a */
    public static void m123190a(dy90 dy90Var, View view) {
        dy90Var.f91190u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dy90Var.f91191v = (VText) viewGroup.getChildAt(0);
        dy90Var.f91192w = (VText) viewGroup.getChildAt(1);
        dy90Var.f91193x = (VText) viewGroup.getChildAt(2);
        dy90Var.f91194y = (VText) viewGroup.getChildAt(3);
        dy90Var.f91195z = (VText) viewGroup.getChildAt(4);
        dy90Var.f91172A = (VText) viewGroup.getChildAt(5);
        dy90Var.f91173B = (VText) viewGroup.getChildAt(6);
        dy90Var.f91174C = (VText) viewGroup.getChildAt(7);
        dy90Var.f91175D = (VText) viewGroup.getChildAt(8);
        dy90Var.f91176E = (VText) viewGroup.getChildAt(9);
        dy90Var.f91177F = (VText) viewGroup.getChildAt(10);
        dy90Var.f91178G = (VText) viewGroup.getChildAt(11);
        dy90Var.f91179H = (VText) viewGroup.getChildAt(12);
        dy90Var.f91180I = (VText) viewGroup.getChildAt(13);
        dy90Var.f91181J = (VText) viewGroup.getChildAt(14);
        dy90Var.f91182K = (VText) viewGroup.getChildAt(15);
        dy90Var.f91183L = (VText) viewGroup.getChildAt(16);
        dy90Var.f91184M = (VText) viewGroup.getChildAt(17);
        dy90Var.f91185N = (VText) viewGroup.getChildAt(18);
        dy90Var.f91186O = (VText) viewGroup.getChildAt(19);
        dy90Var.f91187P = (VText) viewGroup.getChildAt(20);
        dy90Var.f91188Q = (VText) viewGroup.getChildAt(21);
    }

    /* JADX INFO: renamed from: b */
    public static View m123191b(dy90 dy90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125798da, viewGroup, false);
        m123190a(dy90Var, viewInflate);
        return viewInflate;
    }
}
