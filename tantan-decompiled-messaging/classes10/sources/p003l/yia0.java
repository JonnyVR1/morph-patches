package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.xia0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yia0 {
    /* JADX INFO: renamed from: a */
    public static void m11252a(xia0 xia0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xia0Var.a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        xia0Var.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        xia0Var.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        xia0Var.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11253b(xia0 xia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.E0, viewGroup, false);
        m11252a(xia0Var, viewInflate);
        return viewInflate;
    }
}
