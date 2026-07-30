package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.j8q0;
import l.m6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l8q0 {
    /* JADX INFO: renamed from: a */
    public static void m7705a(j8q0 j8q0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j8q0Var.a = viewGroup.getChildAt(0);
        j8q0Var.b = (LinearLayout) viewGroup.getChildAt(1);
        j8q0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        j8q0Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7706b(j8q0 j8q0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.g2, viewGroup, false);
        m7705a(j8q0Var, viewInflate);
        return viewInflate;
    }
}
