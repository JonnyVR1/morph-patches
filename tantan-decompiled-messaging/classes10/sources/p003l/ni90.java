package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.mi90;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ni90 {
    /* JADX INFO: renamed from: a */
    public static void m8333a(mi90 mi90Var, View view) {
        mi90Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mi90Var.v = viewGroup.getChildAt(0);
        mi90Var.w = viewGroup.getChildAt(1);
        mi90Var.x = viewGroup.getChildAt(2);
        mi90Var.y = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8334b(mi90 mi90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.R9, viewGroup, false);
        m8333a(mi90Var, viewInflate);
        return viewInflate;
    }
}
