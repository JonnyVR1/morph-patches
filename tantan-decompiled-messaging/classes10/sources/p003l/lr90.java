package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.kr90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lr90 {
    /* JADX INFO: renamed from: a */
    public static void m7792a(kr90 kr90Var, View view) {
        kr90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kr90Var.v = viewGroup.getChildAt(0);
        kr90Var.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7793b(kr90 kr90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ra, viewGroup, false);
        m7792a(kr90Var, viewInflate);
        return viewInflate;
    }
}
