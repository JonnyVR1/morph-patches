package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jl2 {
    /* JADX INFO: renamed from: a */
    public static void m145936a(il2 il2Var, View view) {
        il2Var.f115491a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        il2Var.f115492b = viewGroup.getChildAt(0);
        il2Var.f115493c = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        il2Var.f115494d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m145937b(il2 il2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198992Z0, viewGroup, false);
        m145936a(il2Var, viewInflate);
        return viewInflate;
    }
}
