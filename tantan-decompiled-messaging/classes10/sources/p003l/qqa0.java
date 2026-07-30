package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.pqa0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qqa0 {
    /* JADX INFO: renamed from: a */
    public static void m9031a(pqa0 pqa0Var, View view) {
        pqa0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pqa0Var.v = viewGroup.getChildAt(0);
        pqa0Var.w = viewGroup.getChildAt(1);
        pqa0Var.x = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9032b(pqa0 pqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ia, viewGroup, false);
        m9031a(pqa0Var, viewInflate);
        return viewInflate;
    }
}
