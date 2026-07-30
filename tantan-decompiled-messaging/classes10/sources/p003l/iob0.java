package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.hob0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iob0 {
    /* JADX INFO: renamed from: a */
    public static void m7280a(hob0 hob0Var, View view) {
        hob0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hob0Var.g = viewGroup.getChildAt(0);
        hob0Var.h = viewGroup.getChildAt(1);
        hob0Var.i = viewGroup.getChildAt(2);
        hob0Var.j = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7281b(hob0 hob0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.o, viewGroup, false);
        m7280a(hob0Var, viewInflate);
        return viewInflate;
    }
}
