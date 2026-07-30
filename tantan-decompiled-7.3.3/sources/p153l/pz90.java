package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pz90 {
    /* JADX INFO: renamed from: a */
    public static void m174347a(oz90 oz90Var, View view) {
        oz90Var.f149848u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oz90Var.f149849v = (VText) viewGroup.getChildAt(0);
        oz90Var.f149850w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174348b(oz90 oz90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125715Ya, viewGroup, false);
        m174347a(oz90Var, viewInflate);
        return viewInflate;
    }
}
