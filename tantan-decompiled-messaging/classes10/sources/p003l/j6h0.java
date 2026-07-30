package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.i6h0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j6h0 {
    /* JADX INFO: renamed from: a */
    public static void m7374a(i6h0 i6h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i6h0Var.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        i6h0Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        i6h0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7375b(i6h0 i6h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f2, viewGroup, false);
        m7374a(i6h0Var, viewInflate);
        return viewInflate;
    }
}
