package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes13.dex */
public class j570 {
    /* JADX INFO: renamed from: a */
    public static void m143515a(h570 h570Var, View view) {
        h570Var.f107926y = (LinearLayout) view;
        h570Var.f107927z = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m143516b(h570 h570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173718n5, viewGroup, false);
        m143515a(h570Var, viewInflate);
        return viewInflate;
    }
}
