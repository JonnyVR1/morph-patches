package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.h6n0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i6n0 {
    /* JADX INFO: renamed from: a */
    public static void m15034a(h6n0 h6n0Var, View view) {
        h6n0Var.e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        h6n0Var.f = viewGroup.getChildAt(0);
        h6n0Var.g = (LinearLayout) viewGroup.getChildAt(1);
        h6n0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        h6n0Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h6n0Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        h6n0Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m15035b(h6n0 h6n0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19739X7, viewGroup, false);
        m15034a(h6n0Var, viewInflate);
        return viewInflate;
    }
}
