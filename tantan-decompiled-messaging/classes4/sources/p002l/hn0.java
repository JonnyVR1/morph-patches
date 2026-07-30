package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.gn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hn0 {
    /* JADX INFO: renamed from: a */
    public static void m14449a(gn0 gn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gn0Var.k = viewGroup.getChildAt(0);
        gn0Var.l = (LinearLayout) viewGroup.getChildAt(1);
        gn0Var.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gn0Var.n = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        gn0Var.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        gn0Var.p = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m14450b(gn0 gn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20022t7, viewGroup, false);
        m14449a(gn0Var, viewInflate);
        return viewInflate;
    }
}
