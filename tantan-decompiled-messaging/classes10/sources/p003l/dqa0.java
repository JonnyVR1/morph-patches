package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cqa0;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dqa0 {
    /* JADX INFO: renamed from: a */
    public static void m6194a(cqa0 cqa0Var, View view) {
        cqa0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cqa0Var.v = viewGroup.getChildAt(0);
        cqa0Var.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6195b(cqa0 cqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ha, viewGroup, false);
        m6194a(cqa0Var, viewInflate);
        return viewInflate;
    }
}
