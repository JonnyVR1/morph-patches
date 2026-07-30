package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import l.n6c0;
import l.xn90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yn90 {
    /* JADX INFO: renamed from: a */
    public static void m11259a(xn90 xn90Var, View view) {
        xn90Var.a = (FrameLayout) view;
        xn90Var.b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11260b(xn90 xn90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.U0, viewGroup, false);
        m11259a(xn90Var, viewInflate);
        return viewInflate;
    }
}
