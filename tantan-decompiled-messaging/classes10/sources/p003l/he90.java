package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.ge90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class he90 {
    /* JADX INFO: renamed from: a */
    public static void m6953a(ge90 ge90Var, View view) {
        ge90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ge90Var.v = viewGroup.getChildAt(0);
        ge90Var.w = (LinearLayout) viewGroup.getChildAt(1);
        ge90Var.x = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ge90Var.y = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6954b(ge90 ge90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.O9, viewGroup, false);
        m6953a(ge90Var, viewInflate);
        return viewInflate;
    }
}
