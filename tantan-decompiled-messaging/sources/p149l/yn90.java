package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class yn90 {
    /* JADX INFO: renamed from: a */
    public static void m215399a(xn90 xn90Var, View view) {
        xn90Var.f193649a = (FrameLayout) view;
        xn90Var.f193650b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m215400b(xn90 xn90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137326U0, viewGroup, false);
        m215399a(xn90Var, viewInflate);
        return viewInflate;
    }
}
