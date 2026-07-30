package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.oe20;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pe20 {
    /* JADX INFO: renamed from: a */
    public static void m8738a(oe20 oe20Var, View view) {
        oe20Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        oe20Var.b = viewGroup.getChildAt(0);
        oe20Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        oe20Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        oe20Var.e = viewGroup.getChildAt(2);
        oe20Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        oe20Var.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8739b(oe20 oe20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.l0, viewGroup, false);
        m8738a(oe20Var, viewInflate);
        return viewInflate;
    }
}
