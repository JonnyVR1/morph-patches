package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.py0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qy0 {
    /* JADX INFO: renamed from: a */
    public static void m9063a(py0 py0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        py0Var.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        py0Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        py0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        py0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        py0Var.e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9064b(py0 py0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.G, viewGroup, false);
        m9063a(py0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m9065c(py0 py0Var) {
        py0Var.a = null;
        py0Var.b = null;
        py0Var.c = null;
        py0Var.d = null;
        py0Var.e = null;
    }
}
