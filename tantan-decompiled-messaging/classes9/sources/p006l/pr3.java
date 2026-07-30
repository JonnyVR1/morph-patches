package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pr3 {
    /* JADX INFO: renamed from: a */
    public static void m21656a(or3 or3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        or3Var.f18335c = viewGroup.getChildAt(0);
        or3Var.f18336d = viewGroup.getChildAt(1);
        or3Var.f18337e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        or3Var.f18338f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        or3Var.f18339g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        or3Var.f18340h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        or3Var.f18341i = viewGroup.getChildAt(2);
        or3Var.f18342j = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m21657b(or3 or3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9437k, viewGroup, false);
        m21656a(or3Var, viewInflate);
        return viewInflate;
    }
}
