package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.cwa0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dwa0 {
    /* JADX INFO: renamed from: a */
    public static void m6214a(cwa0 cwa0Var, View view) {
        cwa0Var.a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cwa0Var.b = viewGroup.getChildAt(0);
        cwa0Var.c = viewGroup.getChildAt(1);
        cwa0Var.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6215b(cwa0 cwa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q9, viewGroup, false);
        m6214a(cwa0Var, viewInflate);
        return viewInflate;
    }
}
