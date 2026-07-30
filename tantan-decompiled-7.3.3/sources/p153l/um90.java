package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class um90 {
    /* JADX INFO: renamed from: a */
    public static void m196639a(tm90 tm90Var, View view) {
        tm90Var.f174896a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tm90Var.f174897b = (VText) viewGroup.getChildAt(0);
        tm90Var.f174898c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tm90Var.f174899d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        tm90Var.f174900e = (VLinear) viewGroup.getChildAt(2);
        tm90Var.f174901f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        tm90Var.f174902g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m196640b(tm90 tm90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126068t9, viewGroup, false);
        m196639a(tm90Var, viewInflate);
        return viewInflate;
    }
}
