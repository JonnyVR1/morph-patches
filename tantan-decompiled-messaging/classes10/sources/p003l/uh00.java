package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.th00;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uh00 {
    /* JADX INFO: renamed from: a */
    public static void m9722a(th00 th00Var, View view) {
        th00Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        th00Var.b = viewGroup.getChildAt(0);
        th00Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        th00Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        th00Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9723b(th00 th00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Oe, viewGroup, false);
        m9722a(th00Var, viewInflate);
        return viewInflate;
    }
}
