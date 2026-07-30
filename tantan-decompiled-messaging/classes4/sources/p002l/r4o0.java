package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.q4o0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r4o0 {
    /* JADX INFO: renamed from: a */
    public static void m21773a(q4o0 q4o0Var, View view) {
        q4o0Var.e = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        q4o0Var.f = viewGroup.getChildAt(0);
        q4o0Var.g = (LinearLayout) viewGroup.getChildAt(1);
        q4o0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        q4o0Var.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        q4o0Var.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        q4o0Var.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        q4o0Var.l = (LinearLayout) viewGroup.getChildAt(2);
        q4o0Var.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        q4o0Var.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        q4o0Var.o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        q4o0Var.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m21774b(q4o0 q4o0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19802c8, viewGroup, false);
        m21773a(q4o0Var, viewInflate);
        return viewInflate;
    }
}
