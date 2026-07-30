package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bza0 {
    /* JADX INFO: renamed from: a */
    public static void m107138a(aza0 aza0Var, View view) {
        aza0Var.f74120u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aza0Var.f74121v = (VText) viewGroup.getChildAt(0);
        aza0Var.f74122w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107139b(aza0 aza0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126052sa, viewGroup, false);
        m107138a(aza0Var, viewInflate);
        return viewInflate;
    }
}
