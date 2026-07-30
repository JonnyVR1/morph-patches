package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.m6c0;
import l.r5b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s5b0 {
    /* JADX INFO: renamed from: a */
    public static void m9232a(r5b0 r5b0Var, View view) {
        r5b0Var.m = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r5b0Var.n = viewGroup.getChildAt(0);
        r5b0Var.o = (LinearLayout) viewGroup.getChildAt(1);
        r5b0Var.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        r5b0Var.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        r5b0Var.r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9233b(r5b0 r5b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.j1, viewGroup, false);
        m9232a(r5b0Var, viewInflate);
        return viewInflate;
    }
}
