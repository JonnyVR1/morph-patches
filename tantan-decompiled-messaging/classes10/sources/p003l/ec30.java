package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.yb30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ec30 {
    /* JADX INFO: renamed from: a */
    public static void m6284a(yb30 yb30Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yb30Var.a = viewGroup.getChildAt(0);
        yb30Var.b = viewGroup.getChildAt(1);
        yb30Var.c = viewGroup.getChildAt(2);
        yb30Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        yb30Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        yb30Var.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6285b(yb30 yb30Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.X1, viewGroup, false);
        m6284a(yb30Var, viewInflate);
        return viewInflate;
    }
}
