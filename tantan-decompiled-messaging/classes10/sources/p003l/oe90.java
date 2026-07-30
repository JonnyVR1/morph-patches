package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.ne90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oe90 {
    /* JADX INFO: renamed from: a */
    public static void m8448a(ne90 ne90Var, View view) {
        ne90Var.u = (FrameLayout) view;
        ne90Var.v = (FrameLayout) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m8449b(ne90 ne90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.k9, viewGroup, false);
        m8448a(ne90Var, viewInflate);
        return viewInflate;
    }
}
