package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ga60;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ha60 {
    /* JADX INFO: renamed from: a */
    public static void m6934a(ga60 ga60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ga60Var.a = viewGroup.getChildAt(0);
        ga60Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ga60Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6935b(ga60 ga60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.i, viewGroup, false);
        m6934a(ga60Var, viewInflate);
        return viewInflate;
    }
}
