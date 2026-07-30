package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.kl1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ll1 {
    /* JADX INFO: renamed from: a */
    public static void m7737a(kl1 kl1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kl1Var.a = viewGroup.getChildAt(0);
        kl1Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        kl1Var.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        kl1Var.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        kl1Var.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        kl1Var.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(2);
        kl1Var.g = viewGroup.getChildAt(2);
        kl1Var.h = viewGroup.getChildAt(3);
        kl1Var.i = viewGroup.getChildAt(4);
        kl1Var.j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        kl1Var.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7738b(kl1 kl1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.N, viewGroup, false);
        m7737a(kl1Var, viewInflate);
        return viewInflate;
    }
}
