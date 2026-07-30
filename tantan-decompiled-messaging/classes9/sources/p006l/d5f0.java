package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d5f0 {
    /* JADX INFO: renamed from: a */
    public static void m13794a(c5f0 c5f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c5f0Var.f9372c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c5f0Var.f9373d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c5f0Var.f9374e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c5f0Var.f9375f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c5f0Var.f9376g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13795b(c5f0 c5f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9409S, viewGroup, false);
        m13794a(c5f0Var, viewInflate);
        return viewInflate;
    }
}
