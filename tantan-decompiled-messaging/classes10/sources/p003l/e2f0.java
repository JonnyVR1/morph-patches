package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.d2f0;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e2f0 {
    /* JADX INFO: renamed from: a */
    public static void m6236a(d2f0 d2f0Var, View view) {
        d2f0Var.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d2f0Var.b = (LinearLayout) viewGroup.getChildAt(0);
        d2f0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d2f0Var.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        d2f0Var.e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6237b(d2f0 d2f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.P7, viewGroup, false);
        m6236a(d2f0Var, viewInflate);
        return viewInflate;
    }
}
