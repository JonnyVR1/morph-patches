package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.h6c0;
import l.s1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t1l0 {
    /* JADX INFO: renamed from: a */
    public static void m9521a(s1l0 s1l0Var, View view) {
        s1l0Var.b = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s1l0Var.c = (FrameLayout) viewGroup.getChildAt(0);
        s1l0Var.d = (FrameLayout) viewGroup.getChildAt(1);
        s1l0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        s1l0Var.f = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9522b(s1l0 s1l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.D, viewGroup, false);
        m9521a(s1l0Var, viewInflate);
        return viewInflate;
    }
}
