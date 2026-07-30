package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.e05;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g05 {
    /* JADX INFO: renamed from: a */
    public static void m6535a(e05 e05Var, View view) {
        e05Var.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        e05Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        e05Var.c = viewGroup.getChildAt(1);
        e05Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6536b(e05 e05Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.j1, viewGroup, false);
        m6535a(e05Var, viewInflate);
        return viewInflate;
    }
}
