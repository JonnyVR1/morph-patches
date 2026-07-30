package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.tqf0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uqf0 {
    /* JADX INFO: renamed from: a */
    public static void m9763a(tqf0 tqf0Var, View view) {
        tqf0Var.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tqf0Var.g = viewGroup.getChildAt(0);
        tqf0Var.h = viewGroup.getChildAt(1);
        tqf0Var.i = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9764b(tqf0 tqf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Vb, viewGroup, false);
        m9763a(tqf0Var, viewInflate);
        return viewInflate;
    }
}
