package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.tp4;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class up4 {
    /* JADX INFO: renamed from: a */
    public static void m9758a(tp4 tp4Var, View view) {
        tp4Var.g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tp4Var.h = viewGroup.getChildAt(0);
        tp4Var.i = viewGroup.getChildAt(1);
        tp4Var.j = viewGroup.getChildAt(2);
        tp4Var.k = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9759b(tp4 tp4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.d1, viewGroup, false);
        m9758a(tp4Var, viewInflate);
        return viewInflate;
    }
}
