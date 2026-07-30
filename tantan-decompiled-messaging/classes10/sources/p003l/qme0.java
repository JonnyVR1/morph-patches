package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.pme0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qme0 {
    /* JADX INFO: renamed from: a */
    public static void m9022a(pme0 pme0Var, View view) {
        pme0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pme0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pme0Var.c = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        pme0Var.d = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        pme0Var.e = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m9023b(pme0 pme0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6071s4, viewGroup, false);
        m9022a(pme0Var, viewInflate);
        return viewInflate;
    }
}
