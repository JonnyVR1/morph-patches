package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.tqa0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uqa0 {
    /* JADX INFO: renamed from: a */
    public static void m9761a(tqa0 tqa0Var, View view) {
        tqa0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqa0Var.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        tqa0Var.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        tqa0Var.x = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9762b(tqa0 tqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ja, viewGroup, false);
        m9761a(tqa0Var, viewInflate);
        return viewInflate;
    }
}
