package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.qhi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rhi0 {
    /* JADX INFO: renamed from: a */
    public static void m9143a(qhi0 qhi0Var, View view) {
        qhi0Var.a = (FrameLayout) view;
        qhi0Var.b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9144b(qhi0 qhi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(j6c0.f5259a, viewGroup, false);
        m9143a(qhi0Var, viewInflate);
        return viewInflate;
    }
}
