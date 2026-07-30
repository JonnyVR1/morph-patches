package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.wq90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xq90 {
    /* JADX INFO: renamed from: a */
    public static void m10946a(wq90 wq90Var, View view) {
        wq90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wq90Var.v = viewGroup.getChildAt(0);
        wq90Var.w = viewGroup.getChildAt(1);
        wq90Var.x = viewGroup.getChildAt(2);
        wq90Var.y = viewGroup.getChildAt(3);
        wq90Var.z = viewGroup.getChildAt(4);
        wq90Var.A = viewGroup.getChildAt(5);
        wq90Var.B = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m10947b(wq90 wq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.X9, viewGroup, false);
        m10946a(wq90Var, viewInflate);
        return viewInflate;
    }
}
