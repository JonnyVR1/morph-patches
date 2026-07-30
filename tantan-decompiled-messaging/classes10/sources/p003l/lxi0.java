package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.kxi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lxi0 {
    /* JADX INFO: renamed from: a */
    public static void m7927a(kxi0 kxi0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kxi0Var.b = viewGroup.getChildAt(0);
        kxi0Var.c = viewGroup.getChildAt(1);
        kxi0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        kxi0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        kxi0Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        kxi0Var.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        kxi0Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        kxi0Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        kxi0Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7928b(kxi0 kxi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.S5, viewGroup, false);
        m7927a(kxi0Var, viewInflate);
        return viewInflate;
    }
}
